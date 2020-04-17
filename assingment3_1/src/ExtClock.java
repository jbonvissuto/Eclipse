//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Class ExtClock
public class ExtClock extends Clock {
  private String zone;
  
  //Default constructor
  public ExtClock(){
    super();
    zone = "EST";
  }
   //Constructor with parameters 
  public ExtClock(int hours, int minutes, int seconds, String timeZone){
    super(hours, minutes, seconds);
    zone = timeZone;
  }
  //Sets the time zone
  public void setTimeZone(String timeZone){
    zone = timeZone;
  }
  //Gets the time zone
  public String getTimeZone(){
  return zone;
  }
  //Prints the time and the timezone
  public void printTime(){
   super.printTime();
   System.out.print(":" + getTimeZone());
  }
  //Checks if two ExtClocks are equal
  public boolean equals(ExtClock otherExtClock)
  {
    return (super.equals(otherExtClock) && zone == otherExtClock.zone);
  }
  //Copies the properties of one ExtClock to another ExtClock
  public void makeCopy(ExtClock otherExtClock) {
	super.makeCopy(otherExtClock);  
	zone = otherExtClock.zone;
  }
//Copies the properties of one ExtClock to a temp ExtClock
  public ExtClock getCopy() {
	ExtClock temp = new ExtClock(getHours(), getMinutes(), getSeconds(), zone);  
	return temp;
  }
  
}




