package inheritance;

public class Teacher extends Person {

    private double salary; // в долларах

    public Teacher() {
    }

    public Teacher(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        setSalary(500_000_000);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void eats() {
        super.eats();
    }

    void teach() {
        System.out.println("Если выучил, то можете выучить и вы!");
    }

    @Override
    public String toString() {
        return "inheritance.Teacher{" +
                "salary=" + salary +
                '}'
                + super.toString();
    }

    public String toDisplay(){
        return super.toString() + "для ведроидов";
    }
}
