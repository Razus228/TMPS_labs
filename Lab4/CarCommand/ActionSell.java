package Lab4.CarCommand;

public class ActionSell implements ActionListenerCommand {
    
    private Car car;

    public ActionSell(Car car) {

        this.car = car;

    }

    public void execute() {

        car.sell();

    }
}
