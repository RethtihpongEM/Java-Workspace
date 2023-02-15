import java.io.*;
import java.util.Scanner;

public class Lab05_4_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("==== Menu ====");
    System.out.println("1. View my note");
    System.out.println("2. Edit");
    System.out.println("3. Quit");
    System.out.print("Choose an option: ");
  }
  static void editMenu(){
    System.out.println("1. Append new line");
    System.out.println("2. Update at line");
    System.out.println("3. Delete line");
    System.out.println("4. Back");
    System.out.print("Choose an opt: ");
  }
  static void saveToFile(String newLine) throws IOException {
    FileWriter filewriter = new FileWriter("data.txt", true);
    PrintWriter printWriter = new PrintWriter(filewriter);
    printWriter.println(newLine);
    printWriter.close();
  }
  static void readFromFile() throws Exception {
    Scanner scanner = new Scanner(new File("data.txt"));
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }
  }
  static void deleteLineFromFile(int lineNumber) throws IOException {
    File oldFile = new File("data.txt");
    File newFile = new File("temp.txt");
    Scanner sc = new Scanner(oldFile);
    FileWriter fileWriter = new FileWriter(newFile, true);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    int line = 0;
    while(sc.hasNext()){
      line++;
      String currentLine = sc.nextLine();
      if(!currentLine.isEmpty() && line != lineNumber){
        printWriter.write(currentLine);
        printWriter.write("\n");
      }
    }
    printWriter.close();
    fileWriter.close();
    sc.close();
    oldFile.delete();
    File dump = new File("data.txt");
    newFile.renameTo(dump);
  }
  static void updateAtLine(int lineNumber, String updateInfo){
    File oldFile = new File("data.txt");
    File newFile = new File("temp.txt");
    int line = 0;
    String currentLine;
    try {
      FileWriter fileWriter = new FileWriter("temp.txt", true);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      PrintWriter printWriter = new PrintWriter(bufferedWriter);

      FileReader fileReader = new FileReader("data.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      while ((currentLine = bufferedReader.readLine()) != null){
        line++;
        if(lineNumber == line){
          printWriter.println(updateInfo);
        }else{
          printWriter.println(currentLine);
        }
      }
      bufferedReader.close();
      bufferedWriter.close();
      oldFile.delete();
      File dump = new File("data.txt");
      newFile.renameTo(dump);
    }catch (Exception e){
      System.out.println(e);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int userInput;
    String inputString;
    do {
      menu();
      userInput = scanner.nextInt();
      switch (userInput) {
        case 1:
          readFromFile();
          break;
        case 2:
          do {
            editMenu();
            userInput = scanner.nextInt();
            if (userInput == 1){
              System.out.print("Input a string for line: ");
              scanner.nextLine();
              inputString = scanner.nextLine();
              saveToFile(inputString);
              System.out.println("Line is appended to the note.");
            }else if(userInput == 2){
              System.out.print("Update at line: ");
              userInput = scanner.nextInt();
              System.out.print("Line : ");
              scanner.nextLine();
              inputString = scanner.nextLine();
              updateAtLine(userInput, inputString);
            }else if(userInput == 3){
              System.out.print("Delete line number: ");
              userInput = scanner.nextInt();
              deleteLineFromFile(userInput);
              System.out.println("Line #" + userInput + " is deleted");
            }else if(userInput == 4){
              break;
            }else{
              System.out.println("Invalid option...");
            }
          }while (true);
          break;
        case 3:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid option...");
          break;
      }
    }while (true);
  }
}
