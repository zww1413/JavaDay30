package day03;

import java.util.Scanner;

public class GetMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nub1 = sc.nextInt();
        int nub2 = sc.nextInt();
        System.out.println(nub1 > nub2 ? nub1 : nub2);
    }

}

