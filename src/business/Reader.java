package business;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public int[] read() throws FileNotFoundException {

//          read the input file

            Scanner scanner = new Scanner(new File("lotto2.in"));

//          take the first line and
//          extract the number of extracted numbers
        String line1 = scanner.nextLine();
        String[] number = line1.split(" ");
        int numberOfExtractedNumbers = Integer.parseInt(number[0]);

//          read the second line and convert the number from file to an array of int
        String line2 = scanner.nextLine();
        int[] numbers = new int[numberOfExtractedNumbers];

        for (int i = 0; i < (numbers.length); i++) {
            String[] values = line2.split(" ");
            int a = Integer.parseInt(values[i]);
            numbers[i] = a;
        }

//          sort the array to access the largest number easily
        Arrays.sort(numbers);
        return numbers;
    }
}

