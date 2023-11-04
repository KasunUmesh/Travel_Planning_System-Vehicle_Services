package lk.ijse.Travel_Planning_System.VehicleServices.dto;

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
    @NotNull(message = "fee for day Cannot be empty")
    private int fee_for_day;
    @NotNull(message = "fee for 1km Cannot be empty")
    private int fee_for_1km;
    @NotNull(message = "Driver Name Cannot be empty")
    private String driver_name;
    @NotNull(message = "Drive Contact Cannot be empty")
    private String drivel_contact;
    private String remark;
    private byte[] side_img;
    private byte[] front_img;
    private byte[] back_img;
    private byte[] front_interior;
    private byte[] back_interior;
    private byte[] license_f_img;
    private byte[] license_b_img;

    public VehicleDTO(String brand, String category, String vehicleType, String fuelType, String is_hybrid, String fuel_usage, String is_auto, int no_of_seat, int fee_for_day, int fee_for_1km, String driver_name, String drivel_contact, String remark, byte[] side_img, byte[] front_img, byte[] back_img, byte[] front_interior, byte[] back_interior, byte[] license_f_img, byte[] license_b_img) {
        this.brand = brand;
        this.category = category;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.is_hybrid = is_hybrid;
        this.fuel_usage = fuel_usage;
        this.is_auto = is_auto;
        this.no_of_seat = no_of_seat;
        this.fee_for_day = fee_for_day;
        this.fee_for_1km = fee_for_1km;
        this.driver_name = driver_name;
        this.drivel_contact = drivel_contact;
        this.remark = remark;
        this.side_img = side_img;
        this.front_img = front_img;
        this.back_img = back_img;
        this.front_interior = front_interior;
        this.back_interior = back_interior;
        this.license_f_img = license_f_img;
        this.license_b_img = license_b_img;
    }
}
