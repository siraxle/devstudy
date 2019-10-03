package ownResearch;

import java.util.ArrayList;
import java.util.Random;

public class Lotereya {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 49; i++){
            array.add(i, i+1);
        }
        final Random random = new Random();
        int[] result = new int[6];
        for (int i = 0; i < 6; i++){
            result[i] = array.get(random.nextInt(50));
            array.remove(result[i]-1);
            System.out.println(result[i]);
        }
        System.out.println(array);
    }

}
