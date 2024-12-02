package tum.seba.mobilityservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tum.seba.mobilityservices.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
