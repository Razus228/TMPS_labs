package Lab3;

import Lab3.Vehicles.VehicleAdapter;
import Lab3.Vehicles.ConcreteBycicle;
import Lab3.Vehicles.Vehicle;
import Lab3.Vehicles.Assemble;
import Lab3.Vehicles.Bike;
import Lab3.Vehicles.Bycicle;
import Lab3.Vehicles.Car;
import Lab3.Vehicles.Tank;
import Lab3.Vehicles.Machine;
import Lab3.Vehicles.Produce;




public class Main {
    public static void main(String[] args){

        Vehicle car = new Car();
        Bycicle bycicle = new ConcreteBycicle();
        Bycicle vehicleAdapter = new VehicleAdapter(car);

        System.out.println("Car");
        car.drive();
        car.makeSound();

        System.out.println("Bycicle");
        bycicle.makeSound1();

        System.out.println("vehicleAdapter");
        vehicleAdapter.makeSound1();

        Machine vehicle1 = new Tank(new Produce(), new Assemble());
        vehicle1.manufacture();

        Machine vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
