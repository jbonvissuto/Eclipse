//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class assingment4_2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a number and its exponenet");
		 int a = input.nextInt();
		 int b = input.nextInt();
		 System.out.println("The result of " + a + " to the "  + b + " = " + power(a,b));
	}
	
	public static double power(int x, int y) {
		
		if(y == 0)
			return 1;
		else if(y == 1) {
			return x;
		}
		else if(y == -1) {
			return 1.0/x;
		}
		else if (y>1) {
			return power(x*x, y -1);
		}
		else if(y<-1) {
			return  power(x*x, y +1 );
		}
		return power(x,y);
	}

}
