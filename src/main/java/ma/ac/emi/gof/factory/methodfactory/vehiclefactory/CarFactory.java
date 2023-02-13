package ma.ac.emi.gof.factory.methodfactory.vehiclefactory;

import ma.ac.emi.gof.factory.methodfactory.vehicle.Car;
import ma.ac.emi.gof.factory.methodfactory.vehicle.Vehicle;

import java.util.Date;

public class CarFactory extends VehicleFactory {
    private static CarFactory instance = null;

    // CONSTRUCTORS
    private CarFactory(){}
    // METHODS
    public static CarFactory getInstance(){
        if (instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    @Override
    protected Vehicle fabricateVehicle(String registrationNumber, Date serviceDate, String model, String brand) {
        return new Car(registrationNumber, serviceDate, model, brand);
    }
}
