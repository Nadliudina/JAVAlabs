package labs.ch03;

/**
 * 1,2
 */
public class Employee implements Measurable {
    private double salary;
    private String name = "";

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String name) {
        this(salary);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    @Override
    public String GetName() {
        return name;
    }

}
