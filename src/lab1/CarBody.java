package lab1;

public class CarBody {

    private CarBodyTop top;
    private CarBodyBottom bottom;
    private CarBodySubstructure substructure;

    public CarBody() {
        System.out.println("CarBody created!");
        this.top = new CarBodyTop();
        this.bottom = new CarBodyBottom();
        this.substructure = new CarBodySubstructure();
    }

    public void drawAt(int x, int y) {

        this.top.drawAt(x, y);
        this.bottom.drawAt(x, y);
        this.substructure.drawAt(x, y);

    }

}
