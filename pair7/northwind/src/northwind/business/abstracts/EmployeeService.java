package northwind.business.abstracts;

import java.util.List;

import northwind.entities.concretes.Employee;

public interface EmployeeService {
	void add(Employee employee);
	List<Employee> getAll();
}
