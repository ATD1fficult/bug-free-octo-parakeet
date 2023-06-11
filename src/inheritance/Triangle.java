package inheritance;

public class Triangle extends Shape{
    double c;

    @Override
    public void showPerimeter() {
        super.showPerimeter();
    }

    @Override
    public double perimeter() {
        super.perimeter();
        return a + b + c;
    }
}
