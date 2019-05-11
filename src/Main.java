import java.util.*;

public class Main {
    public static void main(String[] args) {
        //inititalize
        Scanner srcInt = new Scanner(System.in);
        Scanner srcDouble = new Scanner(System.in);
        Scanner srcString = new Scanner(System.in);
        
        
        
        
        
        System.out.print("Please choose a shape : "
                + "1: Cylinder"
                + "2: Box"
                + ">>> ");
        int choice = srcInt.nextInt();
        
        CalWeight shape = null;
        switch(choice){
            case 1 ://cylinder
                     System.out.print("radius : ");
                        double radius = srcDouble.nextDouble();
                     System.out.print("Height : ");
                        double height = srcDouble.nextDouble();
                     System.out.print("Weight : ");
                        double weight = srcDouble.nextDouble();
                        
                        shape = new Cylinder(radius, height, weight);
                break; 
                    
            case 2 : //box
                     System.out.print("Width : ");
                        double width = srcDouble.nextDouble();
                     System.out.print("Height : ");
                        height = srcDouble.nextDouble();
                     System.out.print("Length : ");
                        double length = srcDouble.nextDouble();
                     System.out.print("Weight : ");
                        weight = srcDouble.nextDouble();
                        
                        shape = new Box(width , height, length, weight);
                break; 
            default: break;
        }
        System.out.println(shape.calVolumeTemplate());
        
        int day = 0;
        
        System.out.print("Please choose your destination : "
                + "1: Vientien(Laos)"
                + "2: Rangoon(Myanma)"
                + "3: Phuket(Thailand)"
                + ">>> ");
        choice = srcInt.nextInt();
        
        switch(choice){
            case 1 : day = 2; break;
            case 2 : day = 4; break;
            case 3 : day = 1; break;
            default: break;
        }
        
        System.out.print("Please choose type of truck : "
                + "1: Basic Truck"
                + "2: Eco Truck"
                + "3: Fast Truck"
                + ">>> ");
        
        choice = srcInt.nextInt();
        
       
         Truck truck = new truckBasic();
        
        switch(choice){
            case 1 : truck.calTransportSpeed();
                     truck.calTransportCost();
                break;
                
            case 2 : Truck truck1 = new TruckEco(truck);
                     System.out.println(truck1.calTransportSpeed());
                break;
                
            case 3 : Truck truck2 = new TruckFast(truck);
                     truck2.calTransportSpeed();
                     truck2.calTransportCost();
                break;
            default : break;
        }
        
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