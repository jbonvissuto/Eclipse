//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class assingment4_1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		 int n = input.nextInt();
		 
		 n = Math.abs(n);
		 printStars1(n);
		
	}
	public static void printStars1(int x) {
		
		if(x>0) {
			for(int i = 0; i < x; i++) {
				System.out.print("*");
			}
			System.out.println();
			printStars1(x -1);
			for(int i = 0; i < x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}
	
}
