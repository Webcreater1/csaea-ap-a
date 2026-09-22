package CrashCourse;
public class HolyKnight {
    
    String characterName;
    int health; 
    int magicPower; 
    int agility;
    int strength; 
    boolean hasPartner;
    int age; 
    String rank;
    String kingdomName;


    public HolyKnight(String characterName, int strength, String kingdomName) {
        this.characterName = characterName;
        this.strength = strength;
        this.kingdomName = kingdomName;

        agility = 67;
        magicPower = 10;
        hasPartner = true;
        age = 50;
        health = 75;
        rank = "Novice";
    }

    public void train() {
        strength += 1;
        agility += 1;
    }

    public void fightCharacter(int amount) {
        health -= amount;
        if (health < 0) {
            System.out.println("You Died.");
        }
        else {
            System.out.println("You went up a rank!");
        }
    }

    public void practiceSpells() {
        magicPower += 1;
    }

    public void haveBirthday() {
        age += 1;
    }

    public void moveLocation() {
        System.out.println("You have moved to a new destination!");
    }

    public void rest() {
        health += 5;
        System.out.println("Zzzzz...");
    }
    
    public void obliterateAndDefect() {
        System.out.println("You had to flee after destroying the kingdom!");
        System.out.println("You no longer have a rank because you defected.");
        hasPartner = false;
    }

}
