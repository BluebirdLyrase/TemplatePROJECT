public class truckEco extends truckDecorator{

    @Override
    public double calTransportSpeed() {
        return trunk.calTransportSpeed();
    }

    @Override
    public double calTransportCost() {
        System.out.println("ADD ECO MODE");
        return trunk.calTransportCost();
    }

    public truckEco(Truck trunk) {
        super(trunk);
    }
}
