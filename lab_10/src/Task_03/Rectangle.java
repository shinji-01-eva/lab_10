package Task_03;

public class Rectangle extends Shape implements Printable{

    double width;
    double height;

    Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }

    @Override
    public void area() {
        System.out.println(height*width);
    }

    @Override
    public void print() {
        System.out.println("Rectangle has been made");

    }
}
