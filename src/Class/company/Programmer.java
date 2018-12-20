package Class.company;

public class Programmer extends Employee implements LogicThinking {

    private boolean dbAccess;

    public boolean isDbAccess() {
        return dbAccess;
    }

    public void setDbAccess(boolean dbAccess) {
        this.dbAccess = dbAccess;
    }

    @Override
    public boolean logicThinking() {
        return true;
    }
}
