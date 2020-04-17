public class Person
{
    private String firstName; //store the first name
    private String middleName;//stores the middle name
    private String lastName;  //store the last name

        //Default constructor
        //Initialize firstName and lastName to an empty string.
        //Postcondition: firstName = ""; lastName = "";
    public Person()
    {
        firstName = "";
        middleName ="";
        lastName = "";
        
    }

        //Constructor with parameters
        //Set firstName, middleName and lastName according to the parameters.
        //Postcondition: firstName = first; middleName = middle; lastName = last;
    public Person(String first, String middle, String last)
    {
        setName(first, middle, last);
    }

    
    //Method to output the first name, middle Name and last name
        //in the form firstName lastName.
    public String toString()
    {
        return (firstName + " " + middleName + " " + lastName);
    }

        //Method to set firstName, middleName and lastName according to
        //the parameters.
        //Postcondition: firstName = first; middleName = middle; lastName = last;
    public void setName(String first, String middle, String last)
    {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    //Method to set the firstName
    public void setFirstName(String first)
    {
    	firstName = first;
    }
    //Method to set the middlename
    public void setMiddleName(String middle)
    {
    	middleName = middle;
    }
    
    //Method to set the lastname
    public void setLastName(String last)
    {
    	lastName = last;
    }
    
    	//Method to return firstName.
        //Postcondition: The value of firstName is returned.
    public String getFirstName()
    {
        return firstName;
    }
    //Method to return the middlename
    public String getMiddleName() {
    	return middleName;
    }
        //Method to return lastName.
        //Postcondition: The value of lastName is returned.
    public String getLastName()
    {
        return lastName;
    }
    //Method to check if this person is equal to person b
    public boolean equals(Person b){
    	  if(this.lastName == b.lastName && this.firstName == b.firstName)
    	  return true;
    	else
    	  return false;
    	}
   //Method to check if the firstnames are equal
    public boolean firstNameEquals(Person b) {
    	  if(this.firstName == b.firstName)
        	  return true;
    	  else
        	  return false;
    }
    //Method to check if the middlenames are equal
    public boolean middleNameEquals(Person b) {
  	  if(this.middleName == b.middleName)
      	  return true;
  	  else
      	  return false;
  }
    //Method to check if the lastnames are equal
    public boolean lastNameEquals(Person b) {
  	  if(this.lastName == b.lastName)
      	  return true;
  	  else
      	  return false;
  }
    //Makes this person a copy of person b
    public void makeCopy(Person b) {
    	this.firstName = b.firstName;
    	this.middleName = b.middleName;
    	this.lastName = b.lastName;
    }
    //Makes a copy of this person and returns it
    public Person getCopy() {
    	Person a2 = new Person(this.firstName, this.middleName, this.lastName);
    	return a2;
    }
    
}
    
    
    
    
    
    
    
    

