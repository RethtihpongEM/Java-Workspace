import java.util.*;

class Student{
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
public class Lab04_1_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    ArrayList<Student> studArr = new ArrayList<Student>();
    Scanner input = new Scanner(System.in);
    int i = 0;
    String userInput;
    do {
      Student stud = new Student();
      System.out.println("Student #" + (i+1) + ": ");
      System.out.print("Id: ");
      stud.id = input.nextInt();
      System.out.print("Name: ");
      stud.name = input.next();
      System.out.print("Age: ");
      stud.age = input.nextInt();
      stud.setValue(stud.id, stud.name, stud.age);
      studArr.add(stud);
      System.out.print("Do you want to add more (y/n): ");
      userInput = input.next();
      userInput = userInput.toLowerCase();
      if (userInput.equals("n")){
        System.out.println();
        System.out.println("===========================================");
        System.out.println("| No  | ID    | Name\t\t\t\t| Age |");
        System.out.println("==========================================");
        for(int j=0;j<=i;j++){
          Student student = studArr.get(j);
          student.display(j);
        }
        System.out.println("===========================================");
        break;
      }
      i++;
    }while (true);
  }
}
