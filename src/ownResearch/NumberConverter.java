package ownResearch;

import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner in = new Scanner(System.in);
        int number_2 = in.nextInt();
        String hexString = Integer.toHexString(number_2) + "";
        System.out.println("2 :" +Integer.toBinaryString(number_2));
        System.out.println("8 :" +Integer.toOctalString(number_2));
        System.out.println("16 :" +Integer.toHexString(number_2));
        System.out.println("From int to hex: " + Integer.parseInt(hexString, 16));
    }
}
