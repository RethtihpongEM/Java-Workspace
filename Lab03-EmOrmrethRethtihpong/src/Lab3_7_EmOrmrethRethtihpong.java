import java.util.*;
class Students{
  public int id ;
  public String name;
  public int age;

  public void setValue(int studentID, String studentName, int studentAge){
    id = studentID;
    name = studentName;
    age = studentAge;
  }
  public void displayStudent(int j){
    System.out.printf("| %d\t\t| %d\t\t| %s\t\t\t| %d\t\t|\n", j+1,id, name, age);
  }
}
public class Lab3_7_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("===== MENU =====");
    System.out.println("1. Create a student");
    System.out.println("2. List students");
    System.out.println("3. Quit");
    System.out.print("Choose an option: ");
  }
  Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int studentID;
    String studentName;
    int studentAge;
    int userInput;
    int studentNumber = 0;
    Scanner input = new Scanner(System.in);
    Students[] studArr = new Students[100];
    do {
      menu();
      userInput = input.nextInt();
      switch (userInput){
        case 1:
          Students stud = new Students();
          System.out.print("ID: ");
          studentID = input.nextInt();
          System.out.print("Name: ");
          studentName = input.next();
          System.out.print("Age: ");
          studentAge = input.nextInt();
          stud.setValue(studentID, studentName , studentAge);
          studArr[studentNumber] = stud;
          studentNumber++;
          break;
        case 2:
          System.out.println();
          System.out.println("=================================================");
          System.out.println("| No\t| ID\t\t| Name\t\t\t| Age\t\t|");
          System.out.println("=================================================");
          for (int j=0;j<studentNumber;j++){
            studArr[j].displayStudent(j);
          }
          break;
        case 3:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Input...");
      }
    }while (true);
  }
}
