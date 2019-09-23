package reader;

import writer.Writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader extends Sorter {
    private final static String filename = "input.txt";
    private static List availableCities = new ArrayList();
    private static Writer writer = new Writer();

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int length = 0;
            while((line = reader.readLine()) != null){
                availableCities.add(line);
            }
            Collections.sort(availableCities);
            availableCities = Sorter.solve(availableCities);

            System.out.println(availableCities);
            for(int k = 0; k<availableCities.size(); k++){

                writer.writeToFile(availableCities.get(k).toString());
            }
            for(int i = 0; i<availableCities.size(); i++){
                length += availableCities.get(i).toString().length();
            }
            System.out.println(length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
