
public abstract class CalWeight {

    protected abstract double getHeight();
    protected abstract double getArea();
    protected abstract double getWeight() ;

    public double calVolumeTemplate(){
        return getArea() * getHeight();
    }
//    public double calWeightTemplate(){
//        return getArea()*calVolume()*getWeight();
//    }
}