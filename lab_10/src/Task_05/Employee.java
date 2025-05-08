package Task_05;

public abstract class Employee {
    String name;
    String id;
    Employee(String name,String id)
    {
        this.id=id;
        this.name=name;
    }
    public abstract double calculate_salary();
}
