package day10;

public class GetArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRedius(2.0);
        System.out.println(circle.getArea());
    }
}
 class Circle{
    private double redius;
    public double GetRedius(){
        return this.redius;
    }
    public void setRedius(double redius1){
        redius = redius1;
    }
    public double getArea(){
        return redius*redius*3.14;
    }

}
