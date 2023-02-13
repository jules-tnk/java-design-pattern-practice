package ma.ac.emi.gof.factory.methodfactory.vehicle;

import java.util.Date;

public class Car extends Vehicle {
    public Car(String registrationNumber, Date serviceDate, String model, String brand) {
        super(registrationNumber, serviceDate, model, brand);
    }

    public Car() {
        super();
    }
}
