package Class.Tests.Lab;

import Class.Tests.Example.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OpperationsTest {

    @Mock
    Opperations opperations;

    @InjectMocks
    Shape shape;

    @Test
    void testOpperationsSumm() {
        shape.callSumm(5,6);
        verify(opperations).summ(5,6);

        when(opperations.summ(5,6)).thenReturn(11);
        String getSumm = shape.callSumm(5,6);
        assertEquals("11",getSumm);
    }

    @Test void testOpperationsMult(){
        when(opperations.mult(5,6)).thenReturn(30);
        String getMult = "Result is " + shape.callMult(5,6);
        assertEquals("Result is 30",getMult);
    }


}