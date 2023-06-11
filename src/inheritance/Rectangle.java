package inheritance;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void showPerimeter() {
        super.showPerimeter();
    }

    @Override
    public double perimeter() {
        return (a+b) * 2;
    }
}
