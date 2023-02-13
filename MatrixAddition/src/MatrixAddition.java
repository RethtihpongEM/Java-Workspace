import java.util.Random;

public class MatrixAddition extends Thread{
  private int elementA;
  private int elementB;
  private int result;
  MatrixAddition(int elementA, int elementB){
    this.elementA = elementA;
    this.elementB = elementB;
  }

  public int getResult() {
    return result;
  }

  @Override
  public void run() {
    super.run();
    result = elementA + elementB;
  }
}