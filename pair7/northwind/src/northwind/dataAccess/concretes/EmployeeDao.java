package northwind.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import northwind.dataAccess.abctracts.EmployeeRepository;
import northwind.entities.concretes.Employee;

public class EmployeeDao implements EmployeeRepository{
	
	List<Employee> employees;
	
	public EmployeeDao() {
		employees = new ArrayList<Employee>();
	}
	
	@Override
	public void add(Employee employee) {
		this.employees.add(employee);		
	}
	
	@Override
	public List<Employee> getAll() {
		return this.employees;
	}

	@Override
	public void delete(Employee t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
