import module java.base;
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
House h1 = new House(140000.00, "9 Spongebob Lane", 3400);
h1.cost
h1.height
h1.isHaunted
h1.color
h1.squareFeet
h1.address
h1.haveBackyard
h1.addRoom()
h1.paintHouse(“blue”)
h1.removeRoom()
h1.addBasement()
h1.removeBasement()
h1.murderInHouse()
h1.move(“41 Mark Drive”)
House h2 = new House(100000.00, “19 Squidward Lane”, 4600)
h2.cost
h2.height
h2.isHaunted
h2.color
h2.squareFeet
h2.address
h2.haveBackyard
h2.addRoom()
h2.paintHouse(“green”)
h2.removeRoom()
h2.addBasement()
h2.removeBasement()
h2.murderInHouse()
h2.move(“41 Mark Drive”)
House h3 = new House(250000.00, “1 Patty Lane”, 2700)
h3.cost
h3.height
h3.isHaunted
h3.color
h3.squareFeet
h3.address
h3.haveBackyard
h3.addRoom()
h3.paintHouse(“yellow”)
h3.removeRoom()
h3.addBasement()
h3.removeBasement()
h3.murderInHouse()
h3.move(“41 Mark Drive”)
House h4 = new House(850000.00, “9 Patrick Road”, 6800)
h4.cost
h4.height
h4.isHaunted
h4.color
h4.squareFeet
h4.address
h4.haveBackyard
h4.addRoom()
h4.paintHouse(“orange”)
h4.removeRoom()
h4.addBasement()
h4.removeBasement()
h4.murderInHouse()
h4.move(“41 Mark Drive”)
House h5 = new House(85000.00, “19 Krabs Ave”, 1700)
h5.cost
h5.height
h5.isHaunted
h5.color
h5.squareFeet
h5.address
h5.haveBackyard
h5.addRoom()
h5.paintHouse(“red”)
h5.removeRoom()
h5.addBasement()
h5.removeBasement()
h5.murderInHouse()
h5.move(“41 Mark Drive”)

