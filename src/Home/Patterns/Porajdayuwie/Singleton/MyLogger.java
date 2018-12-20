package Home.PattrensTesting.Porajdayuwie.AbstractFactory.Singleton;

public class MyLogger {

    private static MyLogger logger = new MyLogger();
    private static String log = "This is log File \n\n\n ";

    public MyLogger() {
    }

    public static synchronized MyLogger getLogger(){

        if (logger == null){
            logger = new MyLogger();
        }
        return logger;
    }

    public void log(String string){
        log+=string+'\n';
    }

    public void showLog(){
        System.out.println(log);
    }




}
