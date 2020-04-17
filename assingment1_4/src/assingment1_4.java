//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class  assingment1_4{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int num, length, sum = 0;
    System.out.println("Enter a collection of numbers with no spaces");
    num = input.nextInt();
    num = Math.abs(num);
    String numstring = Integer.toString(num);
    length = numstring.length();
    for(int i = 0; i < length; i++) {
      sum += num%10;
      num = num/10;
    }
    for(int i =  0; i < length; i++){
      System.out.print(numstring.substring(i, i +1) + " ");
    }
    System.out.println("The sum of all digits is: " + sum);
  }
  
}