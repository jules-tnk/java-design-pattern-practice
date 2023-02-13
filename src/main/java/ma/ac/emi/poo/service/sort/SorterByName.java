package ma.ac.emi.poo.service.sort;

import ma.ac.emi.poo.entity.Employee;

public class SorterByName implements ISorter{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
