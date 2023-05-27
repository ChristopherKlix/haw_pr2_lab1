package game;

/**
 * A class that represents a Tesla.
 */
public abstract class Tesla extends Car {
    public Tesla(String model) {
        super(CarManufacturer.TESLA, model);

        this.tires.add(new CarTire());
        this.tires.add(new CarTire());
    }
}
