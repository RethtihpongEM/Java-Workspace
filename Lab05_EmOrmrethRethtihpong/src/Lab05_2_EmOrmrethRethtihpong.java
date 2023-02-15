import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
class Student{
  private int id;
  private String name;
  private int age;
  public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getId(){
    return id;
  }

  public void displayStudent(int i){
    System.out.printf("| %-4d | %-4d | %-30s | %-4d |\n", (i+1),id,name,age);
  }
}

public class Lab05_2_EmOrmrethRethtihpong {
  static void menu() {
    System.out.println("==== Menu ====");
    System.out.println("1. Add new students");
    System.out.println("2. Delete multiple students");
    System.out.println("3. Quit");
    System.out.print("Choose an opt: ");
  }
  static boolean askIfContinue(){
    System.out.print("Do you want to continue (y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    String name;
    int id;
    int age;
    int userInput;
    do {
      menu();
      userInput = scanner.nextInt();
      switch (userInput){
        case 1:
          do {
            Student student = new Student();
            System.out.println("Student #" + (studentArrayList.size()+1));
            System.out.print("Id: ");
            student.setId(scanner.nextInt());
            System.out.print("Name: ");
            scanner.nextLine();
            student.setName(scanner.nextLine());
            System.out.print("Age: ");
            student.setAge(scanner.nextInt());
            studentArrayList.add(student);
          }while (askIfContinue());
          break;
        case 2:
          int []deleteID = new int[50];
          int counter = 0;
          System.out.println("=======================================================");
          System.out.println("| No   | ID   | Name\t\t\t\t\t\t   | Age  |");
          System.out.println("=======================================================");
          for(int i=0;i<studentArrayList.size();i++){
            studentArrayList.get(i).displayStudent(i);
          }
          System.out.println("=======================================================");
          do {
            System.out.print("Input student #" + (counter+1) + " : ");
            deleteID[counter] = scanner.nextInt();
            counter++;
          }while (askIfContinue());
          System.out.println();
          for(int i=0;i<counter;i++){
            boolean found = false;
            int j;
            for (j=0;j<studentArrayList.size();j++){
              if(deleteID[i] == studentArrayList.get(j).getId()){
                System.out.println("Student with ID " + studentArrayList.get(j).getId() + " is deleted");
                studentArrayList.remove(j);
                found = true;
                break;
              }
            }
            if(!found){
              System.out.println("Student with ID " + deleteID[i] + " is not found");
            }
          }
          break;
        case 3:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid input....");
          break;
      }
    }while (true);
  }
}
