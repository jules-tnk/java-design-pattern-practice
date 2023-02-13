package ma.ac.emi.gof.factory.methodfactory;

import ma.ac.emi.gof.factory.methodfactory.vehiclefactory.CarFactory;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // add cars
        catalog.setVehicleFactory(CarFactory.getInstance());
        catalog.createVehicle("AB1234", new Date(2000, Calendar.NOVEMBER,10), "Car", "BMW");
        catalog.createVehicle("AB1235", new Date(2000, Calendar.JANUARY,11), "Car", "BMW");
        catalog.createVehicle("AB54321", new Date(2000, Calendar.FEBRUARY,12), "Car", "BMW");

        // add truck
        catalog.setVehicleFactory(CarFactory.getInstance());
        catalog.createVehicle("BC1234", new Date(2001, Calendar.NOVEMBER,10), "Truck", "IDK");
        catalog.createVehicle("BC1235", new Date(2001, Calendar.AUGUST,15), "truck", "IDK");
        catalog.createVehicle("ZE54321", new Date(2005, Calendar.NOVEMBER,20), "Truck", "IDK");

        // add motorcycle
        catalog.setVehicleFactory(CarFactory.getInstance());
        catalog.createVehicle("ER1234", new Date(2010, Calendar.JULY,5), "Motorcycle", "MTR");
        catalog.createVehicle("PM1235", new Date(1995, Calendar.DECEMBER,11), "Motorcycle", "MTR");
        catalog.createVehicle("DF54321", new Date(2008, Calendar.NOVEMBER,2), "Motorcycle", "MTR");

        // print result
        System.out.println(catalog);

    }
}
