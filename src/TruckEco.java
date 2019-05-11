


public class TruckEco extends TruckDecorator{
    
    @Override
    public double calTransportSpeed() {
        System.out.println("ADD ECO MODE");
        return 1.0+trunk.calTransportSpeed();
    }

    @Override
    public double calTransportCost() {
        System.out.println("ADDS baht");
        return trunk.calTransportCost();
    }

    public TruckEco(Truck trunk) {
        super(trunk);
    }
 
  
}

