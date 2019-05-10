package templateproject;

public abstract class calWeight {

    protected abstract double getHeight();
    protected abstract double getArea();
    protected abstract double getWeight() ;

    public double calVolume(){
        return getArea() * getHeight();
    }
    public double calWeightTemplate(){
        return getArea()*calVolume()*getWeight();
    }
}
