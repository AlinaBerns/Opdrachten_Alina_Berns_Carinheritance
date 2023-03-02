package carinheritance;

public class Cabrio extends Car {

    private boolean sunroof = true;

    public Cabrio () {
        this("DEFAULT", 0, 1);

    }

    public Cabrio(String color, int speed, int hp) {
        super(color, speed, hp);
    }

    public Cabrio(String color, int hp) {
        super(color, hp);
    }

    public Cabrio(int hp) {
        super(hp);
    }

    public boolean getRoof() {
        return sunroof;
    }

    public void setRoof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public String OpenRoof(boolean sunroof) {

        this.sunroof = sunroof;

        if (this.sunroof) {
            return "Open Roof";
        } else {
            return "Close Roof";
        }

    }
    public int getSpeed(int speed) {
        return speed;
    }

    @Override
    public String toString() {
        return "Cabrio: " +
                super.toString() + ", " +
                "sunroof: " + OpenRoof(true);
    }
}
