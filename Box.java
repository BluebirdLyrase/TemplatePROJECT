public class Box extends CalWeight{
    
    private final double width;
    private final double height;
    private final double length;
    private final double weight;

    public Box(double width, double height, double length, double weight){
        this.height = height;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }
    
    @Override
    protected double getHeight(){
        return height;
    }

    @Override
    protected double getArea() {
        return width*length;
    }

    @Override
    protected double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Box";
    }
}
