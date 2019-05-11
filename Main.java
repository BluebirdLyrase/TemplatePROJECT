import java.util.*;

public class Main {
    public static void main(String[] args) {
        //inititalize
        Scanner srcInt = new Scanner(System.in);
        Scanner srcDouble = new Scanner(System.in);
        Scanner srcString = new Scanner(System.in);
        Iterator items = new ShapeCollection();
        int choice;

        CalWeight shape = null;
        String Shape="";

        int totalItems=0;
        double totalVolumn= 0;
        System.out.println("Number of item(s)");
        int numOfItems = srcInt.nextInt();
        int numOfShape=0;
        for (int i = 0; i < numOfItems; i++) {
            System.out.println("Item : "+(i+1));
            System.out.print("Please choose a shape : "
                    + "\n1: Cylinder"
                    + "\n2: Box"
                    + "\n>>> ");
            choice = srcInt.nextInt();
            shape=ShapeFactory.createShape(choice);
            System.out.print("Number of this shape : ");
            numOfShape = srcInt.nextInt();
            System.out.println("------------------------------------------");
            Item item = new Item(shape,numOfShape);
            items.addItem(item);
            totalItems+=item.getAmount();
            totalVolumn += item.getShape().calVolumnTemplate()*item.getAmount();
        }
        //System.out.println(""+"\n volume for each items is "+shape.calVolumnTemplate()+" cubic centimeter");
        //System.out.println(""+"\nTotal volume is "+totalVolumn+" cubic centimeter");

        int day = 0;
        System.out.println();
        System.out.print("Please choose your destination : "
                + "\n1: Vientien(Laos)"
                + "\n2: Rangoon(Myanma)"
                + "\n3: Phuket(Thailand)"
                + "\n>>> ");
        choice = srcInt.nextInt();

        String country="";
        switch (choice) {
            case 1:
                day = 2;
                country = "Vientien(Laos)";
                break;
            case 2:
                day = 4;
                country = "Rangoon(Myanma)";
                break;
            case 3:
                day = 1;
                country = "Phuket(Thailand)";
                break;
            default:
                break;
        }

        System.out.print("Please choose type of truck : "
                + "\n1: Basic Truck"
                + "\n2: Eco Truck"
                + "\n3: Fast Truck"
                + "\n>>> ");

        choice = srcInt.nextInt();

        String Truck="";
        double countday=0;
        Truck truck = new truckBasic();

        switch (choice) {
            case 1:
//                truck.calTransportSpeed();
                countday = truck.calTransportSpeed();
                truck.calTransportCost();
                Truck = "Basic Truck";
                break;

            case 2:
                Truck truck1 = new TruckEco(truck);
//                System.out.println(truck1.calTransportSpeed());
                countday = truck1.calTransportSpeed();
                Truck = "Eco Truck";
                break;

            case 3:
                Truck truck2 = new TruckFast(truck);
//                System.out.println(truck2.calTransportSpeed());
                countday = truck2.calTransportSpeed();
                Truck = "Fast Truck";
                break;
            default:
                break;
        }

        System.out.println("====================================");
        System.out.println("============ Transection ===========\n");
        System.out.println("You choose : ");
        while(items.hasnext())
            System.out.println(items.next());

        //System.out.println("Type of shape is " + Shape);
        System.out.println("Total of items is "+totalItems+" items");
        System.out.println("Total volumn is "+totalVolumn+" cubic centimeters");
        System.out.println("Destination is "+country);
        System.out.println("Type of truck is " + Truck);
        System.out.println("====================================\n");
        System.out.println("Transportation time = "+countday*day+" day(s)");
    }
}

//        System.out.println("HELLO WORLD");
//
//
//        Truck truck = new truckBasic();
//        // dec
//
//        Truck truck1 = new truckFast(truck);
//        truck1.calTransportSpeed();
//        truck1.calTransportCost();
//
//        Truck truck2 = new truckEco(truck);
//        truck2.calTransportCost();

//        ArrayList<calWeight> cal = new ArrayList<>();
//
//        cylinder cylinder1 = new cylinder(5, 5, 5);
//        cal.add(cylinder1);
//
//            for(calWeight cals:cal){
//                System.out.println(cals.calVolumeTemplate());
//            }