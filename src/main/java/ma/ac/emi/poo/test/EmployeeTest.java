package ma.ac.emi.poo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ma.ac.emi.poo.dao.IEEmployeeDao;
import ma.ac.emi.poo.entity.Employee;
import ma.ac.emi.poo.service.EmployeeService;
import ma.ac.emi.poo.service.IEmployeeService;
import ma.ac.emi.poo.service.sort.SorterByName;
import ma.ac.emi.poo.service.sort.SorterBySalary;


public class EmployeeTest {

    public static void main(String[] args) {
        testSort();
    }

    void test1() {
        try {
            Scanner scanner;

            scanner = new Scanner(new File("config.txt"));

            // TODO Auto-generated catch block


            String daov1 = scanner.nextLine();
            String daoV2 = scanner.nextLine();
            String serviceName = scanner.nextLine();
            IEEmployeeDao dao = (IEEmployeeDao) Class.forName(daov1).newInstance();

            IEmployeeService service = (IEmployeeService) Class.forName(serviceName).newInstance();


            service.setDao(dao);
            System.out.println("traitement avec dao v1");
            service.showAll();
            System.out.println("********************************** \n");

            dao = (IEEmployeeDao) Class.forName(daoV2).newInstance();


            service.setDao(dao);

            System.out.println("traitement avec dao v2");
            service.showAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void testSort() {
        Employee emp1 = new Employee("Juju", 152, 10000);
        Employee emp2 = new Employee("Loulou", 145, 9000);
        Employee emp3 = new Employee("Riri", 150, 50000);
        Employee emp4 = new Employee("Nounou", 105, 15000);

        EmployeeService service = new EmployeeService();
        service.setSorter(new SorterBySalary());
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        employees.sort((Employee e1, Employee e2)-> service.sortEmployee(e1, e2));
        System.out.println("\nTri par salaire************************");
        employees.forEach(System.out::println);

        service.setSorter(new SorterByName());
        System.out.println("\nTri par nom***************************");
        employees.sort((Employee e1, Employee e2)-> service.sortEmployee(e1, e2));
        employees.forEach(System.out::println);
    }

}
