/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 6030213040
 */
public class Cylinder extends CalWeight{
    
    private final double radius;
    private final double height;
    private final double weight;
    
    public Cylinder (double radius, double height, double weight){
        this.height = height;
        this.radius = radius;
        this.weight = weight;
    }

    @Override
    protected double getHeight() {
        return height;
    }

    @Override
    protected double getArea() {
        return Math.PI * radius * radius;
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
