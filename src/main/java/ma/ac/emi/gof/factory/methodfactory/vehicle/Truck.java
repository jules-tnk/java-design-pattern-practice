package ma.ac.emi.gof.factory.methodfactory.vehicle;

import java.util.Date;

public class Truck extends Vehicle {

    public Truck(String registrationNumber, Date serviceDate, String model, String brand) {
        super(registrationNumber, serviceDate, model, brand);
    }

    public Truck() {
    }
}
