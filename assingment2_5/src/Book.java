
public class Book{
  private String title;
  private String authors;
  private String publisher;
  private String isbn;
  private double price;
  private int copies;
  
  //Defualt Constructor 
  public Book(){
    this.title = "";
    this.authors = "";
    this.publisher = "";
    this.price = 0;
    this.isbn = "";
    this.copies = 0;
  }
  //Constructuor with variables 
  public Book(String title, String authors, String publisher, 
              String isbn, double price, int copies){
    this.title = title;
    this.authors = authors;
    this.publisher = publisher;
    this.isbn = isbn;
    this.price = price;
    this.copies = copies;
  }
  //Method to set the title
  public void setTitle(String title){
	  this.title = title;
  }
  //Method to return the title
  public String getTitle(){
	    return title;
	  }
  
 //Method to set the Authors
  public void setAuthors(String authors){
    this.authors = authors;
  }
 //Method to return the authors 
  public String getAuthors(){
	    return authors;
	  }
//Method to set the Publisher 
  public void setPublisher(String publisher){
    this.publisher = publisher;
  }
 //Method to return the Publisher 
  public String getPublisher(){
	    return publisher;
	  }
  
//Method to set the ISBN 
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }
//Method to get the ISBN
  public String getIsbn(){
	    return isbn;
	  }
  
 //Method to set the price
  public void setPrice(double price){
    this.price = price;
  }
// Method to get the price
  public double getPrice(){
	    return price;
	  }
 //Method to set the numbers of copies in stock
  public void setcopies(int copies){
    this.copies = copies;
  }
  //Method to return the numbers of copies in stock
  public int getcopies(){
	    return copies;
	  }
  
  public String toString(){
    return "Title = " + title + ", Authors = " + authors + ", Publisher = " + publisher
      + ", Price = " + price + ", Number of copies in stock = " + copies;
  }
}