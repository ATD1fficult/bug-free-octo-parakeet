package example;

public class MyMath {
    public static final double PI = 3.14;

    public static int sum(int... numbers){
        int sum = 0;
        for (int number:numbers){
            sum += number;
        }
        return sum;
    }
    public static double length(double radius){
        return 2 * PI * radius;

    }

    public static double area(double radius){
        return PI * radius * radius;
    }
    static int multiple (int a, int b){
        return a * b;
    }
    static double multiple (double a, double b){
        return a * b;
    }

    static int multiple (int a){
        return a * a;
    }
}
