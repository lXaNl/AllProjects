package Class.jul;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class MyJulFilter implements Filter {


    @Override
    public boolean isLoggable(LogRecord record) {
        return record
                .getMessage()
                .endsWith("IT STEP");
    }
}
