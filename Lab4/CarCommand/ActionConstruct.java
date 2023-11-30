package Lab4.CarCommand;

public class ActionConstruct implements ActionListenerCommand {
    
    private Car car;

    public ActionConstruct(Car car) {

        this.car = car;

    }

    public void execute() {

        car.construct();

    }

}
