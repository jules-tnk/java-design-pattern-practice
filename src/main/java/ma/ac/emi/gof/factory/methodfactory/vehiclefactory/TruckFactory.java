package ma.ac.emi.gof.factory.methodfactory.vehiclefactory;

import ma.ac.emi.gof.factory.methodfactory.vehicle.Truck;
import ma.ac.emi.gof.factory.methodfactory.vehicle.Vehicle;

import java.util.Date;

public class TruckFactory extends VehicleFactory{
    public static TruckFactory instance = null;

    // CONSTRUCTORS
    public TruckFactory(){}
    // METHODS
    public static TruckFactory getInstance(){
        if (instance == null){
            instance = new TruckFactory();
        }
        return instance;
    }

    @Override
    protected Vehicle fabricateVehicle(String registrationNumber, Date serviceDate, String model, String brand) {
        return new Truck(registrationNumber, serviceDate, model, brand);
    }
}
