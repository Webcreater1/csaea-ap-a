package CrashCourse; 

    public class Car {
    
        private int milesPerGallon;
        public double cost;
        private boolean isUsed;
        private boolean isDamaged;
        private int milesDriven;
        private String brand;
        public String licencePlate;

        Car(double cost, String brand, String licencePlate) {
            this.cost = cost;
            this.brand = brand;
            this.licencePlate = licencePlate;

            milesPerGallon = 26;
            isUsed = true;
            isDamaged = false;
            milesDriven = 87000;

        }

        public void crash(int damageAmount) {
            if (damageAmount > 10) {
                System.out.println("Sorry man your car is wrecked!");
                isDamaged = true;
                cost = 0;
            }
            else if (damageAmount > 5 && damageAmount < 10) {
                cost -= 25000.00; 
                System.out.println("You've got some major damage but its fixable!"); 
            }
            else if (damageAmount < 5) {
                cost -= 10000.00;
                System.out.println("You've got some minor damage but its easy to fix!");
            }
        }
    
        public void changeLicensePlate (String newLicensePlateNumber) {
            licencePlate = newLicensePlateNumber;
            System.out.println("Your new licence plate number is " + newLicensePlateNumber);
        }

        public void drive (int driveMiles) {
            milesDriven += driveMiles;
            isUsed = true;
        }

        public void maintenance (int degreeDone) {
            if (degreeDone <= 1) {
                cost += 2500.00;
                milesPerGallon += 1;
                System.out.println("You've improved your car!");
            }
            if (degreeDone < 3 && degreeDone > 1) {
                cost += 5000.00;
                milesPerGallon += 2;
                System.out.println("You've improved your car by a good amount!");
            }
            if (degreeDone >= 3) {
                cost += 7500.00;
                milesPerGallon += 3;
                System.out.println("You've improved your car by a lot!");
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    
    }






