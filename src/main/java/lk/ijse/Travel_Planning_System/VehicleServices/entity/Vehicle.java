package lk.ijse.Travel_Planning_System.VehicleServices.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vehicle implements SuperEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vehicleId;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String vehicleType;
    @Column(nullable = false)
    private String fuelType;
    @Column(nullable = false)
    private String is_hybrid;
    @Column(nullable = false)
    private String fuel_usage;
    @Column(nullable = false)
    private String is_auto;
    @Column(nullable = false)
    private int no_of_seat;
    @Column(nullable = false)
    private int fee_for_day;
    @Column(nullable = false)
    private int fee_for_1km;
    @Column(nullable = false)
    private String driver_name;
    @Column(nullable = false)
    private String drivel_contact;
    private String remark;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] side_img;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] front_img;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] back_img;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] front_interior;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] back_interior;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] license_f_img;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] license_b_img;

}
