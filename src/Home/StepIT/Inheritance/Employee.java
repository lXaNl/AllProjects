package Home.StepIT.Inheritance;

public class Employee implements PaymentMethod{
    private String name;
    private int price;
    private int hour;
    private int day;
    private int sum;
    private int job;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getHour() {
        return hour;
    }

    public int getDay() {
        return day;
    }

    public int getSum() {
        return sum;
    }

    public int getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public void setJob(int job) {
        this.job = job;
    }

    @Override
    public int hourly() {
        sum=price*hour;
        System.out.println("Name - "+name+"\nPayment type - Hourly \nSumm - "+sum);
        return sum;
    }

    @Override
    public int daily() {
        sum=price*day;
        System.out.println("Name - "+name+"\nPayment type - Daily \nSumm - "+sum);
        return sum;
    }

    @Override
    public int contractual() {
        sum=price*job;
        System.out.println("Name - "+name+"\nPayment type - Contractual \nSumm - "+sum);
        return sum;
    }
}
