package Lab4;

import Lab4.CarCommand.Car;
import Lab4.CarCommand.ActionListenerCommand;
import Lab4.CarCommand.ActionSell;
import Lab4.CarCommand.ActionConstruct;
import Lab4.CarCommand.Invoker;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        ActionListenerCommand constructCommand = new ActionConstruct(car);
        ActionListenerCommand sellCommand = new ActionSell(car);

        Invoker invoker = new Invoker(constructCommand, sellCommand);

        invoker.checkConstruct();
        invoker.checkSell();

    }
}