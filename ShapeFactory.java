import java.util.Scanner;
public class ShapeFactory {
    public static CalWeight createShape(int type){

        Scanner srcInt = new Scanner(System.in);
        Scanner srcDouble = new Scanner(System.in);
        Scanner srcString = new Scanner(System.in);
        if(type==1){
            System.out.print("radius : ");
            double radius = srcDouble.nextDouble();
            System.out.print("Height : ");
            double height = srcDouble.nextDouble();
            System.out.print("Weight : ");
            double weight = srcDouble.nextDouble();



            return new Cylinder(radius, height, weight);
        }else if(type==2){
            System.out.print("Width : ");
            double width = srcDouble.nextDouble();
            System.out.print("Height : ");
            double height = srcDouble.nextDouble();
            System.out.print("Length : ");
            double length = srcDouble.nextDouble();
            System.out.print("Weight : ");
            double weight = srcDouble.nextDouble();


            return new Box(width, height, length, weight);
        }else
            return null;
    }
}
