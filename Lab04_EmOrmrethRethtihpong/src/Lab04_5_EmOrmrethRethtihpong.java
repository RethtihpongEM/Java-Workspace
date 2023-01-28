import java.util.*;
class Song{
  String title;
  String singer;
  String length;
  float price;
  void display(int i){
    System.out.printf("| %-4d| %-20s| %-10s| %-8s| %-4f\n", (i+1),title, singer, length, price);
  }
}
class Album{
  String albumName;
  String genre;
  Song[] songs;
  void setValue(String albumName,String genre, Song[] songs){
    this.albumName = albumName;
    this.genre = genre;
    this.songs = songs;
  }
  void display(){
    System.out.printf("Album: %s\n",albumName);
  }
}
public class Lab04_5_EmOrmrethRethtihpong {
  static void mainMenu(){
    System.out.println("==== Menu ====");
    System.out.println("1. View a music store");
    System.out.println("2. Add a song");
    System.out.println("3. Create an album");
    System.out.println("4. Quit");
    System.out.print("Choose an option: ");
  }
  public static void main(String[] args) {
    ArrayList <Album> albumArr = new ArrayList<Album>();
    Scanner input = new Scanner(System.in);
    int userInput;
    int index = 0;
    do {
      Album album = new Album();
      Song song = new Song();
      mainMenu();
      userInput = input.nextInt();
      switch (userInput){
        case 3:
          System.out.println("===== Create new album =====");
          System.out.print("Album title: ");
          album.albumName = input.nextLine();
          System.out.print("Genre: ");
          album.genre = input.nextLine();
      }
    }while (true);
  }
}
