package lk.ijse.Travel_Planning_System.VehicleServices.service.impl;

import lk.ijse.Travel_Planning_System.VehicleServices.dto.VehicleDTO;
import lk.ijse.Travel_Planning_System.VehicleServices.repository.VehicleRepo;
import lk.ijse.Travel_Planning_System.VehicleServices.service.VehicleService;
import lk.ijse.Travel_Planning_System.VehicleServices.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VehicleServiceIMPL implements VehicleService {

    @Autowired
    private DataTypeConversion dataTypeConversion;

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicle) {
        return dataTypeConversion.getVehicleDTO(vehicleRepo.save(dataTypeConversion.getVehicleEntity(vehicle)));
    }
}
