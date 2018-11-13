package utils;

import java.util.Random;

public class Init {
    public static int[] initNum(int num){
        Random random = new Random();
        int[] arr = new int[num];
        for (int i=0;i<num;i++){
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
