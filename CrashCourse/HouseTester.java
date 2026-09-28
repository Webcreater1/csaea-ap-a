public class HouseTester {
    public static void main(String[] args) {
            
        House h1 = new House(167000.00, "5 John Road", 2800);
        House h2 = new House(420000.00, "1 Tor Road", 3000);
        House h3 = new House(355000.00, "9 James Road", 4500);
        House h4 = new House(280000.00, "7 Thomas Road", 2200);
        House h5 = new House(70000.00, "3 Cole Road", 1700);
        
        
        h1.getAddress();
        h1.setAddress("3 A2 lane");
        h1.getAddress();
        h1.getSqaureFeet();
        h1.setSquareFeet(4350);
        h1.getSqaureFeet();
        h1.getHaveBackyard();
        h1.setHaveBackyard(true);
        h1.getHaveBackyard();
        h1.getCost();
        h1.setCost(300000.00);
        h1.getCost();
        h1.addRoom();
        h1.paintHouse("Red");
        h1.removeBasement();
        h1.removeRoom();
        h1.addBasement();
        h1.murderInHouse();
        h1.move("22 Cole Lane");
       



        h2.addRoom();
        h2.paintHouse("Orange");
        h2.removeBasement();
        h2.removeRoom();
        h2.addBasement();
        h2.murderInHouse();
        h2.move("10 Cole Lane");



        h3.addRoom();
        h3.paintHouse("Yellow");
        h3.removeBasement();
        h3.removeRoom();
        h3.addBasement();
        h3.murderInHouse();
        h3.move("13 Cole Lane");



        h4.addRoom();
        h4.paintHouse("Green");
        h4.removeBasement();
        h4.removeRoom();
        h4.addBasement();
        h4.murderInHouse();
        h4.move("15 Cole Lane");


        h5.addRoom();
        h5.paintHouse("Blue");
        h5.removeBasement();
        h5.removeRoom();
        h5.addBasement();
        h5.murderInHouse();
        h5.move("17 Cole Lane");

    }
 
}
