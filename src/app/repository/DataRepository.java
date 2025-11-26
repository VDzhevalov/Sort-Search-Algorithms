package app.repository;

import java.util.Random;

public class DataRepository {

    public int[] getData() {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50); // 0...49
        }
        return arr;
    }
}
