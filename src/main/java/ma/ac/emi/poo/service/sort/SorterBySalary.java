package ma.ac.emi.poo.service.sort;

import ma.ac.emi.poo.entity.Employee;

public class SorterBySalary implements ISorter{
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary() > e2.getSalary() ? 1: -1;
    }
}
