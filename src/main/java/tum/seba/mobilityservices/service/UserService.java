package tum.seba.mobilityservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tum.seba.mobilityservices.entity.Customer;
import tum.seba.mobilityservices.entity.Employee;
import tum.seba.mobilityservices.repository.CustomerRepository;
import tum.seba.mobilityservices.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    //Save Methods
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //FindAll Methods
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    //FindById Methods
    public Customer findCustomerById(int customerId) {
        Optional<Customer> foundCustomer = customerRepository.findById(customerId);
        return foundCustomer.orElse(null);
    }

    public Employee findEmployeeById(int employeeId) {
        Optional<Employee> foundEmployee = employeeRepository.findById(employeeId);
        return foundEmployee.orElse(null);
    }

    //Delete Methods
    public void deleteCustomerById(int customerId) {
        try {
            customerRepository.deleteById(customerId);
        } catch (Exception e) {
            System.out.println("Could not delete Customer with ID: " + customerId);
        }
    }

    public void deleteEmployeeById(int employeeId) {
        try {
            employeeRepository.deleteById(employeeId);
        } catch (Exception e) {
            System.out.println("Could not delete Employee with ID: " + employeeId);
        }
    }
}
