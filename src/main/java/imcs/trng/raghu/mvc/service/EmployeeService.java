package imcs.trng.raghu.mvc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import imcs.trng.raghu.mvc.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees(int deptNo) throws SQLException;
	public Employee getEmployee(int empId) throws SQLException;
	public void deleteEmployee(int empId) throws SQLException;
	public boolean updateEmployee(Employee emp) throws SQLException;
	public int addEmployee(Employee emp) throws SQLException;
}
