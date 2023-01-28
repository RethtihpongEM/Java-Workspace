import java.util.*;
class Video{
  String title;
  String uploader;
  int length;
  String type;
  void setValue(String title, String uploader, int length, String type){
    this.title = title;
    this.uploader = uploader;
    this.length = length;
    this.type = type;
  }
  void display(int i){
    System.out.printf("%d. %s\n", (i+1), title);
  }
}
public class Lab04_4_EmOrmrethRethtihpong{
  static void mainMenu(){
    System.out.println("==== Menu ====");
    System.out.println("1. Search");
    System.out.println("2. View all videos");
    System.out.println("3. Add a new video");
    System.out.println("4. Quit");
    System.out.print("Choose an option: ");
  }
  static int askInput(){
    Scanner input = new Scanner(System.in);
    int userInput;
    userInput= input.nextInt();
    return userInput;
  }
  public static void main(String[] args) {
    Video[] vdoArr = new Video[100];
    Video[] tmpArr = new Video[100];
    Scanner input = new Scanner(System.in);
    int index = 0;
    boolean checkVdo;
    do {
    mainMenu();
    Video video = new Video();
    switch (askInput()){
      case 1:
        int found = 0;
        String tmp;
        checkVdo = false;
        if (index == 0){
          System.out.println("List is empty....");
          break;
        }else{
          System.out.print("Input title: ");
          video.title = input.nextLine();
          video.title = video.title.toLowerCase();
          for(int i=0;i<index;i++){
            tmp = vdoArr[i].title.toLowerCase();
            if(tmp.contains(video.title)){
              tmpArr[found] = vdoArr[i];
              found++;
              checkVdo = true;
            }
          }
          if (checkVdo){
            System.out.printf("%d videos found: \n", found);
            for (int i=0;i<found;i++){
              tmpArr[i].display(i);
            }
          }else{
            System.out.printf("%d video found. Try again\n", found);
          }
        }
        break;
      case 2:
        if(index!= 0){
          for(int i=0;i<index;i++){
            vdoArr[i].display(i);
          }
        }else{
          System.out.println("List is empty...");
        }
        break;
      case 3:
        checkVdo =false;
        System.out.print("Input title: ");
        video.title = input.nextLine();
        if (index > 0){
          for(int i=0;i<index;i++){
            if (vdoArr[i].title == video.title){
              checkVdo = true;
              break;
            }
          }
        }
        if (checkVdo){
          System.out.println("Title is already exist...");
        }else{
          System.out.print("Uploader: ");
          video.uploader = input.nextLine();
          System.out.print("Length: ");
          video.length = input.nextInt();
          input.nextLine();
          System.out.print("Type: ");
          video.type = input.nextLine();
          video.setValue(video.title, video.uploader, video.length, video.type);
          vdoArr[index] = video;
          index++;
        }
        break;
      case 4:
        System.exit(0);
    }
    }while (true);
  }
}