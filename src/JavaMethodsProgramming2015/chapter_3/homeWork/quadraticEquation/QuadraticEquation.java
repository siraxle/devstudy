package JavaMethodsProgramming2015.chapter_3.homeWork.quadraticEquation;

import java.util.ArrayList;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static ArrayList<Double> solveTheQuadraticEquation(QuadraticEquation equation) {
        ArrayList<Double> result = new ArrayList<Double>();
        Double discriminant = equation.b * equation.b - 4 * equation.a * equation.c;
        if (discriminant > 0) {
            double x1 = (- equation.b + Math.sqrt(discriminant)) / (2 * equation.a);
            result.add(x1);
            double x2 = (- equation.b - Math.sqrt(discriminant)) / (2 * equation.a);
            result.add(x2);
        } else if (discriminant < 0) {
            System.out.println("Discriminant < 0");
            return null;
        } else if (discriminant == 0){
            double x1 = (- equation.b + Math.sqrt(discriminant)) / (2 * equation.a);
            result.add(x1);
        }
        return result;
    }

    public Double extremum (QuadraticEquation equation) {
        Double x = -equation.b / 2 * equation.a;
        Double result = equation.a * x * x + equation.b * x + equation.c;
        return result;
    }

    public void ageAndDecrease (QuadraticEquation equation) {
        ArrayList<Double> result = equation.solveTheQuadraticEquation (equation);
        if (result.size() == 2) {
            double x1 = result.get(0);
            double x2 = result.get(1);
            String firstBound;
            String secondBound;
            firstBound = "from minus infinity to " + x1;
            secondBound = "from" + x2 + "to plus infinity";
            System.out.println(firstBound + " " + secondBound);
        } else if (result.size() == 1){
            double x = result.get(0);
            System.out.println("from minus infinity to " + x);
            System.out.println("from" + x + "to plus infinity");
        } else System.out.println("no roots in equation");
    }

}
