//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Class Circle
public class Circle extends Point {
  protected double radius;
  //Default Constructor
  public Circle() {
	  super();
	  radius = 0;
  }
//Constructor with parameters
  public Circle(double xValue, double yValue, double radValue) {
	  super(xValue,yValue);
	  radius = radValue;
  }
  //Sets the radius
  public void setRadius(double radValue){
	  radius = radValue;
  }
  //Returns the radius
  public double getRadius() {
	  return radius;
  }
  //Calculates and returns the area 
  public double getArea() {
	return(Math.PI * radius *radius);
  }
  //Calculates and returns the circumference
  public double getCircumference() {
	  return(Math.PI * radius * 2);
  }
  //Converts the circle into string representation
  public String toString() {
	  return  super.toString()  +" radius: " +  String.format("%.2f", radius);
  }
  //Checks if one circle is equal to another 
  public boolean equals(Circle otherCircle) {
	 return( super.equals(otherCircle) && radius == otherCircle.radius) ;
  }
  //Copies the properties of one circle to another circle 
  public void makeCopy(Circle otherCircle) {
	  super.makeCopy(otherCircle);
	  radius = otherCircle.radius;
  }
  //Copies the properties of one circle to a temp circle 
  public Circle getCopy() {
	  Circle temp = new Circle();
	  temp.x = x; 
	  temp.y = y;
	  temp.radius = radius;
	  return temp;
  }
  //Prints a formated Circumference
  public void printCircumference() {
	  System.out.printf("%.2f", this.getCircumference());
  }
  //Prints a formated Area
  public void printArea() {
	  System.out.printf("%.2f", this.getArea());
  }
  //Prints the circle and all of its properties
  public void printCircle() {
	  System.out.print(toString());
  }
  
 
  
}