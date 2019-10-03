package ownResearch;

import java.math.BigInteger;
import java.util.Random;

public class Factorial {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= 1000; i++){
            BigInteger temp = new BigInteger(i + "");
            result = result.multiply(temp);
        }
        System.out.println(result);
    }
}
