package Class.company;

public class Student extends Human implements LogicThinking {

    private int group;

    @Override
    String getDescription() {
        return "This is student";
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public boolean logicThinking() {
        return true;
    }
}
