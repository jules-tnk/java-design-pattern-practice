package ma.ac.emi.gof.factory.methodfactory.vehicle;

import java.util.Date;

public class Motorcycle extends Vehicle{
    public Motorcycle(String registrationNumber, Date serviceDate, String model, String brand) {
        super(registrationNumber, serviceDate, model, brand);
    }

    public Motorcycle() {
    }
}
