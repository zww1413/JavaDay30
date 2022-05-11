package day03;

import java.util.Scanner;

public class SwapTest {
    Scanner sc = new Scanner(System.in);
    int i1 = sc.nextInt();
    int i2 = sc.nextInt();

    public static void main(String[] args) {
        SwapTest swapt = new SwapTest();
        swapt.swap(swapt);
        System.out.println(swapt.i1);
        System.out.println(swapt.i2);
    }

    public void swap( SwapTest swapt) {
        int temp;
        temp = swapt.i1;
        swapt.i1 = swapt.i2;
        swapt.i2 = temp;
    }

}
