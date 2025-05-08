package Task_05;

public class Part_time_employee extends Employee implements Taxpayer{
    double hours;
    Part_time_employee(String name,String id,int hours)
    {
        super(name,id);
        this.hours=hours;
    }

    @Override
    public double calculate_salary() {
        System.out.print("Salary of "+name+": ");
        return hours*9000;

    }

    @Override
    public void pay_tax() {
        System.out.println("Pay tax of "+((calculate_salary()/9000)*100));

    }
}
