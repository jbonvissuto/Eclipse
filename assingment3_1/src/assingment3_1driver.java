//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Drives ExtClock
public class assingment3_1driver{
  public static void main(String arg[]){
   ExtClock clock1 = new ExtClock(6,1,0,"KST");
   ExtClock clock2 = new ExtClock();   
   System.out.print("Clock1 : "); clock1.printTime();
   System.out.println();
   System.out.print("Clock2 : "); clock2.printTime();
   System.out.println();
   System.out.println("Checking to see if the clocks are equal");
   if(clock2.equals(clock1))
	   System.out.println("The clocks are equal.");
   else
	   System.out.println("The clocks are not equal.");
   clock2 = clock1.getCopy();
   System.out.println("Copies the the properites of clock1 into clock2");
   System.out.print("Clock1 : "); clock1.printTime();
   System.out.println();
   System.out.print("Clock2 : "); clock2.printTime();
   System.out.println();
   System.out.println("Checking to see if the clocks are equal");
   if(clock2.equals(clock1))
	   System.out.println("The clocks are equal.");
   else
	   System.out.println("The clocks are not equal.");
   clock1.setTimeZone("EST");
   System.out.println("Set the time zone of clock1 to " + clock1.getTimeZone());
   System.out.print("Clock1 : "); clock1.printTime();
   System.out.println();
   ExtClock clock3 = new ExtClock();
   clock3.makeCopy(clock1);
   System.out.println("Made clock3 and copied the properties of clock1 into it");
   System.out.print("Clock3 : "); clock3.printTime();
   System.out.println();
  }
}