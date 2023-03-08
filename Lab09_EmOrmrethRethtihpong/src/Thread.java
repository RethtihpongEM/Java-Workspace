import java.util.ArrayList;

abstract class SubTask{
  int duration;
  String name;
}
class Task extends SubTask{
  Task(int duration , String name){
    this.duration = duration;
    this.name = name;
  }


}
class TaskProcess implements Runnable{
  Task task;
  TaskProcess(Task task){
    this.task =  task;
  }

  @Override
  public void run() {
    int time = this.task.duration/1000;
    for(int i=0;i<time;i++){
      double i1 = Double.valueOf(i);
      double time1 = Double.valueOf(time);
      double pct = ((i1+1)/time1 * 100);
      System.out.printf((i+1)+"s ::: " + this.task.name + " - %.2f"+ " %% " + " - processing\n",pct);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println(this.task.name + " Completed");

  }
}