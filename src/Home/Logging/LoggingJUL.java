package Home.Logging;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Date;
import java.util.logging.*;


public class LoggingJUL {
    private int a;
    private int b;
    Scanner sc = new Scanner(System.in);

//                      1.Java Util Logging
//	1.1. Создать класс и в нем константу логгера.
//	1.2. Создать метод, в нём вводить число с клавиатуры и обернуть
//        это в try/catch. В случае ошибки выводить в лог запись об ошибке с уровнем SEVERE.
//	1.3. Создать файл logger.properties и настроить его на вывод:
//		1.3.1. Только сообщений уровня WARNING+.
//		1.3.2. Записи в файл.
//		1.3.3. Использовать для этого SimpleFormatter.


//                        2.Slf4j
//	2.1. Создать класс и в нем константу логгера.
//	2.2. Создать метод, в нём вводить число с клавиатуры и обернуть
//        это в try/catch. В случае ошибки выводить в лог запись об ошибке с уровнем FATAL.
//	2.3. Создать файл log4j.properties и настроить его на вывод:
//		1.3.1. Только сообщений уровня ERROR+.
//		1.3.2. Записи в файл.
//		1.3.3. Использовать для этого RollingFileAppender.


    public static final Logger LOGGER =  Logger.getLogger(LoggingJUL.class.getName());

    public static void main(String[] args) {

        LoggingJUL jul = new LoggingJUL();

        jul.julhw();



    }

    public int julhw() {

        System.out.println("Enter 1st Num : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Num : ");
        b = sc.nextInt();
        int result = 0;
        try {
            result = a/b;
        } catch (Exception e){
            LOGGER.log(Level.SEVERE,"SEVERE : "+e);
        }

        return result;

    }

}
