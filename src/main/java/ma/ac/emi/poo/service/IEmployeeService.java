package ma.ac.emi.poo.service;

import java.util.List;

import ma.ac.emi.poo.dao.EmployeeDaoImpV1;
import ma.ac.emi.poo.dao.IEEmployeeDao;
import ma.ac.emi.poo.entity.Employee;

public interface IEmployeeService {
      void setDao(IEEmployeeDao d) ;

	 List<Employee> showAll();
		
     double salaireNet(Employee emp);

     int sortEmployee(Employee e1, Employee e2);
}
