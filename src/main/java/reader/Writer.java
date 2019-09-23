package reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardOpenOption.CREATE;

public class Writer {

    public void write(String fileName, List<String> cities) throws IOException {
        if(Files.exists(Paths.get(fileName))){
            Files.delete(Paths.get(fileName));
        }

        Files.write(Paths.get(fileName), cities, CREATE);
    }
}
