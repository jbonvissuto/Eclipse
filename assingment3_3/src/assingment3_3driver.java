//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Drives Cylinder
public class assingment3_3driver {

	public static void main(String[] args) {
		
		Cylinder cylinder1 = new Cylinder();
		Cylinder cylinder2 = new Cylinder( 3, 4, 2, 10);
		Cylinder cylinder3 = new Cylinder( 1, 1, 4, 20 );
		System.out.println("Cylinder1: " + cylinder1);
		System.out.println("Cylinder2: " + cylinder2);
		System.out.println("Cylinder3: " + cylinder3);
		
		System.out.println("Checking if Cylinder2 equals Cylinder3.");
		if(cylinder2.equals(cylinder3))
			System.out.println("Cylinder2 equals Cylinder3.");
		else
			System.out.println("Cylinder2 doesn't equal Cylinder3.");
		System.out.println("Copying the properties of Cylinder3 into Cylinder1.");
		cylinder1 = cylinder3.getCopy();
		System.out.println("Cylinder1: " + cylinder1);
		System.out.println("Cylinder1: " + cylinder3);
		System.out.println("Checking if Cylinder1 equals Cylinder3.");
		if(cylinder1.equals(cylinder3))
			System.out.println("Cylinder1 equals Cylinder3.");
		else
			System.out.println("Cylinder1 doesn't equal Cylinder3.");
		cylinder1.setCenter(4, 6);
		System.out.print("Set the center of Cylinder1 to "); cylinder1.printCenter();
		System.out.println();
		cylinder1.setHeight(15);
		System.out.println("Set height of Cylinder1 to " + cylinder1.getHeight());
		System.out.println("Cylinder1: " + cylinder1);
		System.out.println("Cylinder2: " + cylinder2);
		System.out.println("Cylinder3: " + cylinder3);
		System.out.println("Copying the properties of Cylinder 2 into Cylinder3");
		cylinder3.makeCopy(cylinder2);
		System.out.println("Cylinder2: " + cylinder2);
		System.out.println("Cylinder3: ");  cylinder3.printCylinder();
		System.out.print("The surface area of Cylinder1 is: "); cylinder1.printSurfaceArea();
		System.out.println();
		System.out.print("The volume of Cylinder1 is: ");  cylinder1.printVolume();
		System.out.println();
		System.out.print("The area of Cylinder1's base is: ");  cylinder1.printArea();
		System.out.println();
		System.out.print("The circumfrence of Cylinder1 is: ");  cylinder1.printCircumference();
		System.out.println();
	}
}
