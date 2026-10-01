package Practice;

public class AttendanceTester {
    public static void main(String[] args) {
    		
        AttendanceRecord a1 = new AttendanceRecord("Jordan", 4);
        AttendanceRecord a2 = new AttendanceRecord("Riley", 7);

        a1.markPresent();
        a1.printAttendance();
        a2.printAttendance();

    }
}


class AttendanceRecord {
   private String name;
   private int daysPresent;
 
   public AttendanceRecord(String n, int d) {
      name = n;
      daysPresent = d;
   }
 
   public void markPresent() {
      daysPresent++;
   }
 
   public void printAttendance() {
      System.out.println(name + " — Days Present: " + daysPresent);
   }
}

