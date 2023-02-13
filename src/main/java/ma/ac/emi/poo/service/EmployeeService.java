package ma.ac.emi.poo.service;

import java.util.List;

import ma.ac.emi.poo.dao.IEEmployeeDao;
import ma.ac.emi.poo.entity.*;
import ma.ac.emi.poo.service.salaire.ICalculSalaire;
import ma.ac.emi.poo.service.sort.ISorter;

public class EmployeeService implements IEmployeeService {
	private ICalculSalaire calculSalaire;

    private ISorter sorter;

    private IEEmployeeDao dao;

    public EmployeeService() {
    }

    public EmployeeService(IEEmployeeDao d) {
        this.dao = d;
        this.setDao(d);
    }

    public void setDao(IEEmployeeDao d) {
        this.dao = d;
    }

    @Override
    public List<Employee> showAll() {
        System.out.println("affichage des employees : ");
        return this.dao.getAll();
    }

    void setCalculSalaire(ICalculSalaire calculSalaire){
        this.calculSalaire = calculSalaire;
    }

    @Override
    public double salaireNet(Employee emp) {
        return calculSalaire.getSalaire();
    }

    @Override
    public int sortEmployee(Employee e1, Employee e2) {
        return this.sorter.compare(e1, e2);
    }

    public void setSorter(ISorter sorter){
        this.sorter = sorter;
    }

}
