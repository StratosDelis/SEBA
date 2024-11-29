package tum.seba.mobilityservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tum.seba.mobilityservices.entity.ServicePoint;

public interface ServicePointRepository extends JpaRepository<ServicePoint,Integer> {

}
