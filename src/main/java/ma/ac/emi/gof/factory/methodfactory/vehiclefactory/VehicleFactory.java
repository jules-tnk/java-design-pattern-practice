package ma.ac.emi.gof.factory.methodfactory.vehiclefactory;

import ma.ac.emi.gof.factory.methodfactory.vehicle.Vehicle;

import java.util.Date;

public abstract class VehicleFactory {
    // METHODS
    public Vehicle createVehicle(String registrationNumber, Date serviceDate, String model, String brand){
        return fabricateVehicle(registrationNumber, serviceDate, model, brand);
    }

    protected abstract Vehicle fabricateVehicle(String registrationNumber, Date serviceDate, String model, String brand);
}
