package Task_04;

public class Duck implements Swimable,Flyable{

    String name;
    Duck(String name)
    {
        this.name=name;
    }

    @Override
    public void fly() {
        System.out.println(name+" flies");

    }

    @Override
    public void swim() {
        System.out.println(name+" swims");
    }
}
