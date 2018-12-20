package Class.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DateExamplesTest {

    @Test
    void summ() {

        DateExamples dateExamples = new DateExamples();

        int actual = dateExamples.summ(5,6);
        int expected = 11;

        assertEquals(expected,actual);
    }

}