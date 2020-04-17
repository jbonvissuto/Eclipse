//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class assingment2_4driver {

	public static void main(String[] args) {
	Person a = new Person ("Jackson", "Kirkwood", "Bonvissuto");
	Person b = new Person ("Enna", "", "Gurung");
	Person c = new Person ("Isabella", "Grace", "Bonvissuto");
	System.out.println("Person a is " + a);
	System.out.println("Person b is " + b);
	System.out.println("Person c is " + c);
	c.setFirstName("John");
	c.setMiddleName("Kirkwood");
	b.setLastName("Bonvissuto");
	System.out.println("Person c first name is " + c.getFirstName());
	System.out.println("Person c middle name is " + c.getMiddleName());
	System.out.println("Person b last name is " + b.getLastName());
	if(a.firstNameEquals(c))
		System.out.println("The firstnames are the same");
	else
		System.out.println("The firstnames are not the same");
	if(a.middleNameEquals(c))
		System.out.println("The middlenames are the same");
	else
		System.out.println("The middlenames are not the same");
	if(a.lastNameEquals(b))
		System.out.println("The lastnames are the same");
	else
		System.out.println("The lastnames are not the same");
	
	c.makeCopy(a);
    Person b2 = b.getCopy();
    b2.setFirstName("Zelda");
	System.out.println("Person a is " + a);
	System.out.println("Person b is " + b);
	System.out.println("Person c is " + c);
	System.out.println("Person b2 is " + b2);
	
	}
	

	
}
