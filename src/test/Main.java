package test;

import example.*;

import java.util.ArrayList;

public class Main {
    //        example.Human human1 = new example.Human();
//        example.Human human2 = new example.Human();
//        example.Human human3 = new example.Human();
//        human1.age = 16;
//        human1.weight = 54;
//        human1.name = "Ivan";
//        human2.age = 22;
//        human2.weight = 53;
//        human2.name = "Julia";
//        human3.age = 29;
//        human3.weight = 70;
//        human3.name = "Sasha";
//        double middleAge = (double) (human1.age + human2.age + human3.age) / 3;
////        System.out.println(middleAge);
//        Box box1 = new Box(10, 10, 10);
//        Box box2 = new Box(20, 20, 20);
//        Box box3 = new Box(30);
//        box1.showVolume();
//        box2.showVolume();
//        box3.showVolume();
//        example.Dog dog1 = new example.Dog();
//        dog1.name = "Black ";
//        dog1.species = "White ";
//        dog1.weight = 5;
//        dog1.speed = 5;
//        String dog1Inf = dog1.information();
//        System.out.println(dog1Inf);
//        dog1.Run();
//        example.Test test = new example.Test();
//        System.out.println(test.square(20));
//        example.Rectangle rectangle1 = new example.Rectangle();
//        rectangle1.setAll(10, 10);
//        System.out.println(rectangle1.square());
//        example.Worker worker1 = new example.Worker("black", "White", 10000);
//        worker1.showInfo();
//        System.out.println(example.MyMath.multiple(10));
//        System.out.println(Math.sqrt(36));
//        example.Monster monster = new example.Monster(5);
//        monster.voice(2, "Nigger");
//        test.Box current = new test.Box(20);
//        test.Box another = current.Increase(2);
//        current.showVolume();
//        another.showVolume();
//        int result = current.Compare(another);
//        System.out.println(result);
//        Human human = new Human("Jonh", 25);
//        human.setAge(-49);
//        System.out.println(human.getAge() + human.getName());
//        System.out.println(MyMath.length(10));
//        System.out.println(MyMath.area(10));
//        System.out.println(MyMath.length(10));
//        System.out.println(MyMath.sum(5, 5, 5, 5, 5, 5, 111));

    //        for (int i =0; i < employees.length; i++){
//            newArray[i] = employees[i];
//        }
//        newArray[newArray.length - 1] = "James";
//        employees = newArray;
//        employees[0] = null;
//        String[] newestArray = new String[employees.length - 1];
//        for (int i = 0, j = 0; i<employees.length; i++){
//            String employee = employees[i];
//            if (employee != null){
//                newestArray[j] = employee;
//                j++;
//            }
//        }
//        employees = newestArray;
//    }
    public static void main(String[] args) {
//        ArrayList<String> employees = getEmployees();
//        employees.add("James");
//        employees.remove("Black");
//        employees.remove("Nigger");
//        employees.remove(0);
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            numbers.add(i);
        }
        for(int number : numbers){
            System.out.println(number);
        }
    }
    private static ArrayList<String> getEmployees(){
        ArrayList <String> employees = new ArrayList<>();
        employees.add("Person");
        employees.add("Nigger");
        employees.add("Literally");
        employees.add("Black");
        employees.add("White");
        return employees;
//    public static void main(String[] args) {
//        int a = 5;
//        Integer a1 = 5;
//        byte b;
//        Byte b1;
//        short c;
//        Short c1;
//        long d;
//        Long d1;
//        char e;
//        Character e1;
//        float g;
//        Float g1;
//        double h;
//        Double h1;
//        boolean i;
//        Boolean i1;
//        String s = "1000";
//        String s1 = "2000";
//        int a = Integer.parseInt(s);
//        int a1 = Integer.parseInt(s1);
//        System.out.println(s + s1);
//        System.out.println(a + a1);
//        String s = "This is John. He is 27 years old.";
//        String name = s.substring(8, 12);
//        String age = s.substring(20, 22);
//        int age1 = Integer.parseInt(age);
//        System.out.println(name + " " + age1);
//        Human John = new Human(name, age1);
//        System.out.println(John.getAge() + " " + John.getName());
//    }
}}