package lk.ijse.Travel_Planning_System.VehicleServices.controller;

import jakarta.validation.Valid;
import lk.ijse.Travel_Planning_System.VehicleServices.dto.VehicleDTO;
import lk.ijse.Travel_Planning_System.VehicleServices.service.VehicleService;
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
    private final VehicleService vehicleService;

    public VehicleControlle(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE}, path = "/save")
    VehicleDTO saveVehicle(@Valid
                           @RequestPart("brand") String brand,
                           @RequestPart("category") String category,
                           @RequestPart("vehicleType") String vehicleType,
                           @RequestPart("fuelType") String fuelType,
                           @RequestPart("is_hybrid") String is_Hybrid,
                           @RequestPart("fuel_Usage") String fuel_Usage,
                           @RequestPart("is_auto") String is_Auto,
                           @RequestPart("no_of_seat") int no_of_seat,
                           @RequestPart("driver_name") String driver_name,
                           @RequestPart("driver_contact") String driver_contact,
                           @RequestPart("remark") String remark,
                           @RequestPart("side_img") MultipartFile side_img,
                           @RequestPart("front_img") MultipartFile front_img,
                           @RequestPart("back_img") MultipartFile back_img,
                           @RequestPart("front_interior") MultipartFile front_interior,
                           @RequestPart("back_interior") MultipartFile back_interior,
                           @RequestPart("license_f_img") MultipartFile license_f_img,
                           @RequestPart("license_b_img") MultipartFile license_b_img, Errors errors) {


        String sideImgName = StringUtils.cleanPath(side_img.getOriginalFilename());
        String frontImgName = StringUtils.cleanPath(front_img.getOriginalFilename());
        String backImgName = StringUtils.cleanPath(back_img.getOriginalFilename());
        String frontInteriorName = StringUtils.cleanPath(front_interior.getOriginalFilename());
        String backInteriorName = StringUtils.cleanPath(back_interior.getOriginalFilename());
        String licenseFname = StringUtils.cleanPath(license_f_img.getOriginalFilename());
        String LicenseBname = StringUtils.cleanPath(license_b_img.getOriginalFilename());

        if (sideImgName.contains("") || frontImgName.contains("") || backImgName.contains("") || frontInteriorName.contains("") || backInteriorName.contains("") || licenseFname.contains("") || licenseBname.contains("")) {
            System.out.println("Not a valid file name");
        }

        String convertsideImg;
        String convertfrontImg;
        String convertbackImg;
        String convertfrontInterior;
        String convertbackInterior;
        String convertlicenseF;
        String convertLicenseB;

        try {
            convertsideImg = Base64.getEncoder().encodeToString(side_img.getBytes());
            convertfrontImg = Base64.getEncoder().encodeToString(front_img.getBytes());
            convertbackImg = Base64.getEncoder().encodeToString(back_img.getBytes());
            convertfrontInterior = Base64.getEncoder().encodeToString(front_interior.getBytes());
            convertbackInterior = Base64.getEncoder().encodeToString(back_interior.getBytes());
            convertlicenseF = Base64.getEncoder().encodeToString(license_f_img.getBytes());
            convertLicenseB = Base64.getEncoder().encodeToString(license_b_img.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (errors.hasFieldErrors()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errors.getFieldErrors().get(0).getDefaultMessage());

        }

        VehicleDTO vehicleDTO = new VehicleDTO();

        vehicleDTO.setBrand(brand);
        vehicleDTO.setCategory(category);
        vehicleDTO.setVehicleType(vehicleType);
        vehicleDTO.setFuelType(fuelType);
        vehicleDTO.setIs_hybrid(is_Hybrid);
        vehicleDTO.setFuel_usage(fuel_Usage);
        vehicleDTO.setIs_auto(is_Auto);
        vehicleDTO.setNo_of_seat(no_of_seat);
        vehicleDTO.setDriver_name(driver_name);
        vehicleDTO.setDrivel_contact(driver_contact);
        vehicleDTO.setRemark(remark);
        vehicleDTO.setSide_img(convertsideImg);
        vehicleDTO.setFront_img(convertfrontImg);
        vehicleDTO.setBack_img(convertbackImg);
        vehicleDTO.setFront_interior(convertfrontInterior);
        vehicleDTO.setBack_interior(convertbackInterior);
        vehicleDTO.setLicense_f_img(convertlicenseF);
        vehicleDTO.setLicense_b_img(convertLicenseB);

        return vehicleService.saveVehicle(vehicleDTO);

    }

}
