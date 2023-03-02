package carinheritance;

public class SUV extends Car {

    private boolean bullbar;
    private boolean Driving4X4;

    public SUV (){
        this("DEFAULT", 0, 1);
    }



    public SUV(String color, int speed, int hp) {
        super(color, speed, hp);
    }

    public SUV(String color, int hp) {
        super(color, hp);
    }

    public SUV(int hp) {
        super(hp);
    }

    public boolean getBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public boolean isDriving4X4() {
        return Driving4X4;
    }

    public void setDriving4X4(boolean driving4X4) {
        Driving4X4 = driving4X4;
    }
    public void driving4x4() {
        this.setDriving4X4(!this.isDriving4X4());
    }

    @Override
    public void Acceleratie (int amount){
        int currentSpeed = this.getSpeed() + (amount + this.getHp()/100);
        setSpeed(currentSpeed);

        if (this.isDriving4X4()&&this.getSpeed() > 30) {
            this.setSpeed(30);
        }


    }
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "SUV: " +
                super.toString() +
                ", bullbar: " + this.getBullbar() +
                ", " + "Driving4X4: " + this.isDriving4X4();
    }
}