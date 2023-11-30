package Lab4.CarCommand;

public class Invoker {

    private ActionListenerCommand construct, sell;

    public Invoker(ActionListenerCommand construct, ActionListenerCommand sell) {

        this.construct = construct;
        this.sell = sell;

    }

    public void checkConstruct() {

        construct.execute();

    }

    public void checkSell() {

        sell.execute();

    }
}
