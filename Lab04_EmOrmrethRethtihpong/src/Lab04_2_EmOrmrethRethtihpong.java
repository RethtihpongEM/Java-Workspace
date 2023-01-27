import java.util.*;
class Student2{
  int id;
  String name;
  int age;
  void setValue(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
  void display(int j){
    System.out.printf("| %-4d| %-6d| %-20s| %-4d|\n", (j+1),id, name, age);
  }
}
public class Lab04_2_EmOrmrethRethtihpong {
  static void mainMenu(){
    System.out.println("==== MENU ====");
    System.out.println("1. View all students");
    System.out.println("2. Add a new student");
    System.out.println("3. Delete a student");
    System.out.println("4. Quit");
    System.out.print("Choose an option: ");
  }
  public static void main(String[] args) {
    int counter = 0;
    int inputNum;
    boolean checkID;
    Scanner input = new Scanner(System.in);
    Student2[] studArr = new Student2[100];
    do {
      mainMenu();
      inputNum = input.nextInt();
      switch (inputNum){
        case 1:
          if (counter == 0 ){
            System.out.println("List is empty...");
            break;
          }else{
            System.out.println();
            System.out.println("===========================================");
            System.out.println("| No  | ID    | Name\t\t\t\t| Age |");
            System.out.println("==========================================");
            for (int i=0;i<counter;i++){
              studArr[i].display(i);
            }
            System.out.println("==========================================");
          }
          break;
        case 2:
          checkID = false;
          Student2 stud = new Student2();
          System.out.print("Input ID: ");
          stud.id = input.nextInt();
          if (counter>0){
            for (int i=0;i<counter;i++){
              if (stud.id == studArr[i].id){
                checkID = true;
              }
            }
          }
          if (checkID){
            System.out.println("ID is already exist...");
            break;
          }else{
            System.out.print("Name: ");
            stud.name = input.next();
            System.out.print("Age: ");
            stud.age = input.nextInt();
            stud.setValue(stud.id, stud.name, stud.age);
            studArr[counter] = stud;
            counter++;
          }
          break;
        case 3:
          checkID = false;
          Student2 student2 = new Student2();
          System.out.print("Input ID: ");
          student2.id = input.nextInt();
          int j;
          for (j=0;j<counter;j++){
            if (student2.id == studArr[j].id){
              System.out.println("Student has been deleted..");
              System.out.println();
              System.out.println("===========================================");
              System.out.println("| No  | ID    | Name\t\t\t\t| Age |");
              System.out.println("==========================================");
              studArr[j].display(j);
              System.out.println("==========================================");
              for (int i = j;i<counter;i++){
                studArr[i] = studArr[i+1];
              }
              checkID = true;
              counter--;
              break;
            }
          }
          if (!checkID){
            System.out.println("Student not found! Try again");
          }
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Invalid Input...");
      }
    }while (true);
  }
}
