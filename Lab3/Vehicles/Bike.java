package Lab3.Vehicles;

public class Bike extends Machine{

    public Bike(Workshop garage1, Workshop garage2) {
        super(garage1, garage2);
    }

    public void manufacture(){
        System.out.println("Bike");
        garage1.work();
        garage2.work();
    }
    
}
