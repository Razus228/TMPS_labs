package Lab3.Vehicles;

public abstract class Machine {
    
    protected Workshop garage1;
    protected Workshop garage2;

    protected Machine(Workshop garage1, Workshop garage2) {

        this.garage1 = garage1;
        this.garage2 = garage2;

    }

    abstract public void manufacture();

}
