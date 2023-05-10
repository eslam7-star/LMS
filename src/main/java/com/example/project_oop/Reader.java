package com.example.project_oop;

public class Reader extends User {

    public Reader(int ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean isBlocked) {
        super(Password, "reader", FirstName, LastName, Address, CellPhone, Email, isBlocked);
    }

    public void rentBook(Book book) {
        // Rent a book from the library
    }

    public interface ReaderInterface {
      Scanner input = new Scanner(System.in);

    //private int id;
    //private String password;
    // the above variables must be in class Reader//
      
    ArrayList<Book> book_list = new ArrayList<>(50);
    ArrayList<Reader> reader_list = new ArrayList<>(50);
    
    public void Reader();//empty constructor 
    // I just added (void) to avoid errors but when implemented remove void,it must be a constructor
    
    public void setId(int id);

    public void setPassword(String password);

    public int getId();

    public String getPassword();
    
    //@Override
    public int searchBook(int book_id);
    
    //@Override
    public int searchUser(int user_id);

    public int checkReturnDate(int day, int month, int year);//method that return 1 if valid and 0 if not valid
    
    public float payFine(int reader_id, int book_id, int day, int month, int year);
    //If checkReturnDate() is => False => then Fine 10% of the Book's Price

    //@Override
    public void rentBook();
    // method that takes rederId and the bookId from the user and print the result of search

    //@Override
    public String Search_For_Book(int book_id);
    //search for book by bookId if not found it returns "Null" and prints "id not found"
}

}

