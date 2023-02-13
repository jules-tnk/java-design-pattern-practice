package ma.ac.emi.gof.factory.methodfactory.vehicle;

import java.util.Date;

public abstract class Vehicle {
    private String registrationNumber;
    private Date serviceDate;
    private String model;
    private String brand;

    // GETTERS
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    // SETTERS
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // CONSTRUCTORS
    public Vehicle() {
    }

    public Vehicle(String registrationNumber, Date serviceDate, String model, String brand) {
        setRegistrationNumber(registrationNumber);
        setServiceDate(serviceDate);
        setModel(model);
        setBrand(brand);
    }

    // METHODS

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", serviceDate=" + serviceDate +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", class=" + this.getClass() +
                "}\n";
    }
}
