import java.util.ArrayList;
import java.util.Scanner;

public class Lab09_1_EmOrmrethRethtihpong {
  static void header(){
    System.out.println(":::: Task Handler :::::");
    System.out.println("======================================================");
    System.out.printf("| %-10s | %-20s | %-8s |%n","No","Name","Duration      ");
    System.out.println("======================================================");
  }
  static void menu(){
    System.out.println("=====================================================");
    System.out.println("1. Add new Task\n"+
            "2. Delete Task\n"+
            "3. Process Tasks\n");
    System.out.print("Choose an option : ");
  }
  public static void main(String[] args) throws InterruptedException{
    Scanner scanner = new Scanner(System.in);
    int input;
    long start = System.nanoTime();
    ArrayList<Thread> listThread =  new ArrayList<>();
    ArrayList<Task> listTask = new ArrayList<>();
    Thread thread1 = new Thread(new TaskProcess(new Task(1000, "Format hard disk")));
    listTask.add(new Task(1000,"Format hard disk"));
    Thread thread2 = new Thread(new TaskProcess(new Task(6000, "Download video")));
    listTask.add(new Task(6000,"Download video"));
    Thread thread3 = new Thread(new TaskProcess(new Task(8000, "Develop an app")));
    listTask.add(new Task(8000,"Develop an app"));
    listThread.add(thread1);
    listThread.add(thread2);
    listThread.add(thread3);
    do {
      header();
      for(int i=0;i<listTask.size();i++){
        System.out.printf("| %-10d | %-20s | %-8d "+"mills "+"|%n",(i+1),listTask.get(i).name,listTask.get(i).duration);
      }
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1: {
          System.out.print("Enter Your name task : ");
          scanner.nextLine();
          String name = scanner.nextLine();
          System.out.print("Enter Duration of Task : ");
          int duration = scanner.nextInt();
          Thread thread = new Thread(new TaskProcess(new Task(duration,name)));
          listTask.add(new Task(duration,name));
          listThread.add(thread);
        }
        case 2: {
          ArrayList<Thread> tmpThread = new ArrayList<>();
          ArrayList<Task> tmpTask = new ArrayList<>();
          System.out.print("Input No of Thread that you wanna delete : ");
          int noDel = scanner.nextInt();
          for(int i=0;i<listTask.size();i++){
            if(noDel != (i+1)){
              tmpTask.add(listTask.get(i));
              tmpThread.add(listThread.get(i));
            }
          }
          listTask.clear();
          listThread.clear();
          listTask = tmpTask;
          listThread = tmpThread;
        }
        case 3: {
          ArrayList<Thread> tmpThread = new ArrayList<>();
          System.out.println("Select tasks to perform in parallel process : ");
          for(int i=0;i<listThread.size();i++){
            System.out.print("Input task No : ");
            int noTask = scanner.nextInt();
            if(noTask == (i+1))
              tmpThread.add(listThread.get(i));
            System.out.print("Do you wanna to add more tasks (y/n)? ");
            char c = scanner.next().charAt(0);
            if(c == 'n')
              break;
          }
          for(Thread eachThread : tmpThread){
            eachThread.start();
          }
        }
      }
    }while (true);
  }

}
