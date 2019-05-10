public class truckFast extends truckDecorator {

    @Override
    public double calTransportSpeed() {
        System.out.println("ADD FAST TRAVEL MODE");
        return "0.0";
    }

    @Override
    public double calTransportCost() {
        System.out.println("");
        return "0.0";
    }

    public truckFast(Truck truck) {
            super(truck);
    }
}
