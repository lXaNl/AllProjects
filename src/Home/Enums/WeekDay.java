package Home.Enums;

public enum WeekDay {

    SUNDAY("SUNDAY",0),
    MONDAY("MONDAY",1),
    TUESDAY("TUESDAY",2),
    WEDNESDAY("WEDNESDAY",3),
    THURSDAY("THURSDAY",4),
    FRIDAY("FRIDAY",5),
    SATURDAY("SATURDAY",6);

    private String name;
    private int ordinal;

    WeekDay(String name,int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    public int getOrdinal() {
        return ordinal;
    }
}
