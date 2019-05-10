public abstract class calWeight {

    protected abstract double getArea() ;
    protected abstract double getVolume() ;
    protected abstract double getWeight() ;

    public double calWeightTemplate(){
        return getArea()*getVolume()*getWeight();
    }



}
