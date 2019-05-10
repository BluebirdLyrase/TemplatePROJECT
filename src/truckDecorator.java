public class truckDecorator implements trunkBasic {


    @Override
    public double calTransportSpeed() {

        return trunk.calTransportSpeed();
    }

    @Override
    public double calTransportCost() {

        return trunk.calTransportCost();
    }

    protected trunkBasic trunk;

    public truckDecorator(trunkBasic trunk) {
        this.trunk = trunk;
    }
}
