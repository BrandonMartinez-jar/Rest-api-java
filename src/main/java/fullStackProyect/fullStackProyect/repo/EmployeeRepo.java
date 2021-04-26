package fullStackProyect.fullStackProyect.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import fullStackProyect.fullStackProyect.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);
	

}
