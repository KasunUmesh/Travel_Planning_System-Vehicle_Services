package lk.ijse.Travel_Planning_System.VehicleServices.controller;


import lk.ijse.Travel_Planning_System.VehicleServices.dto.VehicleDTO;
import lk.ijse.Travel_Planning_System.VehicleServices.service.VehicleService;
import lk.ijse.Travel_Planning_System.VehicleServices.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping("/vehicle")
@CrossOrigin
public class VehicleControlle {

    @Autowired
    VehicleService vehicleService;

    @PostMapping(consumes =MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveVehicle(
                           @RequestPart("brand") String brand,
                           @RequestPart("category") String category,
                           @RequestPart("vehicleType") String vehicleType,
                           @RequestPart("fuelType") String fuelType,
                           @RequestPart("is_hybrid") String is_Hybrid,
                           @RequestPart("fuel_Usage") String fuel_Usage,
                           @RequestPart("is_auto") String is_Auto,
                           @RequestPart("no_of_seat") int no_of_seat,
                           @RequestPart("fee_for_day") int fee_for_day,
                           @RequestPart("fee_for_1km") int fee_for_1km,
                           @RequestPart("driver_name") String driver_name,
                           @RequestPart("driver_contact") String driver_contact,
                           @RequestPart("remark") String remark,
                           @RequestPart("side_img") byte[] side_img,
                           @RequestPart("front_img") byte[] front_img,
                           @RequestPart("back_img") byte[] back_img,
                           @RequestPart("front_interior") byte[] front_interior,
                           @RequestPart("back_interior") byte[] back_interior,
                           @RequestPart("license_f_img") byte[] license_f_img,
                           @RequestPart("license_b_img") byte[] license_b_img) {


        VehicleDTO vehicleDTO = new VehicleDTO( brand, category, vehicleType, fuelType,
                is_Hybrid, fuel_Usage, is_Auto, no_of_seat, fee_for_day, fee_for_1km,
                driver_name, driver_contact, remark, side_img, front_img, back_img,
                front_interior, back_interior, license_f_img, license_b_img
        );


        vehicleService.saveVehicle(vehicleDTO);
        return new ResponseUtil(200, "Success", null);

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllVehicle() {
        return new ResponseUtil(200, "Get All", vehicleService.getAllVehicle());
    }

}
