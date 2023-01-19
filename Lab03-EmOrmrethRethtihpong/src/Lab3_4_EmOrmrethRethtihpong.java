import java.util.*;
class Student{
  public int id ;
  public String name;
  public int age;
  public void displayStudent(int j){
    System.out.printf("| %d\t\t| %d\t\t| %s\t\t\t| %d\t\t|\n", j+1,id, name, age);
  }
}
public class Lab3_4_EmOrmrethRethtihpong {
  public static void main(String[] args) {

    String str;

    Scanner input = new Scanner(System.in);

    Student[] studArr = new Student[100];

    int i=0;

    while (true){
      studArr[i] = new Student();
      System.out.printf("Student #%d:\n",i+1);

      System.out.print("Id: ");
      studArr[i].id = input.nextInt();
      System.out.print("Name: ");
      studArr[i].name = input.next();
      System.out.print("Age: ");
      studArr[i].age = input.nextInt();

      System.out.print("Do you want to add more (y/n)?: ");
      str = input.next();
      str = str.toLowerCase();

      if (str.equals("n")){
        System.out.println();
        System.out.println("=================================================");
        System.out.println("| No\t| ID\t\t| Name\t\t\t| Age\t\t|");
        System.out.println("=================================================");

        for (int j=0;j<=i;j++){
          studArr[j].displayStudent(j);
        }

        System.out.println("=================================================");
        break;
      }else{
        i++;
      }
    }
  }
}
