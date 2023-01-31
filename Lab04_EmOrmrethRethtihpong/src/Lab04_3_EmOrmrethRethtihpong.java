
import java.util.*;

class Book{
  int isbn;
  String title;
  float price;
  String author;
  void setValue(int isbn, String title, float price, String author){
    this.isbn = isbn;
    this.title = title;
    this.price = price;
    this.author = author;
  }
  void display(int i){
    System.out.printf("| %-4d| %-6d| %-30s| %-20s| $ %-4.2f |\n", (i+1),isbn, title, author, price);
  }
}
public class Lab04_3_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("==== MENU ====");
    System.out.println("1. View all books");
    System.out.println("2. Add a new book");
    System.out.println("3. Update a book");
    System.out.println("4 Quit");
    System.out.print("Choose an option: ");
  }
  static void displayHeader(){
    System.out.println();
    System.out.println("===============================================================================");
    System.out.println("| No  | ID    | Title\t\t\t\t\t\t  | Author  \t\t\t|  Price  |");
    System.out.println("===============================================================================");
  }
  static void displayFooter(){
    System.out.println("===============================================================================");
  }
  static int askInput(){
    Scanner input = new Scanner(System.in);
    int userInput;
    userInput= input.nextInt();
    return userInput;
  }
//  static boolean checkIfContinue(){
//    Scanner input = new Scanner(System.in);
//    String userInput;
//    System.out.print("Do you want to continue(y/n)?: ");
//    userInput = input.next();
//    userInput = userInput.toLowerCase();
//    return userInput.equals("y");
//  }
  public static void main(String[] args) {
    Book[] bookArr = new Book[100];
    int index=0;
    do {
      boolean checkIfExist = false;
      Book book = new Book();
      Scanner input = new Scanner(System.in);
      menu();
      switch (askInput()){
        case 1:
          if (index == 0){
            System.out.println("List is empty.....");
          }else{
            displayHeader();
            for(int i=0;i<index;i++){
              bookArr[i].display(i);
            }
            displayFooter();
          }
          break;
        case 2:
          System.out.print("Input IBSN: ");
          book.isbn = input.nextInt();

          if(index>0){
            for(int i=0;i<index;i++){
              if (book.isbn == bookArr[i].isbn){
                checkIfExist = true;
                break;
              }
            }
          }

          if(checkIfExist){
            System.out.println("Book is already exist...");
          }else{
            System.out.print("Title: ");
            input.nextLine();
            book.title = input.nextLine();
            System.out.print("Author: ");
            book.author = input.nextLine();
            System.out.print("Price: ");
            book.price = input.nextFloat();
            bookArr[index] = book;
            index++;
          }
          break;
        case 3:
          int i;
          do {
            if(index>0){
              System.out.print("Input IBSN: ");
              book.isbn = input.nextInt();
              for(i=0;i<index;i++){
                if (book.isbn == bookArr[i].isbn){
                  checkIfExist = true;
                  break;
                }
              }
              if(checkIfExist){
                System.out.println("Please update the following: ");
                System.out.print("ISBN: ");
                bookArr[i].isbn = input.nextInt();
                System.out.print("Title: ");
                input.nextLine();
                bookArr[i].title = input.nextLine();
                System.out.print("Author: ");
                bookArr[i].author = input.nextLine();
                System.out.print("Price: ");
                bookArr[i].price = input.nextFloat();
                break;
              }else{
                System.out.println("Book is not found. Try again");
              }
            }else{
              System.out.println("List is empty...");
              break;
            }
          }while (true);
        case 4:
          System.exit(0);
      }
    }while (true);
  }
}
