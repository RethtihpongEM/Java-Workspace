public class Main {
  public static void main(String[] args) throws InterruptedException {
    SumThread sumThread = new SumThread(100,50);
    Thread thread = new Thread(sumThread);
    thread.start();
    thread.join();

    SumThread sumThread1 = new SumThread(200, sumThread.getResult());
    thread = new Thread(sumThread1);
    thread.start();
    thread.join();

    System.out.println(sumThread1.getResult());

  }
}