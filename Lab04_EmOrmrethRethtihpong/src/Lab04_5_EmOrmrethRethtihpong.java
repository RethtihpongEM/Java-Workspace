import java.util.*;
class Song{
  String title;
  String singer;
  String length;
  float price;
  void setValue(String title, String singer, String length, float price){
    this.title = title;
    this.length = length;
    this.singer = singer;
    this.price = price;
  }
  void display(){
    System.out.printf("|| %-20s| %-10s| %-8s| %-4f\n",title, singer, length, price);
  }
}
class Album{
  String albumName;
  String genre;
  Song[] songs;
  void setValue(String albumName,String genre){
    this.albumName = albumName;
    this.genre = genre;
  }

  void addSongToAlbum(Song[] songs){
    this.songs = songs;
  }

  void display(){
    System.out.printf("Album: %s\n",albumName);
  }

  void displaySong(){
    for (Song song: songs){
      song.display();
    }
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
        case 1:
          for(Album albums: albumArr){
            albums.display();
            System.out.println();
          }
          break;
        case 2:
          System.out.println("Select the following album: ");
          for(int i=0;i<albumArr.size();i++){
            albumArr.get(i).display();
          }
          System.out.print("Choose an opt: ");
          userInput = input.nextInt();
          if (userInput > albumArr.size()){
            System.out.println("Album doesn't exist");
          }else{
            input.nextLine();
            System.out.print("Song Title: ");
            song.title = input.nextLine();
            System.out.print("Singer: ");
            song.singer = input.nextLine();
            System.out.print("Length: ");
            song.length = input.nextLine();
            System.out.print("Price: ");
            song.price = input.nextFloat();
            song.setValue(song.title, song.singer, song.length, song.price);
          }
          break;
        case 3:
          System.out.println("===== Create new album =====");
          System.out.print("Album title: ");
          input.nextLine();
          album.albumName = input.nextLine();
          System.out.print("Genre: ");
          album.genre = input.nextLine();
          album.setValue(album.albumName, album.genre);
          albumArr.add(album);
      }
    }while (true);
  }
}
