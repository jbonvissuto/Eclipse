//Implement the blueprint of the Candy Machine

import java.util.*;

public class CandyMachine
{
  // Each candy machine is made of 1 CashRegister and 4 Dispensers
  CashRegister cashRegister;
  Dispenser candy;
  Dispenser chips;
  Dispenser gum;
  Dispenser cookies;
  
  //Default constructor to set the cashRegister and Dispensers with default values ()
  public CandyMachine()
  {
    CashRegister cashRegister = new CashRegister();
    Dispenser candy = new Dispenser();
    // -- Your Code for the rest of the components
  }
  
  //Constructor to set each components with user input values
  public CandyMachine( int a, int b)
  {
    Scanner console = new Scanner(System.in);
    
    // Example to set cashRegister
    cashRegister = new CashRegister(console.nextInt());
    
    // -- Add your Code for the rest of the components
    // Optional: Add Screen hints for input such as System.out.println("Set Cost of the item")
  }
  
  // Switch on the CandyMachine for operations
  public void On()
  {
    Scanner input = new Scanner(System.in);
    int choice;                   //variable to hold the selection    
    showSelection();              //Display the hint
    choice = input.nextInt();     //Make choice
    
    // Create a Sentinel loop to control the input     
    // Based on the input, sell different products
    // Hint 1: use switch/case 
    // Hint 2: call the sellProduct method
    // Hint 3: call method from cashRegister to add money.
    
    // -- Add your Code Here
          
  }
  
  
  // On Screen Hint for Selection Hint
  private void showSelection()
  {
    System.out.println("*** Welcome ***");
    // Optional: Add Code to show the current balance
    System.out.println("To select an item, enter ");   
    System.out.println("0 for Adding more cash");
    System.out.println("1 for Candy");
    System.out.println("2 for Chips");
    System.out.println("3 for Gum");
    System.out.println("4 for Cookies");
    System.out.println("9 to exit");
  }//end showSelection
  
  // Method to sell the product
  // Post Condition:
  //                If not enough item, print out "Sold out" and exit
  //                If not enough money inserted, ask for more money, or option to exit.
  //                Else, print out "Collect your item" and deduct deposit and inventory accordingly.
  private void sellProduct(Dispenser product, CashRegister cRegister)
  {
    // Add your code here
    
  }//end sellProduct
}


