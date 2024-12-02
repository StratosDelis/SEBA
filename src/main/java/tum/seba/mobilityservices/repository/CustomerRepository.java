package tum.seba.mobilityservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tum.seba.mobilityservices.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
