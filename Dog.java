public class Dog {
  
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        energyLevel = 100;
        weight = 22.7;
        age = 4;
        isHome = true;
        isHungry = false;

    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void scratch() {

    }

    public void bite() {

    }

    public void eat() {
        isHungry = false;
        weight += 0.25;
    }

    public void 



}
