package Lab3.Vehicles;

public class VehicleAdapter implements Bycicle {
    
    Vehicle vehicle;

    public VehicleAdapter(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void makeSound1() {
        vehicle.makeSound();
    }
}
