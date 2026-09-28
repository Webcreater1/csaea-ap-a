package Practice;

public class CarTester {
        
        public static void main(String[] args) {

            Car c1 = new Car(32000.99, "Toyota", "LK16PN");
            Car c2 = new Car(48000.99, "Volkswagen", "PO975N");

            
            c1.crash(6);
            c1.changeLicensePlate("RVW65L");
            c1.drive(147);
            c1.maintenance(2);
            c1.repair();

            c2.crash(13);
            c2.changeLicensePlate("M0N3YZ");
            c2.drive(273);
            c2.maintenance(3);
            c2.repair();



        }
    }
