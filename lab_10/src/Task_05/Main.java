package Task_05;

public class Main {
    public static void main(String[] args) {
        Full_time_employee yasir = new Full_time_employee("Yasir","114asr",12);
        Part_time_employee faisal = new Part_time_employee("Faisal","125asi",8);
        System.out.println(yasir.calculate_salary());
        yasir.pay_tax();
        System.out.println(faisal.calculate_salary());
        faisal.pay_tax();



    }
}
