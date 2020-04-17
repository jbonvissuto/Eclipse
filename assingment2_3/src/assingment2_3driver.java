//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class assingment2_3driver {
	public static void main(String[]args) {
	Day day = new Day();
	day.setDay("Monday");
	System.out.println("The day is "  + day.getDay());
	System.out.println("The next day is "  + day.nextDay());
	System.out.println("The previous day was "  + day.prevDay());
	System.out.println("The day plus 28 is "  + day.addDay(28));
	}
}
