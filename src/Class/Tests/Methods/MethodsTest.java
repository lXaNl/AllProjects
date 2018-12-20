package Class.Tests.Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @Test
    void string() {
        Methods methods = new Methods();
        String expected = "False";
        String actual = methods.string(3);

        assertEquals("False",methods.string(5));

        assertEquals("True",methods.string(15));

    }




}