package ma.ac.emi.gof.factory.methodfactory;

import ma.ac.emi.gof.factory.methodfactory.vehicle.Vehicle;
import ma.ac.emi.gof.factory.methodfactory.vehiclefactory.VehicleFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalog {

    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    public VehicleFactory vehicleFactory;

    // SETTERS
    public void setVehicleFactory(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    // GETTERS
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    // METHODS
    public void createVehicle(String registrationNumber, Date serviceDate, String model, String brand){
        Vehicle newVehicle = vehicleFactory.createVehicle(registrationNumber, serviceDate, model, brand);
        vehicles.add(newVehicle);
    }

    @Override
    public String toString() {
        return "Catalog{\n" +
                "vehicles=\n" + vehicles +
                '}';
    }
}
