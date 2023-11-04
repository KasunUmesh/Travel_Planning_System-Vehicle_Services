package lk.ijse.Travel_Planning_System.VehicleServices.service.impl;

import lk.ijse.Travel_Planning_System.VehicleServices.dto.VehicleDTO;
import lk.ijse.Travel_Planning_System.VehicleServices.entity.Vehicle;
import lk.ijse.Travel_Planning_System.VehicleServices.exception.InvalidException;
import lk.ijse.Travel_Planning_System.VehicleServices.repository.VehicleRepo;
import lk.ijse.Travel_Planning_System.VehicleServices.service.VehicleService;
import lk.ijse.Travel_Planning_System.VehicleServices.util.DataTypeConversion;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleServiceIMPL implements VehicleService {

    @Autowired
    private DataTypeConversion dataTypeConversion;

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicle) {
        return dataTypeConversion.getVehicleDTO(vehicleRepo.save(dataTypeConversion.getVehicleEntity(vehicle)));
    }

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return mapper.map(vehicleRepo.findAll(), new TypeToken<List<VehicleDTO>>() {}.getType());
    }
}
