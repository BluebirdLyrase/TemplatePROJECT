


public class TruckFast extends TruckDecorator {

    public TruckFast(Truck trunk) {
            super(trunk);
    }
    
    public double calTransportSpeed() {
        System.out.println("ADD FAST TRAVEL MODE");
        return 0.5*trunk.calTransportSpeed();
    }

    
    public double calTransportCost() {
        System.out.println("");
        return trunk.calTransportCost();
    }

}
