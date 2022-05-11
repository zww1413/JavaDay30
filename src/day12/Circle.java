package day12;

public class Circle {
    private double radius;
    public Circle(){
        radius = 1;
    }

    public  void setRadius(double radius){
        this.radius = radius;
    }
    public  double getRadius(){
        return radius;
    }
    public double finArea(){
        return getRadius()*getRadius()*3.14;
    }





    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.finArea());
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.finArea());
        System.out.println(cylinder.findVolume());
    }
}
