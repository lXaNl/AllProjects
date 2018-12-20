package Class.Tests.Lab;

public class Shape {

    Opperations opperations;

    public String callSumm(int a,int b){
        return String.valueOf(opperations.summ(a,b));
    }

    public String callMult(int a, int b){
        return String.valueOf(opperations.mult(a,b));
    }

}
