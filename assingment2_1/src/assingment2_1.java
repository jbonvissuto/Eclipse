//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190

import java.io.*;
import java.util.*;
public class  assingment2_1{
  public static void main(String[]args)
    throws FileNotFoundException{
    int lines = 0, words = 0, chars = 0; 
    Scanner read = new Scanner(new File("sample.txt"));
    while(read.hasNextLine()){
      lines ++;
      String line = read.nextLine();
      Scanner readline = new Scanner(line);
      while(readline.hasNext()){
        words++;
        String word = readline.next();
        chars += word.length();
      }
    }
      
    System.out.println("The file has " + lines + " lines, " + words + " words and " + chars + " chars.");
      
  }
}//End main 
