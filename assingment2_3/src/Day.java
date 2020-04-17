//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190

public class Day {
	private String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday",
			 "Thursday", "Friday", "Saturday"};
	private int day;
	
	public Day() {//Default Constructer .
		day = 0;
	}
	public Day(String d) {//Constructer with a given day.
		setDay(d);
	}
	public void setDay(String d) {//Assigns the private variable day the index of the given provided element of d.
		for (int i = 0; i<7; i++) {
			if(weekdays[i] == d) 
				day = i;
		}
	}
	
	public String getDay() {//Returns the day.
		return weekdays[day];
	}
	
	public String nextDay() {//Returns the next day.
		return weekdays[(day + 1)%7];
	}

	public String prevDay() {//Returns the previous day.
		return weekdays[(day + 6)%7];
	}
    
	public String addDay(int i) {//Returns the given day plus a variable of days.
		return weekdays[(day + i)%7];
	}
}


