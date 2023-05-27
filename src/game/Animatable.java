package game;

public interface Animatable {
    public void update();

    // Accessor and mutator methods for velocity

    public void setVelocity(Velocity velocity);

    public Velocity getVelocity();

    // Accessors and mutators for velocityX and velocityY

    public void setVelocityX(int velocityX);

    public int getVelocityX();

    public void setVelocityY(int velocityY);

    public int getVelocityY();
}
