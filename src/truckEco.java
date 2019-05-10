public class truckEco extends truckDecorator{

    @Override
    public double calTransportSpeed() {
        return 0.0;
    }

    @Override
    public double calTransportCost() {
        System.out.println("ADD ECO MODE");
        return 0.0;
    }

    public truckEco(Truck truck) {
        super(truck);
    }
}
