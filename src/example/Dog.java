package example;

public class Dog {
    String name;
    String species;
    int weight;

    int speed;
    String information (){
        return "Name: " + name +  "Species: " + species + "Weight: " + weight;
    }

     void Run () {
        for (int i = 0; i < speed; i += 1){
            System.out.println("Бегу");
        }
    }
}
