package test;

public class Box {
    protected double length;
    protected double width;
    protected double height;

    public Box(){
       this(10);
    }

    public Box(Box another){
        this(another.length, another.width, another.height);
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size){
       this(size, size, size);
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void showInfo(){
        System.out.println(width + " " + length + " " + height);
    }

    public int Compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if(currentVolume > anotherVolume){
           return 1;
        }else if(currentVolume < anotherVolume){
            return -1;
        }else {
            return 0;
        }
    }

    private double getVolume() {
        return length * width * height;

    };

    public Box Copy(){
        Box box = new Box(this.length, this.width, this.height);
        return box;

    };

    public void showVolume() {
        System.out.println(getVolume());
    }

    public Box Increase(int x){
        Box box = new Box(this.length *x, this.width*x, this.height *x);
        return box;
    }
}
