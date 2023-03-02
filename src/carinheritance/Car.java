package carinheritance;

public class Car {

    private String color;
    protected int speed;
    private int hp;


    public Car() {
        this("DEFAULT", 0, 1);

    }

    public Car (String color, int speed, int hp) {
        setColor(color);
        setSpeed(speed);
        setHp(hp);

    }

    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }

    public Car(int hp) {
        this.hp = hp;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void Acceleratie (int amount){
        int currentSpeed = this.getSpeed() + (amount + this.getHp()/100);
        setSpeed(currentSpeed);
    }

    public void SlowDown (int amount) {
        int currentSpeed = this.getSpeed() - (amount + this.getHp()/100);
        setSpeed(currentSpeed);
    }

    public void Park (int currentSpeed) {
        while (currentSpeed!=0) {
            currentSpeed--;
        }
            this.speed = currentSpeed;
            System.out.println("Current speed (Park): " + this.speed);
    }

    @Override
    public String toString() {
        return "Car{ " +
                "color= " + this.getColor() + '\'' +
                ", speed= " + this.getSpeed() +
                ", hp= " + this.getHp() +
                '}';
    }
}


