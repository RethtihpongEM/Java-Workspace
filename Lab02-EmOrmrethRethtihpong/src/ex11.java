//Exercise 11
class IDCard{
  String name;
  int IDcode;
  String position;
  String phoneNumber;
  String email;
}
class FacebookPost{
  int likeAmount;
  int commentAmount;
  int shareAmount;
  String caption;
  String accName;
}
class Phone{
  String color;
  int year;
  String model;
  String serialNumber;
  String ownerName;
  String warranty;
}
class Book{
  String type;
  String author;
  float price;
  String title;
  int unit;
}
public class ex11 {
  public static void main(String[] args) {
    IDCard id1 = new IDCard();
    IDCard id2 = new IDCard();
    IDCard id3 = new IDCard();

    id1.IDcode = 1001;
    id1.name = "Em Ormreth Rethtihpong";
    id1.position = "Full-Stack Dev";
    id1.phoneNumber = "012792811";
    id1.email = "rithtipongem@gmail.com";

    id2.IDcode = 1002;
    id2.name = "Khoun Sovannsunchhay";
    id2.position = "Frond-end Dev";
    id2.phoneNumber = "012355162";
    id2.email = "sovansunchhay.khoun@student.cadt.edu.kh";

    id3.IDcode = 1003;
    id3.name = "John Liza";
    id3.position = "Back-end Dev";
    id3.phoneNumber = "012125621";
    id3.email = "lizajohn@gmail.com";

    IDCard[] idCardArr = new IDCard[3];
    idCardArr[0] = id1;
    idCardArr[1] = id2;
    idCardArr[2] = id3;

    FacebookPost post1 = new FacebookPost();
    FacebookPost post2 = new FacebookPost();
    FacebookPost post3 = new FacebookPost();

    post1.accName = "Dara";
    post1.caption = "Happy new year";
    post1.likeAmount = 256;
    post1.commentAmount = 128;
    post1.shareAmount = 15;

    post2.accName = "Panha";
    post2.caption = "Happy birthday to me";
    post2.likeAmount = 98;
    post2.commentAmount = 25;
    post2.shareAmount = 0;

    post3.accName = "kakada";
    post3.caption = "New gear setup";
    post3.likeAmount = 29;
    post3.commentAmount = 12;
    post3.shareAmount = 1;

    FacebookPost[] facebookPostArr = new FacebookPost[3];
    facebookPostArr[0] = post1;
    facebookPostArr[1] = post2;
    facebookPostArr[2] = post3;

    Phone ph1 = new Phone();
    Phone ph2 = new Phone();
    Phone ph3 = new Phone();

    ph1.color = "Red";
    ph1.model = "XS MAX";
    ph1.ownerName = "Chhay";
    ph1.year = 2019;
    ph1.serialNumber = "A0123815";
    ph1.warranty = "Not Valid";

    ph2.color = "Midnight Green";
    ph2.model = "11 Pro MAX";
    ph2.ownerName = "Pong";
    ph2.year = 2020;
    ph2.serialNumber = "A0232315";
    ph2.warranty = "Not Valid";

    ph3.color = "Sierra Blue";
    ph3.model = "13 Pro Max";
    ph3.ownerName = "Pin";
    ph3.year = 2021;
    ph3.serialNumber = "A7683815";
    ph3.warranty = "Valid";

    Phone[] phoneArr = new Phone[3];
    phoneArr[0] = ph1;
    phoneArr[1] = ph2;
    phoneArr[2] = ph3;

    Book bk1 = new Book();
    Book bk2 = new Book();
    Book bk3 = new Book();

    bk1.author = "J.K Rowling";
    bk1.type = "Mystery";
    bk1.price = 21;
    bk1.title = "Harry Potter";
    bk1.unit = 10000;

    bk2.author = "William Golding";
    bk2.type = "Fantasy";
    bk2.price = 25;
    bk2.title = "Lord of the ring";
    bk2.unit = 10000;

    bk3.author = "Stephen King";
    bk3.type = "Horror";
    bk3.price = 15;
    bk3.title = "Carrie";
    bk3.unit = 10000;

    Book[] bookArr = new Book[3];
    bookArr[0] = bk1;
    bookArr[1] = bk2;
    bookArr[2] = bk3;
  }
}
