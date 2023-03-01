import java.util.ArrayList;
import java.util.Scanner;

interface Borrowable{
  void borrow(String borrower);
  void returnItem();
  boolean isBorrowed();
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
    returnItem();
    arrayList.get(index).setBorrowed(borrowed);
  }
  public void borrowDVD(ArrayList<DVD> arrayList,int index){
    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.print("Input your name: ");
    name = scanner.nextLine();
    arrayList.get(index).borrow(name);
    arrayList.get(index).setBorrowed(isBorrowed());
  }
  public void returnDVD(ArrayList<DVD> arrayList,int index){
    returnItem();
    arrayList.get(index).setBorrowed(borrowed);
  }
  public void borrowCD(ArrayList<CD> arrayList,int index){
    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.print("Input your name: ");
    name = scanner.nextLine();
    arrayList.get(index).borrow(name);
    arrayList.get(index).setBorrowed(isBorrowed());
  }
  public void returnCD(ArrayList<CD> arrayList,int index){
    returnItem();
    arrayList.get(index).setBorrowed(borrowed);
  }

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
    System.out.println("No.  Book Name\t\t\t  Book ID  Book Author  \t\tBook Release Date");
    for(int i=0;i<books.size();i++){
      System.out.printf("%-4d %-20s %-8s %-20s %-18s ",(i+1), books.get(i).getBookName(),books.get(i).getBookID(),books.get(i).getBookAuthor(),books.get(i).getBookReleaseDate());
      if (!books.get(i).isBorrowed) {
        System.out.println("(available)");
      } else {
        System.out.println("(borrowed by " + books.get(i).getBorrower() + " )");
      }
    }
  }
  public void displayBorrowedBook(ArrayList<Book> books){
    System.out.println("No.  Book Name\t\t\t  Book ID  Book Author  \t\tBook Release Date");
    for(int i=0;i<books.size();i++) {
      if (books.get(i).isBorrowed) {
        System.out.printf("%-4d %-20s %-8s %-20s %-18s ",(i+1), books.get(i).getBookName(),books.get(i).getBookID(),books.get(i).getBookAuthor(),books.get(i).getBookReleaseDate());
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
class DVD extends BorrowableItem implements Borrowable{
  private String dvdName;
  private String dvdArtist;
  private String dvdReleaseDate;
  private boolean isBorrowed;
  private String dvdID;

  public void setDvdID(String dvdID) {
    this.dvdID = dvdID;
  }

  public String getDvdID() {
    return dvdID;
  }

  public void setDvdArtist(String dvdArtist) {
    this.dvdArtist = dvdArtist;
  }

  public void setDvdName(String dvdName) {
    this.dvdName = dvdName;
  }

  public void setDvdReleaseDate(String dvdReleaseDate) {
    this.dvdReleaseDate = dvdReleaseDate;
  }

  public String getDvdArtist() {
    return dvdArtist;
  }

  public String getDvdName() {
    return dvdName;
  }

  public String getDvdReleaseDate() {
    return dvdReleaseDate;
  }
  public void setBorrowed(boolean borrowed){
    isBorrowed = borrowed;
  }
  public void display(ArrayList<DVD> dvds) {
    System.out.println("No.  DVD Name \t\t\t  DVD ID   DVD Artist   \t\tDVD Release Date");
    for(int i=0;i<dvds.size();i++){
      System.out.printf("%-4d %-20s %-8s %-20s %-18s ",(i+1), dvds.get(i).getDvdName(),dvds.get(i).getDvdID(),dvds.get(i).getDvdArtist(),dvds.get(i).getDvdReleaseDate());
      if (!dvds.get(i).isBorrowed) {
        System.out.println("(available)");
      } else {
        System.out.println("(borrowed by " + dvds.get(i).getBorrower() + " )");
      }
    }
  }
  public void displayBorrowedDvd(ArrayList<DVD> dvds){
    System.out.println("No.  DVD Name \t\t\t  DVD ID   DVD Artist   \t\tDVD Release Date");
    for(int i=0;i<dvds.size();i++) {
      if (dvds.get(i).isBorrowed) {
        System.out.printf("%-4d %-20s %-8s %-20s %-18s ",(i+1), dvds.get(i).getDvdName(),dvds.get(i).getDvdID(),dvds.get(i).getDvdArtist(),dvds.get(i).getDvdReleaseDate());
        System.out.println("(borrowed by " + dvds.get(i).getBorrower() + " )");
      }
    }
  }
  public int searchByID(ArrayList<DVD> dvds, String id){
    int index = 0;
    for(index = 0;index<dvds.size();index++){
      if(dvds.get(index).getDvdID().equals(id)){
        break;
      }
    }
    if(index == dvds.size()){
      System.out.println("DVD is not found");
      index = -99;
    }
    return index;
  }
}

class CD extends BorrowableItem implements Borrowable{
  private String cdName;
  private String cdArtist;
  private String cdReleaseDate;
  private boolean isBorrowed;
  private String id;

  public void setCDId(String id) {
    this.id = id;
  }

  public String getCDId() {
    return id;
  }

  public void setCDArtist(String cdArtist) {
    this.cdArtist = cdArtist;
  }

  public void setCDName(String cdName) {
    this.cdName = cdName;
  }

  public void setCDReleaseDate(String cdReleaseDate) {
    this.cdReleaseDate = cdReleaseDate;
  }

  public String getCDArtist() {
    return cdArtist;
  }

  public String getCDName() {
    return cdName;
  }

  public String getCDReleaseDate() {
    return cdReleaseDate;
  }

  @Override
  public void setBorrowed(boolean borrowed) {
    isBorrowed = borrowed;
  }

  public void display(ArrayList<CD> cds) {
    System.out.println("No.  CD Name  \t\t\t  CD ID    CD Artist    \t\tCD Release Date");
    for(int i=0;i<cds.size();i++){
      System.out.printf("%-4d %-20s %-8s %-20s %-18s ",(i+1), cds.get(i).getCDName(),cds.get(i).getCDId(),cds.get(i).getCDArtist(),cds.get(i).getCDReleaseDate());
      if (!cds.get(i).isBorrowed) {
        System.out.println("(available)");
      } else {
        System.out.println("(borrowed by " + cds.get(i).getBorrower() + " )");
      }
    }
  }
  public void displayBorrowedCD(ArrayList<CD> cds){
    System.out.println("No.  CD Name  \t\t\t  CD ID    CD Artist    \t\tCD Release Date");
    for(int i=0;i<cds.size();i++) {
      if (cds.get(i).isBorrowed) {
        System.out.printf("%-4d %-20s %-8s %-20s %-18s ",(i+1), cds.get(i).getCDName(),cds.get(i).getCDId(),cds.get(i).getCDArtist(),cds.get(i).getCDReleaseDate());
        System.out.println("(borrowed by " + cds.get(i).getBorrower() + " )");
      }
    }
  }
  public int searchByID(ArrayList<CD> cds, String id){
    int index = 0;
    for(index = 0;index<cds.size();index++){
      if(cds.get(index).getCDId().equals(id)){
        break;
      }
    }
    if(index == cds.size()){
      System.out.println("DVD is not found");
      index = -99;
    }
    return index;
  }
}
public class Lab08_2_EmOrmrethRethtihpong {
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
    ArrayList<DVD> dvdArrayList = new ArrayList<>();
    ArrayList<CD> cdArrayList = new ArrayList<>();
    int input;
    String name,id;
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
    CD cd = new CD();
    DVD dvd = new DVD();
    do {
      menu();
      input = scanner.nextInt();
      switch (input) {
        case 1:
          book.display(bookArrayList);
          break;
        case 2:
          dvd.display(dvdArrayList);
          break;
        case 3:
          cd.display(cdArrayList);
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
          }else if(input == 2){
            dvd.display(dvdArrayList);
            System.out.print("Enter DVD ID: ");
            scanner.nextLine();
            id = scanner.nextLine();
            int index = dvd.searchByID(dvdArrayList,id);
            if (index == -99) {
              break;
            }else if(dvdArrayList.get(index).getBorrower() != null){
              System.out.println("DVD is unavailable");
            }else{
              borrowableItem.borrowDVD(dvdArrayList,index);
            }
          }else if(input == 3){
            cd.display(cdArrayList);
            System.out.print("Enter DVD ID: ");
            scanner.nextLine();
            id = scanner.nextLine();
            int index = cd.searchByID(cdArrayList,id);
            if (index == -99) {
              break;
            }else if(cdArrayList.get(index).getBorrower() != null){
              System.out.println("CD is unavailable");
            }else{
              borrowableItem.borrowCD(cdArrayList,index);
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
          }else if(input == 2){
            dvd.displayBorrowedDvd(dvdArrayList);
            System.out.print("Enter DVD ID: ");
            scanner.nextLine();
            id = scanner.nextLine();
            int index = dvd.searchByID(dvdArrayList,id);
            borrowableItem.returnDVD(dvdArrayList,index);
          }else if(input == 3){
            cd.displayBorrowedCD(cdArrayList);
            System.out.print("Enter DVD ID: ");
            scanner.nextLine();
            id = scanner.nextLine();
            int index = cd.searchByID(cdArrayList,id);
            borrowableItem.returnCD(cdArrayList,index);
          }else{
            System.out.println("Invalid Input...");
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
          }else if(input == 2){
            dvd = new DVD();
            System.out.print("Enter dvd ID: ");
            scanner.nextLine();
            dvd.setDvdID(scanner.nextLine());
            System.out.print("Enter dvd name: ");
            dvd.setDvdName(scanner.nextLine());
            System.out.print("Enter dvd artist: ");
            dvd.setDvdArtist(scanner.nextLine());
            System.out.print("Enter released date: ");
            dvd.setDvdReleaseDate(scanner.nextLine());
            dvd.setBorrowed(false);
            dvdArrayList.add(dvd);
          }else if(input == 3){
            cd = new CD();
            System.out.print("Enter cd ID: ");
            scanner.nextLine();
            cd.setCDId(scanner.nextLine());
            System.out.print("Enter cd name: ");
            cd.setCDName(scanner.nextLine());
            System.out.print("Enter cd artist: ");
            cd.setCDArtist(scanner.nextLine());
            System.out.print("Enter released date: ");
            cd.setCDReleaseDate(scanner.nextLine());
            cd.setBorrowed(false);
            cdArrayList.add(cd);
          }else{
            System.out.println("Invalid Input...");
          }
          break;
        case 7:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Input....");
      }
    } while (true);
  }
}



