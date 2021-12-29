package institute.decagon.springrestdemo.repository;

import institute.decagon.springrestdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
