package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunningManagger {

    private List<Run> runnings = new ArrayList<>();

    public void readAllLines(String fileName){
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))){
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null){
                Run run =createRunObjectFromLine(line);
                runnings.add(run);
            }
        }catch (IOException ioe){
            throw new IllegalStateException("Can not reach file", ioe);
        }

    }

    public double sumOfRunsPerDate(int year, Month month){
        double sum = 0.0;
        for(Run actual : runnings){
            if(actual.getDate().getYear() == year && actual.getDate().getMonth() == month ){
                sum += actual.getKm();
            }
        }
        return Math.floor(sum * 100) / 100;
    }

    private Run createRunObjectFromLine(String line){
        String[]parts = line.split(";");
        return new Run(Double.parseDouble(parts[0].split(" ")[0]),
                LocalDate.parse(parts[1]));

    }

    public List<Run> getRunnings() {
        return runnings;
    }
}
