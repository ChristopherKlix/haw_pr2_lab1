package lab1;

import java.util.ArrayList;

public abstract class Car {
    // Attributes
    private CarManufacturer manufacturer;
    private String model;

    // Composition
    CarBody body;
    ArrayList<CarTire> tires;

    // Constructors

    public Car(CarManufacturer manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;

        this.body = new CarBody();
        this.tires = new ArrayList<CarTire>();

        System.out.println("Car created!");
    }

    public Car(CarManufacturer manufacturer) {
        this(manufacturer, "Generic");
    }

    public Car() {
        this(CarManufacturer.Generic, "Generic");
    }

    // Accessors

    public CarManufacturer getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    // Mutators

    public void setManufacturer(CarManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
