package business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteContent {

    public void WriterToFile(int number) {
        BufferedWriter bw = null;
        try {
            String mycontent = Integer.toString(number);
            File file = new File("lotto2.out");

            /* This logic will make sure that the file
             * gets created if it is not present at the
             * specified location*/
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }
}