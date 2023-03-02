package carinheritance;

public class Main {
    public static void main(String[] args) {

        SUV suv1 = new SUV("RED", 25, 200);
        suv1.Acceleratie(50);
        System.out.println("SUV SPEED: " + suv1.getSpeed() + "\n"+ "Driving4X4: " + suv1.isDriving4X4());

        Cabrio cabrio1 = new Cabrio("YELLOW", 25, 200);
        cabrio1.Acceleratie(50);
        System.out.println("CABRIO SPEED: " + cabrio1.getSpeed());

        ElectrischeWagen electrischeWagen1 = new ElectrischeWagen("GREEN", 25, 200, 60);
        electrischeWagen1.Acceleratie(50);
        System.out.println("ELECTRISCHEWAGEN SPEED: " + electrischeWagen1.getSpeed());


        Car [] carArray = {suv1, cabrio1, electrischeWagen1};

        for (Car car:carArray){
            car.Park(0);

        }

        System.out.println(suv1+ "\n" + cabrio1 + "\n" + electrischeWagen1);
    }
}
