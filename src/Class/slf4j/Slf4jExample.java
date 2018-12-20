package Class.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TRACE, DEBUG, INFO, WARN, ERROR, FATAL

public class Slf4jExample {

    private static final Logger LOGGER =
            LoggerFactory
                    .getLogger(Slf4jExample.class);

    public static void loggerExamples() {
        LOGGER.info("info");
        LOGGER.info("IT STEP");
        LOGGER.info("info");

        String username = "John";
        int age = 25;
//        LOGGER.debug("Name: {}, age: {}", username, age);

    }

    public static void main(String[] args) {
        loggerExamples();
    }

}
