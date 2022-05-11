package day03;

import java.util.Scanner;

public class SumOrMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        SumOrMul som =new SumOrMul();
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("第一个数大于10.0且第二个数小于20.0，输出两数之和");
            som.getSum(d1, d2);
        }
        else {
            System.out.println("第一个数不大于10.0或第二个数不小于20.0，输出两数之积");
            som.getMul(d1, d2);
        }
        }
    public void getSum(double d1,double d2){
        System.out.println(d1+d2);
    }
    public  void getMul(double d1,double d2){
        System.out.println(d1*d2);
    }
}
