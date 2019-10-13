package business;

import java.util.Arrays;

public class GetTheLuckyNumber {

    public int getTheLuckyNumber(int[] array) {

//            take the max number
        Arrays.sort(array);
        int luckyNumber = array[array.length - 1] + 1;

//        check the conditions : the number has to be the greatesc and not divided by the rest of the numbers
        for (int i = 0; i < array.length; i++) {
            if (luckyNumber % array[i] == 0) {
                i = 0;
                luckyNumber++;
            }
        }
        return luckyNumber;
    }
}
