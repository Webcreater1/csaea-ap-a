// package CrashCourse;
    public class House {
    
        private int sqaureFeet;
        private int height; //feet
        private String color;
        private boolean isHaunted;
        public double cost;
        private String address;
        private boolean haveBackyard;

        House(double cost, String address, int sqaureFeet) {
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
            System.out.println("You've added a room!");
        }

        public void paintHouse(String paintColor) {
            color = paintColor;
            System.out.println("Your house has been painted " + color);
        }

        public void removeRoom() {
            sqaureFeet -= 100;
            System.out.println("You've Removed A Room!");
            if (cost < 0) {
            cost = 0;
            
            }
            else {
            cost -= 5000.00;
            }
            }

        public void murderInHouse() {
            isHaunted = true;
            System.out.println("Ooooohoooh spoooky");
        }

        public void removeBasement() {
            System.out.println("You've Removed Your Basement!");
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
            System.out.println("You've added a basement!");
            height += 8;
            cost += 25000.00;
        }

        public void move (String newAddress) {
            address = newAddress;
            System.out.println("Your new address is " + newAddress);
        }


    }
