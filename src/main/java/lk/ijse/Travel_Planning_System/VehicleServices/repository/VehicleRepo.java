package lk.ijse.Travel_Planning_System.VehicleServices.repository;

import lk.ijse.Travel_Planning_System.VehicleServices.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {
    Vehicle save(Vehicle vehicle);
}
