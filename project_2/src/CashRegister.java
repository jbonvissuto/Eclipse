//Implement class cashRegister

public class CashRegister
{
  private int cashOnHand;   //variable to store the cash in the register
  
  //Default constructor to set the cash in the register to 0
  //Postcondition: cashOnHand = 0
  public CashRegister()
  {
    // -- Your Code Here
  }
  
  //Constructor with parameters to set the cash in the register to a specific amount
  //Postcondition: cashOnHand = cashIn
  public CashRegister(int cashIn)
  {
    // -- Your Code Here
  }
  
  //Method to show the current amount in the cash register
  //Postcondition: The value of the instance variable cashOnHand is returned.
  public int currentBalance()
  {
	  return 0 ;
    // -- Your Code Here
  }
  
  //Method to receives the amount deposited by the customer and updates the amount in the register
  //Postcondition: cashOnHand = cashOnHand + amountIn
  public void acceptAmount(int amountIn)
  {
    // -- Your Code Here
  }
  
  //Method to deduct the amount deposited by the customer and updates the amount in the register
  //Postcondition: cashOnHand = cashOnHand - amountCost
  public void deductAmount(int amountCost)
  {
    // -- Your Code Here
  }
}

