public class trunkFast extends truckDecorator {

    @Override
    public double calTransportSpeed() {
        return trunk.calTransportSpeed();
    }

    @Override
    public double calTransportCost() {
        return trunk.calTransportCost();
    }

    public trunkFast() {

    }
}
