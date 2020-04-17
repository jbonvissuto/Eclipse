//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Class CylinderS
public class Cylinder extends Circle {
	protected double height;
	//Default Constructor
	public Cylinder() {
		super();
		height = 0;
	}
	//Constructor with parameters
	public Cylinder(double xValue, double yValue, double radValue, double hValue) {
		super(xValue, yValue, radValue);
		height = hValue;
	}
	//Sets the height 
	public void setHeight(double hValue) {
		height = hValue;
	}
	//Returns the height 
	public double getHeight() {
		return height;
	}
	//Renames the setPoint method to setCenter
    public void setCenter(double xValue, double yValue) {
    	super.setPoint(xValue, yValue);
    }
     //Calculates and returns the surface area 
	public double getSurfaceArea() {
		return (2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);
	}
	//Calculates and returns the volume
	public double getVolume() {
		return (Math.PI * radius * radius * height);
	}
	//Prints a formated surface area
	public void printSurfaceArea() {
		System.out.printf("%.2f", this.getSurfaceArea());
	}
	//Prints a formated volume
	public void printVolume(){
		System.out.printf("%.2f", this.getVolume());
	}
	//Prints the center of the cylinder
	public void printCenter() {
		System.out.printf("[%.2f, %.2f]", this.x, this.y );
	}
	 //Converts the cylinder into string representation
	public String toString() {
		return  "Center: " + super.toString() + " height: " + String.format("%.2f", height);
	}
	 //Checks if one cylinder is equal to another 
	public boolean equals(Cylinder otherCylinder) {
		return(super.equals(otherCylinder) && height == otherCylinder.height) ;
	}
	//Copies the properties of one cylinder to another cylinder
	public void makeCopy(Cylinder otherCylinder) {
		super.makeCopy(otherCylinder);
		height = otherCylinder.height;
	}
	//Copies the properties of one cylinder to a temp cylinder
	public Cylinder getCopy() {
		Cylinder temp = new Cylinder();
		  temp.x = x; 
		  temp.y = y;
		  temp.radius = radius;
		  temp.height = height;
		  return temp;
	}
	//Prints the cylinder and all of its properties
	public void printCylinder() {
		System.out.print(toString());
	}
}
