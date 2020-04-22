//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class assingment4_Bonus {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			 int n = input.nextInt();
			 int a = 0;
			 n = Math.abs(n);
			 int temp = n;
			 printStars2(n, temp);
			
		}
	public static void printStars2(int x, int y) {
		if(x>0) {
			for(int i = 0; i <= y - x; i++) {
				System.out.print("*");
			}
			System.out.println();
			printStars2(x - 1, y);
			for(int i = 0; i <= y - x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
