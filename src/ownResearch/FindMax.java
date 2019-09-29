package ownResearch;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = in.nextInt();
        System.out.println("Enter number B: ");
        int b = in.nextInt();
        System.out.println("Enter number C: ");
        int c = in.nextInt();
        int max = 0;
        if (a > b && a > c){
            max = a;
        } else if (b > a && b > c){
            max = b;
        }else if (c > max){
            max = c;
        }
        System.out.println(max);
        int max1 = Math.max(a,b);
        int max2 = Math.max(b,c);
        if (max1 > max2){
            max = max1;
        } else max = max2;
        System.out.println(max);
    }
}
