package Class.company;

public class Manager extends Employee implements Comparable {

    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager() {
        System.out.println("Manager");

    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }

//    @Override
//    public String toString() {
//        return "Manager{" +
//                " name=" + super.getName() +
//                " salary=" + super.getSalary() +
//                " bonus=" + bonus +
//                '}';
//    }

    @Override
    public String toString() {
        return super.toString() +
                " bonus=" + bonus +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (getClass() != o.getClass()) {
            System.out.println("Не совпадают классы");
            throw new ClassCastException();
        }
        Manager manager = (Manager) o;
        return Integer.compare(bonus, manager.bonus);
    }
}
