package Lab3.Vehicles;

public class Tank extends Machine{
    
    public Tank(Workshop garage1, Workshop garage2) {
        super (garage1, garage2);
    }

    public void manufacture() {
        System.out.println("Tank");
        garage1.work();
        garage2.work();
    }

}
