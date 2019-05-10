public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

       

        Truck truck = new truckBasic();
        // dec

        Truck truck1 = new truckFast(truck);
        truck1.calTransportSpeed();

        Truck truck2 = new truckEco(truck);
        truck2.calTransportCost();
    }
}
