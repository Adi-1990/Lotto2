import business.GetTheLuckyNumber;
import business.Reader;
import business.WriteContent;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Reader reader = new Reader();
        int[] array = reader.read();

        GetTheLuckyNumber luckyNumber = new GetTheLuckyNumber();
        int theLuckyNumber = luckyNumber.getTheLuckyNumber(array);
//        System.out.println(theLuckyNumber);

        WriteContent writer = new WriteContent();
        writer.WriterToFile(theLuckyNumber);
    }
}