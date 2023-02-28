import java.util.ArrayList;
import java.util.Scanner;

interface Borrowable{
  void borrow(String borrower);
  void returnItem();
  boolean isBorrowed();
}

class Book extends BorrowableItem implements Borrowable{
  private String bookName;
  private String bookAuthor;
  private String bookReleaseDate;
  private boolean isBorrowed;
  private String bookID;

  public void setBookID(String bookID) {
    this.bookID = bookID;
  }

  public String getBookID() {
    return bookID;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public void setBookReleaseDate(String bookReleaseDate) {
    this.bookReleaseDate = bookReleaseDate;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public String getBookName() {
    return bookName;
  }

  public String getBookReleaseDate() {
    return bookReleaseDate;
  }

  public void setBorrowed(boolean borrowed) {
    isBorrowed = borrowed;
  }

  public void display(ArrayList<Book> books) {
    for(int i=0;i<books.size();i++){
      System.out.print((i + 1) + ". " + books.get(i).getBookName() + " " + books.get(i).getBookID() + " "+ books.get(i).getBookAuthor()
              + " " + books.get(i).getBookReleaseDate() + " ");
      if (!books.get(i).isBorrowed) {
        System.out.println("(available)");
      } else {
        System.out.println("(borrowed by " + books.get(i).getBorrower() + " )");
      }
    }
  }
  public void displayBorrowedBook(ArrayList<Book> books){
    for(int i=0;i<books.size();i++) {
      if (books.get(i).isBorrowed) {
        System.out.print((i + 1) + ". " + books.get(i).getBookName() + " " + books.get(i).getBookID() + " " + books.get(i).getBookAuthor()
                + " " + books.get(i).getBookReleaseDate() + " ");
        System.out.println("(borrowed by " + books.get(i).getBorrower() + " )");
      }
    }
  }
  public int searchByID(ArrayList<Book> books, String id){
    int index = 0;
    for(index = 0;index<books.size();index++){
      if(books.get(index).getBookID().equals(id)){
        break;
      }
    }
    if(index == books.size()){
      System.out.println("Book is not found");
      index = -99;
    }
    return index;
  }
}



class BorrowableItem implements Borrowable{
  private String borrower;
  private boolean borrowed;

  public void setBorrowed(boolean borrowed) {
    this.borrowed = borrowed;
  }

  @Override
  public void borrow(String borrower) {
    this.borrower = borrower;
  }

  @Override
  public void returnItem() {
    setBorrowed(false);
  }


  @Override
  public boolean isBorrowed() {
    return this.borrowed = true;
  }

  public String getBorrower() {
    return borrower;
  }
  public void borrowBook(ArrayList<Book> arrayList,int index){
    Scanner scanner = new Scanner(System.in);
    String name;
      System.out.print("Input your name: ");
      name = scanner.nextLine();
      arrayList.get(index).borrow(name);
      arrayList.get(index).setBorrowed(isBorrowed());
  }
  public void returnBook(ArrayList<Book> arrayList,int index){
    Scanner scanner = new Scanner(System.in);
    returnItem();
    arrayList.get(index).setBorrowed(borrowed);
  }
}
public class Lab08_2_EmOrmrethRethtihpong {
  static boolean askIfContinue() {
    System.out.print("Do you want to continue(y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }

  static void menu() {
    System.out.println(":::: The Library ::::");
    System.out.println("1. Display Book List");
    System.out.println("2. Display DVD List");
    System.out.println("3. Display CD List");
    System.out.println("4. Borrow an item");
    System.out.println("5. Return an item");
    System.out.println("6. Add an item");
    System.out.println("7. Quit");
    System.out.print("Choose an opt: ");
  }
  static void addItemMenu(){
    System.out.println("::::ADD ITEM::::");
    System.out.println("1. Book");
    System.out.println("2. DVD");
    System.out.println("3. CD");
    System.out.print("Choose an opt: ");
  }
  static void borrowMenu(){
    System.out.println(":::: To Borrow ::::");
    System.out.println("1. Book");
    System.out.println("2. DVD");
    System.out.println("3. CD");
    System.out.print("Choose an opt: ");
  }

  static void returnMenu(){
    System.out.println(":::: To Return ::::");
    System.out.println("1. Book");
    System.out.println("2. DVD");
    System.out.println("3. CD");
    System.out.print("Choose an opt: ");
  }
  public static void main(String[] args) {
    BorrowableItem borrowableItem = new BorrowableItem();
    ArrayList<Book> bookArrayList = new ArrayList<>();
//    ArrayList<DVD> dvdArrayList = new ArrayList<>();
//    ArrayList<CD> cdArrayList = new ArrayList<>();
    int input;
    String name,id;
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
//    CD cd = new CD();
//    DVD dvd = new DVD();
    do {
      menu();
      input = scanner.nextInt();
      switch (input) {
        case 1:

          break;
        case 2:
          book.display(bookArrayList);
          break;
        case 4:
          borrowMenu();
          input = scanner.nextInt();
          if(input == 1){
            book.display(bookArrayList);
            System.out.print("Enter book ID: ");
            scanner.nextLine();
            id = scanner.nextLine();
            int index = book.searchByID(bookArrayList,id);
            if (index == -99) {
              break;
            }else if(bookArrayList.get(index).getBorrower() != null){
              System.out.println("Book is unavailable");
            }else{
              borrowableItem.borrowBook(bookArrayList,index);
            }
          }
          break;
        case 5:
          returnMenu();
          input = scanner.nextInt();
          if(input == 1){
            book.displayBorrowedBook(bookArrayList);
            System.out.print("Enter book ID: ");
            scanner.nextLine();
            id = scanner.nextLine();
            int index = book.searchByID(bookArrayList,id);
            borrowableItem.returnBook(bookArrayList,index);
          }
          break;
        case 6:
          addItemMenu();
          input = scanner.nextInt();
          if (input == 1){
            book = new Book();
            System.out.print("Enter book ID: ");
            scanner.nextLine();
            book.setBookID(scanner.nextLine());
            System.out.print("Enter book name: ");
            book.setBookName(scanner.nextLine());
            System.out.print("Enter book author: ");
            book.setBookAuthor(scanner.nextLine());
            System.out.print("Enter released date: ");
            book.setBookReleaseDate(scanner.nextLine());
            book.setBorrowed(false);
            bookArrayList.add(book);
          }
          break;
      }
    } while (true);
  }
}


//class DVD{
//  private String dvdName;
//  private String dvdArtist;
//  private String dvdReleaseDate;
//
//  public void setDvdArtist(String dvdArtist) {
//    this.dvdArtist = dvdArtist;
//  }
//
//  public void setDvdName(String dvdName) {
//    this.dvdName = dvdName;
//  }
//
//  public void setDvdReleaseDate(String dvdReleaseDate) {
//    this.dvdReleaseDate = dvdReleaseDate;
//  }
//
//  public String getDvdArtist() {
//    return dvdArtist;
//  }
//
//  public String getDvdName() {
//    return dvdName;
//  }
//
//  public String getDvdReleaseDate() {
//    return dvdReleaseDate;
//  }
//}
//
//class CD{
//  private String cdName;
//  private String cdArtist;
//  private String cdReleaseDate;
//  public void setCDArtist(String dvdArtist) {
//    this.cdArtist = dvdArtist;
//  }
//
//  public void setCDName(String dvdName) {
//    this.cdName = cdName;
//  }
//
//  public void setCDReleaseDate(String cdReleaseDate) {
//    this.cdReleaseDate = cdReleaseDate;
//  }
//
//  public String getCDArtist() {
//    return cdArtist;
//  }
//
//  public String getCDName() {
//    return cdName;
//  }
//
//  public String getCDReleaseDate() {
//    return cdReleaseDate;
//  }
//}
