



public class truckBasic implements Truck  {

    
    public double calTransportSpeed() {
        System.out.println("ADD BASIC TRAVEL MODE");
        return 1.0;
    }

    @Override
    public double calTransportCost() {
        System.out.println("ADD BASIC TRANSPORT MODE");
        return 0.0;
    }

    public static class truckDecorator implements Truck {


        @Override
        public double calTransportSpeed() {
            return trunk.calTransportSpeed();
        }

        @Override
        public double calTransportCost() {

            return trunk.calTransportCost();
        }

        protected Truck trunk;

        public truckDecorator(Truck trunk) {
            this.trunk = trunk;
        }

    }
}
