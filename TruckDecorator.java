public class TruckDecorator implements Truck {


        @Override
        public double calTransportSpeed() {
            return trunk.calTransportSpeed();
        }

        @Override
        public double calTransportCost() {

            return trunk.calTransportCost();
        }

        protected Truck trunk;

        public TruckDecorator(Truck trunk) {
            this.trunk = trunk;
        }

}
