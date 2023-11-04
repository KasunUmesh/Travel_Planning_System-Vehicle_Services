package lk.ijse.Travel_Planning_System.VehicleServices.service;

import lk.ijse.Travel_Planning_System.VehicleServices.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {

    VehicleDTO saveVehicle(VehicleDTO vehicle);

    List<VehicleDTO> getAllVehicle();
}
