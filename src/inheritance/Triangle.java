package inheritance;

public class Triangle extends Shape{
    double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void showPerimeter() {
        super.showPerimeter();
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
