package Class.Tests.Example;

public class Example  {

    private IExample iExample;

    public void mockitoExample(int code) {
        iExample.message(code);
    }

    public String getErrorMessage(int code){
        return iExample.message(code);
    }

}
