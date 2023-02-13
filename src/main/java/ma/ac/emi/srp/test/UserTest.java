/*
package ma.ac.emi.poo.test;



import ma.ac.emi.srp.entity.User;
import ma.ac.emi.srp.service.UserService;
import ma.ac.emi.srp.validator.service.UserValidatorStandard;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        testValidation();
    }

    static void testValidation(){
        User user1 = new User("Juju", "juju@gmail.com", 608523695);
        User user2 = new User("Riri", "riri@gmail.com", 6085236);
        User user3 = new User("Loulou", "loulou@gmailcom", 60852);
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        UserService userService = new UserService();

        userService.setUserValidator(new UserValidatorStandard());

        if (userService.getUserValidator().validate(user3)){
            System.out.println("User " + user3 + " VALIDE");
        }
        else {
            System.out.println("User " + user3 + " NON VALIDE");
        }

        */
/*Employee emp2 = new Employee("Loulou", 145, 9000);
        Employee emp3 = new Employee("Riri", 150, 50000);
        Employee emp4 = new Employee("Nounou", 105, 15000);

        EmployeeService service = new EmployeeService();
        service.setSorter(new SorterBySalary());
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);*//*

    }
}
*/
