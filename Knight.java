public class Knight {
    

        
        //atributes and date
        //variables
    String characterName;
    int health; //0-100
    int energyLevel; //0-100
    boolean isHoly;
    int strength; // atleast 1
    boolean hasWeapon;
    int speed; // atleast 1


        //constructor --- special method called every time you make an object
        //same name as the class followed by parenthesis
        // BasicClass()
    public Knight(String characterName, int health, boolean isHoly) {
        this.characterName = characterName;
        this.health = health;
        this.isHoly = isHoly;

        energyLevel = 87;
        strength = 10;
        hasWeapon = true;
        speed = 50;

    }

        //behaviors / methods
        //you can write as many as you want

    public void eat() {
        energyLevel += 25;
        if (energyLevel > 100){
            energyLevel = 100;
        }

    }

    public void breakWeapon() {
        hasWeapon = false;
        health /= 2;
    }

    public void workout() {
        strength += 1;
        energyLevel -= 5;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            System.out.println("You Died.");
        }
    }


    
}
