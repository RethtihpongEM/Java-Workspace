import java.util.*;

class Category{
  String brandName;
  String type;
}

class Product{
  String model;
  String color;
  String serialNumber;
  int year;
  float price;
  Category category;
  void setValues(String productModel, String productColor, String productSerial, int productYear, float productPrice
  , Category productCategory){
    model = productModel;
    color = productColor;
    serialNumber = productSerial;
    year = productYear;
    price = productPrice;
    category = productCategory;
  }
  void display(){
    System.out.println("Model: " + model);
    System.out.println("Color: " + color);
    System.out.println("Serial Number: " + serialNumber);
    System.out.println("Year: " + year);
    System.out.println("Price: " + price + " USD");
    System.out.println("Brand: " + category.brandName);
    System.out.println("Type: " + category.type);
    System.out.println();
  }
}

class Video{
  String title;
  int duration; //sec
  int view;
  int like;
  int dislike;
}

class User{
  String username;
  String ID;
  String email;
  int subscriber;
  String password;
  Video video;
  void setValues(String userName, String userID, String userEmail,String userPassword, int userSub, Video userVdo){
    username = userName;
    ID = userID;
    email = userEmail;
    password = userPassword;
    subscriber = userSub;
    video = userVdo;
  }
  void display(){
    System.out.println("Username: " + username);
    System.out.println("ID: " + ID);
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
    System.out.println("Subscriber: " + subscriber);
    System.out.println("Title: " + video.title);
    System.out.println("Duration: " + video.duration + " s");
    System.out.println("Views: " + video.view);
    System.out.println("Like: " + video.like);
    System.out.println("Dislike: " + video.dislike);
    System.out.println();
  }
}

class Author{
  String authorName;
  String bestSeller;
  int authorRating;
  float authorNetWorth;
  String firstBook;
}
class Book{
  String title;
  String type;
  float price;
  int unit;
  String description;
  Author author;
  void setValue(String bookTitle, String bookType, float bookPrice, int bookUnit, String bookDesc, Author bookAuthor){
    title = bookTitle;
    type = bookType;
    price = bookPrice;
    unit = bookUnit;
    description = bookDesc;
    author = bookAuthor;
  }
  void display(){
    System.out.println("Title: " + title);
    System.out.println("Type: " + type);
    System.out.println("Price: " + price);
    System.out.println("Unit: " + unit);
    System.out.println("Description: " + description);
    System.out.println("Author Name: " + author.authorName);
    System.out.println("Best Seller: " + author.bestSeller);
    System.out.println("Author Rating: " + author.authorRating);
    System.out.println("Author Net worth: " + author.authorNetWorth);
    System.out.println("First Book: " + author.firstBook);
    System.out.println();
  }
}


public class Lab3_8_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    Product[] prodArr = new Product[3];

    Category category1 = new Category();
    category1.brandName = "Apple";
    category1.type = "Smart Watch";

    Category category2 = new Category();
    category2.brandName = "Samsung";
    category2.type = "Smart Phone";

    Category category3 = new Category();
    category3.brandName = "Google";
    category3.type = "Smart Phone";

    Product prod1 = new Product();
    prod1.setValues("Iwatch", "Sierra Blue","A0112894", 2022,700,category1);
    prodArr[0] = prod1;

    Product prod2 = new Product();
    prod2.setValues("Galaxy Z-flip 3", "White","S01121", 2022,1500,category2);
    prodArr[1] = prod2;

    Product prod3 = new Product();
    prod3.setValues("Pixel 3XL", "Black","G013244", 2018,550,category3);
    prodArr[2] = prod3;

    for (Product prod: prodArr){
      prod.display();
    }

    User[] userArr = new User[3];

    Video vdo1 = new Video();
    vdo1.title = "How to gain views?";
    vdo1.duration = 240;
    vdo1.view = 1000000;
    vdo1.like = 30000;
    vdo1.dislike = 1200;

    Video vdo2= new Video();
    vdo2.title = "How to drink water";
    vdo2.duration = 180;
    vdo2.view = 10000;
    vdo2.like = 300;
    vdo2.dislike = 5000;

    Video vdo3 = new Video();
    vdo3.title = "What is API";
    vdo3.duration = 2750;
    vdo3.view = 3500000;
    vdo3.like = 72000;
    vdo3.dislike = 52;

    User user1 = new User();
    user1.setValues("MKBHD", "mkbhd4256", "mkbhd@gmail.com", "mkbhd141",
            12000000, vdo1);
    userArr[0] = user1;

    User user2 = new User();
    user2.setValues("Pewds", "Pewds4E", "pewds@gmail.com", "pewpewpew",
            70000000, vdo2);
    userArr[1] = user2;

    User user3 = new User();
    user3.setValues("Khan Academy", "KhanAcadDemy", "khan@gmail.com", "academyKhan",
            3000000, vdo3);
    userArr[2] = user3;

    for (User user: userArr){
      user.display();
    }

    Book[] bookArr = new Book[3];

    Author author1 = new Author();
    author1.authorName = "JK Rowling";
    author1.bestSeller = "Harry Potter";
    author1.authorRating = 8;
    author1.authorNetWorth = 120000;
    author1.firstBook = "Rabbit";

    Author author2 = new Author();
    author2.authorName = "Stephen King";
    author2.bestSeller = "IT";
    author2.authorRating = 7;
    author2.authorNetWorth = 110000;
    author2.firstBook = "Carrie";

    Author author3 = new Author();
    author3.authorName = "JRR Tolkien";
    author3.bestSeller = "Lord of the Ring";
    author3.authorRating = 7;
    author3.authorNetWorth = 2000000;
    author3.firstBook = "The Silmarillion";

    Book book1 = new Book();
    book1.setValue("Harry Potter", "Mystery",25, 1000, "A boy who does magic", author1);
    bookArr[0] = book1;

    Book book2 = new Book();
    book2.setValue("IT", "Horror",20, 2000, "A clown", author2);
    bookArr[1] = book2;

    Book book3 = new Book();
    book3.setValue("Lord of the Ring", "Fantasy",23, 1500, "Magic world", author3);
    bookArr[2] = book3;

    for(Book bk:bookArr){
      bk.display();
    }


  }
}
