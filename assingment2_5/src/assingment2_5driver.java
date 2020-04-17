//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class assingment2_5driver{
  public static void main(String arg[]){
    Book[] books = new Book[100];
   
    books[0] = new Book("Batman Year 1", "Jackson Bonvissuto, Billy Bob", "Dc Comics", "435-234-244", 111, 10);
    books[1] = new Book("Moon Knight", "John Smith ", "Marvel", "122-394-720", 1000, 9);
    books[0].setcopies(200);
    books[1].setcopies(9);
    searchByTitle(books, "Batman Year 1");
    searchByIsbn(books, "435-234-244");
    searchByTitle(books, "Moon Knight");
    searchByIsbn(books, "122-394-720");
  }
 
  private static void searchByTitle(Book[] books, String string){
    try{
      for(Book book: books){
        if (book.getTitle().equalsIgnoreCase(string)){
          System.out.println(book.toString());
        }
      }
    } 
    catch (Exception e){
    }
  }

private static void searchByIsbn(Book[] books, String string){
    try{
      for(Book book: books){
        if(book.getIsbn().equalsIgnoreCase(string)){
          System.out.println(book.toString());
        }
      }
    }
    catch (Exception e){
    }
  }
}