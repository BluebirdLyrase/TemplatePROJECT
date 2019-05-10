package templateproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6030213040
 */
public class box extends calWeight{
    
    private final double width;
    private final double height;
    private final double length;
    private final double weight;

    public box(double width, double height, double length, double weight){
        this.height = height;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }
    
    @Override
    protected double getHeight() {
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
    
    
}
