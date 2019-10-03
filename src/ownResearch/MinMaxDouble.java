package ownResearch;

public class MinMaxDouble {
    public static void main(String[] args) {
        double min = 1.5E-323;
        double max = Double.MAX_VALUE;
        System.out.println("Math.nextUp for min(" + min + ")=" + Math.nextUp(min));
        System.out.println("Math.nextUp for max(" + max + ")=" + Math.nextUp(max));
    }
}
