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
  void display(int index){
    System.out.printf("| %-4d | %-20s| %-10s| %-8s| $ %-4.2f|\n",(index+1), title,singer,length,price);
  }
}
class Album{
  String albumName;
  String genre;
  ArrayList<Song> songs;
  void setValue(String albumName,String genre){
    this.albumName = albumName;
    this.genre = genre;
    this.songs = new ArrayList<Song>();
  }

  void addSongToAlbum(Song songs){
    this.songs.add(songs);
  }
  void displayAlbum(){
    System.out.printf("Album: %s\n",albumName);
  }

  void displaySong(){
    int index=0;
    for (Song song: songs){
      song.display(index);
      index++;
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
          System.out.println("====== Music Store ======");
          for(Album albums: albumArr){
            System.out.println();
            albums.displayAlbum();
            if(albums.songs.size() == 0){
              System.out.println("None of song");
            }else{
              albums.displaySong();
            }
          }
          break;
        case 2:
          System.out.println("Select the following album: ");
          if(albumArr.size() == 0){
            System.out.println("No album found");
          }else{
            for(int i=0;i<albumArr.size();i++){
              System.out.println((i+1) + ". " + albumArr.get(i).albumName);
            }
            System.out.print("Choose an opt: ");
            userInput = input.nextInt();
            if (userInput > albumArr.size() || userInput< 0){
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
              albumArr.get(userInput-1).addSongToAlbum(song);
              System.out.println();
              System.out.println("A new song added to the album");
            }
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
