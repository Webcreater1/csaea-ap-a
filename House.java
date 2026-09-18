public class House {
    
    private int sqaureFeet;
    private int height; //feet
    private String color;
    private boolean isHaunted;
    private double cost;
    private String address;
    private boolean haveBackyard;

    public House(int cost, String address, int sqaureFeet) {
        this.cost = cost;
        this.address = address;
        this.sqaureFeet = sqaureFeet;

        height = 32; //feet
        isHaunted = false;
        color = "Blue";
        haveBackyard = false;

    }

    public void addRoom() {
        sqaureFeet += 100;
        cost += 5000;
    }

    public void paintHouse(String paintColor) {
        color = paintColor;
        System.out.println("Your house has been painted " + color);
    }

    public void removeRoom() {
        sqaureFeet -= 100;
        if (cost < 0) {
            cost = 0;
        }
        else {
            cost -= 5000.00;
        }
    }

    public void murderInHouse() {
        isHaunted = true;
    }

    public void removeBasement() {
        if (height < 32) { // feet
            height = 32;
        } 
        else {
            height -= 8;
        }

        if (cost < 0) {
            cost = 0;
        }
        else {
            cost -= 25000.00;
        }
    }

    public void addBasement () {
        height += 8;
        cost += 25000.00;
    }

    public void move (String newAddress) {
        address = newAddress;
        System.out.println("Your new address is " + newAddress);
    }








}
