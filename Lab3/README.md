# **Author : Igor Mihailiuc**

# Topic : *Structural design patterns*

## Objectives:
1. Study and understand the Structural Design Patterns.
2. As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.
3. Implement some additional functionalities, or create a new project using structural design patterns.

# Implementation
- For this laboratory work, I've implemented a example of different vehicles I've decided to implement ***Adapter pattern*** and the ***Bridge pattern***. Here are some examples:

1. ***Adapter pattern*** :
The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
```
public class VehicleAdapter implements Bycicle {
    
    Vehicle vehicle;

    public VehicleAdapter(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void makeSound1() {
        vehicle.makeSound();
    }
}
```

2. ***Bridge pattern*** :
The Bridge design pattern allows you to separate the abstraction from the implementation.
```
Machine vehicle1 = new Tank(new Produce(), new Assemble());
    vehicle1.manufacture();

Machine vehicle2 = new Bike(new Produce(), new Assemble());
    vehicle2.manufacture();
```

# Conclusion

In conclusion I want to say that this laboratory wokr made me capable of implementing some new important stuff like the structural design patterns, and that those help us write a cleaner code and easier to understand.