package writer;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void writeToFile(String word) {

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.write(word + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
