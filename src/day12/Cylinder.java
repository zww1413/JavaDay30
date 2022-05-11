package day12;

public class Cylinder extends Circle{
    private  double length;
    public Cylinder(){
        length = 1;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return this.length;
    }
    public  double findVolume(){
        return super.finArea() * length;
    }
    public  double finArea(){
        return  2 * super.finArea() + 2 * 3.14* super.getRadius() * length;

    }
}
