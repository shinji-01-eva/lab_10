package Task_05;

public class Full_time_employee extends Employee implements Taxpayer {

    int Months;

    Full_time_employee(String name,String id,int Months)
    {
      super(name,id);
      this.Months=Months;
    }

    @Override
    public double calculate_salary() {
        System.out.print("Salary of "+name+": ");
       return Months*100000; 

    }

    @Override
    public void pay_tax() {
        System.out.println("Pay tax of "+(calculate_salary()/100000)*100);

    }
}


