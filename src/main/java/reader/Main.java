package reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    private static String inputFile = "input.txt";
    private static String outputFile = "output.txt";

    public static void main(String[] args) throws IOException {
        List<String> availableCities = Files.readAllLines(Paths.get(inputFile));

        List<String> citiesList = Solver.solve(availableCities);

        new Writer().write(outputFile, citiesList);
    }

}

