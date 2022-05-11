package day07;

import sun.font.TrueTypeFont;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        ArrayOperation aop = new ArrayOperation();
        int[] arr = new int[]{34,5,22,-98,6,-76,0,-3} ;
        int searchNub = 0;
        boolean isRun = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入你要执行的操作：");
            System.out.println("1.冒泡排序，从小到大");
            System.out.println("2.反转数组");
            System.out.println("3.复制数组");
            System.out.println("4.查找数组中元素");
            System.out.println("-1.退出");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    aop.bubbleSort(arr);
                    break;
                case 2:
                    aop.reversal(arr);
                    break;
                case 3:
                    aop.copy(arr);
                    break;
                case 4:
                    aop.search(searchNub, arr);
                    break;
                case -1:
                    isRun = false;
                    break;
            }
        }while(isRun);


        }

    private void search(int nub,int[] str) {
        int i= 0;
        int flag = 0;
        System.out.println("请输入你需要在数组中查找的数字");
        Scanner scanner = new Scanner(System.in);
         nub = scanner.nextInt();
         while( i < str.length){
             if (nub ==  str[i]) {
                 System.out.println("所查数字" + nub + "在数组中第" + (i+1) + "的位置");
                 flag = 1;
                 break;
             }
             i++;
         }
         if(flag == 0){
             System.out.println("查找失败");
         }

    }


    private void copy(int[] str) {
        int[] str1 = new int[str.length];
        int i;
        for( i= 0; i < str.length;i++){
            str1[i] = str[i];
        }
        System.out.println("复制成功，输出如下：");
        System.out.println("原数组为:"+Arrays.toString(str));
        System.out.println("复制数组为："+Arrays.toString(str));

    }

    private void  reversal(int[] str) {
        int i;
        int temp = 0;
        System.out.println("原数组为:"+Arrays.toString(str));
        for(i = 0; i < str.length/2; i++) {
            temp = str[i];
            str[i] = str[str.length - i-1];
            str[str.length - i-1] = temp;
        }
        System.out.println("反转后的数组为："+Arrays.toString(str));
    }

    public void bubbleSort(int[]  str){
        System.out.println("原数组为:"+Arrays.toString(str));
        for(int i =0; i < str.length-1; i++){
            for(int j = 0; j < str.length-i-1;j++)
            if (str[j] > str[j+1]) {
                int temp = str[j];
                str[j] = str[j+1];
                str[j+1] = temp;
            }
        }

        System.out.println("冒泡排序后的数组为："+ Arrays.toString(str));
    }

}

