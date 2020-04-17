//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Drives Circle
public class assingment3_2driver{
//Test
	public static void main(String[]args) {
	
	Circle circle1 = new Circle();	
	Circle circle2 = new Circle(1,1,3);
	System.out.println("circle1: " + circle1);
	System.out.println("circle2: " + circle2);
	System.out.println("Changing the radius of circle1 to 10");
	circle1.setRadius(10);
	circle1.setPoint(3, 4);
	System.out.println("Creating a new circle (circle3) and copying the properties of circle 1 into it");
	Circle circle3 = new Circle();
	circle3 = circle1.getCopy();
	System.out.println("circle3: " + circle3);
	System.out.println("circle1: " + circle1);
	System.out.println("Checking if circle1 equals circle3");
	if(circle1.equals(circle3))
		System.out.println("circle1 equals circle3");
	else
		System.out.println("circle1 doesn't equal circle3");
	circle3.setPoint(-9, -9);
	System.out.print("circle3: ");
	circle3.printCircle();
	System.out.println();
	System.out.println("Checking if circle1 equals circle3");
	if(circle1.equals(circle3))
		System.out.println("circle1 equals circle3");
	else
		System.out.println("circle1 doesn't equal circle3");
	System.out.print("circle1's area is: ");  circle1.printArea(); System.out.print( " and it's circumfrence is: ");  circle1.printCircumference();
	System.out.println();
	System.out.print("circle1's area is: ");  circle2.printArea(); System.out.print( " and it's circumfrence is: ");  circle2.printCircumference();
	System.out.println();
	System.out.print("circle1's area is: ");  circle3.printArea(); System.out.print( " and it's circumfrence is: ");  circle3.printCircumference();
	System.out.println();
	Circle circle4 = new Circle();
	circle4.makeCopy(circle3);
	   System.out.println("Made circle4 and copied the properties of circle3 into it");
	   System.out.print("Circle4: "); circle4.printCircle();
	   System.out.println();
	}
  }