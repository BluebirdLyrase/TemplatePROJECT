/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateproject;

/**
 *
 * @author 6030213040
 */
public class cylinder extends calWeight{
    
    private final double radius;
    private final double height;
    private final double km;
    
    public cylinder (double radius, double height, double km){
        this.height = height;
        this.radius = radius;
        this.km = km;
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
        return km;
    }
    
}
