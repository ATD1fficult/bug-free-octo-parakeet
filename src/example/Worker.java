package example;

public class Worker {
    String name;
    String work;
    int salary;

    Worker(String name, String work, int salary){
        this.name = name;
        this.work = work;
        this.salary = salary;
    }

    void showInfo(){
        System.out.println(name);
        System.out.println(work);
        System.out.println(salary);
    }
}
