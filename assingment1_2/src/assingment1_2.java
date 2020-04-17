//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190

import java.util.*;
public class  assingment1_2{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String american_date, inter_date, month, day, year;
    System.out.println("Enter date in American format (Month Day, Year)");
    american_date = input.nextLine();//Gets user input.
    System.out.println("The date you entered was: " + american_date);
    month = american_date.substring(0, american_date.indexOf(" "));//Pulls the Month out of the input.
    day = american_date.substring( american_date.indexOf(" ") + 1, american_date.indexOf(",") );//Pulls the Day out of the input.
    year = american_date.substring(american_date.indexOf(",") + 2 );//Pulls the Year out of the input.
    inter_date = (year + "-" + month + "-" + day);//Creates the new formated date.
    System.out.println("This is the inputted date in international format : " + inter_date);//Prints date.
  }//Main ends
}//Class ends 