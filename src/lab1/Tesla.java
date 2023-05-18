package lab1;

/**
 * A class that represents a Tesla.
 */
public class Tesla {

    private CarBody body;
    private CarTire[] tires;

    public Tesla() {
        this(1);
    }

    public Tesla(int scaleFactor) {
        System.out.println("Tesla created!");

        this.body = new CarBody();
        this.tires = new CarTire[2];

        for (int i = 0; i < this.tires.length; i++) {
            this.tires[i] = new CarTire();
        }
    }

    public void drawAt(int x, int y) {
        this.body.drawAt(x, y);

        this.tires[0].drawAt(x + 20, y + 15);
        this.tires[1].drawAt(x + 200, y + 15);
    }

}
