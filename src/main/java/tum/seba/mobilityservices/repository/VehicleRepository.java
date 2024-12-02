package tum.seba.mobilityservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tum.seba.mobilityservices.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
