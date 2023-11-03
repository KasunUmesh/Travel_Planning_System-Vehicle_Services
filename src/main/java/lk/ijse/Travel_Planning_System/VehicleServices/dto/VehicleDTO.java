package lk.ijse.Travel_Planning_System.VehicleServices.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO implements Serializable {

    @Null(message = "Admin ID will auto generate")
    private Integer vehicleId;
    @NotNull(message = "Brand Cannot be empty")
    private String brand;
    @NotNull(message = "Category Cannot be empty")
    private String category;
    @NotNull(message = "Vehicle Type Cannot be empty")
    private String vehicleType;
    @NotNull(message = "Fuel Type Cannot be empty")
    private String fuelType;
    @NotNull(message = "Is hybrid Cannot be empty")
    private String is_hybrid;
    @NotNull(message = "Fuel Usage Cannot be empty")
    private String fuel_usage;
    @NotNull(message = "Is Auto Cannot be empty")
    private String is_auto;
    @NotNull(message = "No of Seat Cannot be empty")
    private int no_of_seat;
    @NotNull(message = "Driver Name Cannot be empty")
    private String driver_name;
    @NotNull(message = "Drive Contact Cannot be empty")
    private String drivel_contact;
    private String remark;
    private String side_img;
    private String front_img;
    private String back_img;
    private String front_interior;
    private String back_interior;
    private String license_f_img;
    private String license_b_img;
}
