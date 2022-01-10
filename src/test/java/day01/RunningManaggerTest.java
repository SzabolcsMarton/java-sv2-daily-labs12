package day01;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class RunningManaggerTest {

    @Test
    void readAllLinesWithWrongFilenameShouldThrowException() {
        RunningManagger runmanagger = new RunningManagger();
        Exception ex = assertThrows(IllegalStateException.class,
                () -> runmanagger.readAllLines("src/test/resources/runn.csv"));
        assertEquals("Can not reach file", ex.getMessage());

    }

    @Test
    void readAllLinesTest() {
        RunningManagger runmanagger = new RunningManagger();
        runmanagger.readAllLines("src/test/resources/running.csv");

        assertEquals(7,runmanagger.getRunnings().size() );
    }

    @Test
    void sumOfRunsPerDate(){
        RunningManagger runningManagger = new RunningManagger();
        runningManagger.readAllLines("src/test/resources/running.csv");

       assertEquals(7.1, runningManagger.sumOfRunsPerDate(2021, Month.NOVEMBER));
       assertEquals(41.2, runningManagger.sumOfRunsPerDate(2021, Month.DECEMBER));

    }

}