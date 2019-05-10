public class truckFast extends truckDecorator {

    @Override
    public double calTransportSpeed() {
        System.out.println("ADD FAST TRAVEL MODE");
        return trunk.calTransportSpeed();
    }

    @Override
    public double calTransportCost() {
        System.out.println("");
        return trunk.calTransportCost();
    }

    public truckFast(Truck trunk) {
            super(trunk);
    }
}
