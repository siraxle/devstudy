package ownResearch;

import static java.lang.Math.abs;

public class Car {

    private double x = 0;
    private double gasLevel = 0;
    private final double fuelConsumption;

    Car(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public void move(double dx) throws Exception{
        assert this.gasLevel > 0;
        double fuelAmount = abs(dx)*this.fuelConsumption;
        if (this.gasLevel < fuelAmount){
            throw new Exception("Not enough gasoline");
        }
        this.x += dx;
        this.gasLevel -= fuelAmount;
    }

    public void fillUp(double litersOfGas){
        assert litersOfGas > 0;
        this.gasLevel += litersOfGas;
    }

    public double getX(){
        return this.x;
    }

    public double getGasLevel(){
        return this.gasLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", gasLevel=" + gasLevel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public static void main(String[] args) throws Exception{
        Car car = new Car(0.5);
        System.out.println(car);
        car.fillUp(5);
        car.move(10);
        System.out.println(car);
        car.fillUp(-5);
        car.move(-10);
        System.out.println(car);

    }

}


