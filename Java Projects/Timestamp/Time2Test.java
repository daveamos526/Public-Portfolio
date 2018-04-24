//Time2Test - Test modified Time2 class
//David Amos
//References - 
//http://stackoverflow.com/questions/20601845/no-main-class-found-in-netbeans
//http://stackoverflow.com/questions/7585096/java-time-class
//https://docs.oracle.com/javase/7/docs/api/java/lang/Long.html?is-external=true

public class Time2Test 
{
    //begin main
   public static void main(String[] args)
           
   {
      //print name and assignment
      System.out.println("David Amos - Assignment 1-1\n");
       
      Time2 t1 = new Time2(); // 00:00:00
      Time2 t2 = new Time2(2); // 02:00:00
      Time2 t3 = new Time2(21, 34); // 21:34:00
      Time2 t4 = new Time2(12, 25, 42); // 12:25:42
      Time2 t5 = new Time2(t4); // 12:25:42
      
      //T6 working instance
      Time2 t6=new Time2(11, 59, 59);

      //display objects
      System.out.println("Constructed with:");
      displayTime("t1: all default arguments", t1);
      displayTime("t2: hour specified; default minute and second", t2);
      displayTime("t3: hour and minute specified; default second", t3);
      displayTime("t4: hour, minute and second specified", t4);
      displayTime("t5: Time2 object t4 specified", t5);
      displayTime("t6: Time2 object t6 with totalSeconds", t6);
      
   }
   
   //24-hour and 12-hour object views
   private static void displayTime(String header, Time2 t)
           
   {
       System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
   }
     
} // end class Time2Test

