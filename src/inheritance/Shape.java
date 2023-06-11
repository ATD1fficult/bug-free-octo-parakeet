package inheritance;

public class Shape {
    double a;
    double b;

    public double perimeter(){
        return (a + b) * 2;
    }

    public void showPerimeter(){
        System.out.println(perimeter());
    }
}
