package Class.Tests.Example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class ExampleTest {

    @Mock
    private IExample iExample;

    @InjectMocks
    private Example example;

    @Test
    void testMockitoExample() {
        example.mockitoExample(1);
        verify(iExample).message(1);
    }

    @Test
    void getErrorMessage() {
        when(iExample.message(1)).thenReturn("ERROR");
        String message = example.getErrorMessage(1);
        assertEquals("ERROR",message);
    }

}