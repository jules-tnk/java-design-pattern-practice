package ma.ac.emi.gof.factory.methodfactory.vehiclefactory;

import ma.ac.emi.gof.factory.methodfactory.vehicle.Motorcycle;
import ma.ac.emi.gof.factory.methodfactory.vehicle.Vehicle;

import java.util.Date;

public class MotorcycleFactory extends VehicleFactory{

    public static MotorcycleFactory instance = null;

    // CONSTRUCTORS
    public MotorcycleFactory(){}
    // METHODS
    public static MotorcycleFactory getInstance(){
        if (instance == null){
            instance = new MotorcycleFactory();
        }
        return instance;
    }
    @Override
    protected Vehicle fabricateVehicle(String registrationNumber, Date serviceDate, String model, String brand) {
        return new Motorcycle(registrationNumber, serviceDate, model, brand);
    }
}
