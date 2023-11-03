package lk.ijse.Travel_Planning_System.VehicleServices.util;


import lk.ijse.Travel_Planning_System.VehicleServices.dto.VehicleDTO;
import lk.ijse.Travel_Planning_System.VehicleServices.entity.Vehicle;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DataTypeConversion {

    private final ModelMapper modelMapper;

    DataTypeConversion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public VehicleDTO getVehicleDTO(Vehicle vehicle) {
        return modelMapper.map(vehicle, VehicleDTO.class);
    }

    public Vehicle getVehicleEntity(VehicleDTO vehicleDTO) {
        return modelMapper.map(vehicleDTO, Vehicle.class);
    }
}
