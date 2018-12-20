package Class.jul;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class JulWithJavaConfig {

    private static final Logger LOGGER = Logger.getLogger(JulWithJavaConfig.class.getName());

    public static void main(String[] args) throws IOException {
        JulWithJavaConfig jul = new JulWithJavaConfig();

//        jul.loggerExamples(5, 0);

//        jul.fileHandlerByDefault();

//        jul.fileHandlerWithPath();

//        jul.consoleHandlerWithFormatter();

//        jul.fileHandlerWithPathAndFormatter();

//        jul.consoleHandlerWithFineLevel();

        jul.consoleHandlerWithFilter();

    }

    public int loggerExamples(int num, int a) {
        int result = 0;
        try {
            result = num / a;
        } catch (Exception e) {

//            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            LOGGER.log(Level.WARNING, "WARNING MESSAGE", e);

//            LOGGER.log(Level.WARNING,
//                    getClass().getName(),
//                    "class name message");
//
//            LOGGER.warning("WARNING MESSAGE");

        }
        return result;
    }

    public void fileHandlerByDefault()
            throws IOException {
//        Создаем файл хэндлер
        Handler fileHandler = new FileHandler();
//        Не используем хэндлер по умолчанию
        LOGGER.setUseParentHandlers(false);

        LOGGER.addHandler(fileHandler);

        LOGGER.info("MESSAGE FOR FILE HANDLER 1");
        LOGGER.info("MESSAGE FOR FILE HANDLER 2");
        LOGGER.info("MESSAGE FOR FILE HANDLER 3");

    }

    public void fileHandlerWithPath() {

        Handler fileHandler;

        try {
            fileHandler = new FileHandler("%h/homeLog1.log");
//            LOGGER.setUseParentHandlers(false);

            LOGGER.addHandler(fileHandler);

            LOGGER.info("MESSAGE FOR FILE HANDLER 1");
            LOGGER.info("MESSAGE FOR FILE HANDLER 2");
            LOGGER.info("MESSAGE FOR FILE HANDLER 3");

        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.warning("WARNING");
        }
    }

    public void consoleHandlerWithFormatter() {
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new MyFormatter());

        LOGGER.setUseParentHandlers(false);

        LOGGER.addHandler(consoleHandler);

        LOGGER.info("LOGGER INFO");
    }

    public void fileHandlerWithPathAndFormatter() {
        Handler fileHandler;

        try {
            fileHandler = new FileHandler(
                    "%h/homeLog1.log");
            SimpleFormatter formatter =
                    new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            LOGGER.addHandler(fileHandler);
            LOGGER.info("OK");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void consoleHandlerWithFineLevel() {

        Handler consoleHandler = new ConsoleHandler();

        consoleHandler.setLevel(Level.ALL);

        LOGGER.setLevel(Level.ALL);

        LOGGER.setUseParentHandlers(false);

        LOGGER.addHandler(consoleHandler);

        LOGGER.fine("TROLOLO");
    }

    public void consoleHandlerWithFilter() {
        Handler handler = new ConsoleHandler();

        MyJulFilter filter = new MyJulFilter();
        handler.setFilter(filter);
        LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(handler);
        LOGGER.info("INFO");
        LOGGER.info("INFO IT STEP");
    }

    static class MyFormatter extends Formatter {

        @Override
        public String format(LogRecord record) {

            Date date = new Date();
            return date.toString() + " " + record.getLevel() + ": " +
                    record.getMessage() + "\n";
        }
    }
}
