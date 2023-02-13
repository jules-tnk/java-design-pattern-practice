package ma.ac.emi.poo.dao;

import java.util.List;

import ma.ac.emi.poo.entity.Employee;

public interface IEEmployeeDao {
	List<Employee>getAll();
	Employee getEmployeById(int id);

}
