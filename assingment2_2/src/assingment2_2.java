
//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
import java.util.*;
public class  assingment2_2{
  public static void main(String[]args){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    char cont;
    int answer, guess, i = 0;
    System.out.println("Do you want to play a guessing game? (Y) or (N)");
    cont = input.next().charAt(0);
    while(cont == 'y' || cont == 'Y'){
      answer = rand.nextInt(90 - 10 +1) + 10;
      do {
        System.out.println("Enter your guess!");
        guess = input.nextInt();
        i++;
        if(guess < answer)
          System.out.println("The correct answer is higher!");
        else if(guess > answer)
          System.out.println("The correct answer is lower!");
        
      }while(guess != answer);
      System.out.print("Good job you got the answer (" + answer + ") in " + i + " tries\nDo you want to play agian (Y) or are you done? (N)");
      cont = input.next().charAt(0);
      
      
    }
    
  }
}//End main 