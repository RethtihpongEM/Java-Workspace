import java.util.Scanner;

public class Lab3_3_EmOrmrethRethtihpong {

  static void menu(){
    System.out.println("Phone Setting: ");
    System.out.println("1. General\t\t\t>");
    System.out.println("2. Wi-Fi\t\t\t>");
    System.out.println("3. Bluetooth\t\t>");
    System.out.println("4. Mobile Data\t\t>");
    System.out.println("5. Hotspot\t\t\t>");
    System.out.println("6. Notification\t\t>");
    System.out.println("0. Quit\t\t\t\t>");
  }

  static void generalMenu(){
    System.out.println("General: ");
    System.out.println("1. About\t\t\t>");
    System.out.println("2. Software update\t>");
    System.out.println("3. Storage\t\t\t>");
    System.out.println("0. Back");
  }

  static void wifiMenu(){
    System.out.println("Wifi: ");
    System.out.println("Status\t\t\t\tOn");
    System.out.println("Network\t\t\t\tI-Coffee");
    System.out.println("1. Other networks\t>");
    System.out.println("0. Back");
  }
  static void otherNetwork(){
    System.out.println("Wifi > Other networks:");
    System.out.println("Bayon Coffee\t\t\t*****");
    System.out.println("Angkor Coffee\t\t\t**");
    System.out.println("Brown Coffee\t\t\t****");
    System.out.println("Koi\t\t\t\t\t\t*");
    System.out.println("0. Back");
  }
  static void aboutMenu(){
    System.out.println("General > About:");
    System.out.println("Name\t\t\t\tiPhone");
    System.out.println("Model\t\t\t\tIXs");
    System.out.println("Version\t\t\t\t18.5");
    System.out.println("0. Back");
  }
  static void softwareUpdate(){
    System.out.println("General > Software Update:");
    System.out.println("======================");
    System.out.println("Software is up to date");
    System.out.println("======================");
    System.out.println("0. Back");
  }
  static void notAvailable(){
    System.out.println("Title:");
    System.out.println("============================");
    System.out.println("The Feature is not available");
    System.out.println("============================");
    System.out.println("0. Back");
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput;
    do {
      menu();
      userInput = input.nextInt();
      switch (userInput){
        case 0:
          System.exit(0);
        case 1:
          do {
            generalMenu();
            userInput = input.nextInt();
            if (userInput == 0){
              break;
            }
            if (userInput == 1){
              do {
                aboutMenu();
                userInput = input.nextInt();
                if(userInput == 0){
                  break;
                }else{
                  System.out.println("Invalid option...");
                }
              }while (true);
            }else if (userInput == 2){
              do {
                softwareUpdate();
                userInput = input.nextInt();
                if (userInput == 0){
                  break;
                }else{
                  System.out.println("Invalid option...");
                }
              }while (true);
            }else{
              do {
                notAvailable();
                userInput = input.nextInt();
                if (userInput == 0){
                  break;
                }else{
                  System.out.println("Invalid option...");
                }
              }while (true);
            }
          }while (true);
          break;
        case 2:
          do{
            wifiMenu();
            userInput = input.nextInt();
            if(userInput == 0){
              break;
            }else{
              System.out.println("Invalid option...");
            }
            if (userInput == 1){
              do {
                otherNetwork();
                userInput = input.nextInt();
                if (userInput == 0){
                  break;
                }else{
                  System.out.println("Invalid option...");
                }
              }while (true);
            }
          }while (true);
          break;
        default:
          do{
            notAvailable();
            userInput = input.nextInt();
            if (userInput == 0){
              break;
            }else{
              System.out.println("Invalid option...");
            }
          }while (true);
      }
    }while (true);
  }
}
