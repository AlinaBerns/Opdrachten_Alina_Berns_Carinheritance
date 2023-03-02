package carinheritance;

public class ElectrischeWagen extends Car {

    private int battery;

    public int getSpeed() {
        return speed;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public ElectrischeWagen() {

    }

    public ElectrischeWagen(String color, int speed, int hp, int battery) {
        super(color, speed, hp);
        this.battery = battery;
    }

    public ElectrischeWagen(int battery) {
        super();
        this.battery = battery;
    }

    public void Acceleratie(int amount) {
        int currentSpeed = this.getSpeed() + (amount + this.getBattery() / 100);
        setSpeed(currentSpeed);
    }

    public void SlowDown(int amount) {
        int currentSpeed = this.getSpeed() - (amount + this.getBattery() / 100);
        setSpeed(currentSpeed);

    }

    @Override
    public String toString() {
        return "ElectrischeWagen: " +
                 super.toString() +
                ", battery= " + this.getBattery();
    }
}


