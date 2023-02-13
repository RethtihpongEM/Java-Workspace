public class SumThread implements Runnable{
  private int a;
  private int b;
  private int result;
  public SumThread(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int getResult(){
    return result;
  }

  @Override
  public void run() {
    result = a+b;
  }
}
