package dev.week7_nguyenductai_21024541.backend.services.implement;

import dev.week7_nguyenductai_21024541.backend.models.Customer;
import dev.week7_nguyenductai_21024541.backend.models.Employee;
import dev.week7_nguyenductai_21024541.backend.repositories.EmployeeRepository;
import dev.week7_nguyenductai_21024541.backend.services.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IServices<Employee, Long> {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }
}
