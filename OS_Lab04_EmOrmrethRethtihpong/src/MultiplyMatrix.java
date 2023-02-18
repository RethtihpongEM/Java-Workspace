import java.util.ArrayList;

public class MultiplyMatrix extends AddByRow{
  private final int [][] matrixA;
  private final int [][] matrixB;
  private final int[][] result;
  MultiplyMatrix(int[][] matrixA, int[][] matrixB, int [][]result) {
    super(matrixA, matrixB, result);
    this.matrixA = matrixA;
    this.matrixB = matrixB;
    this.result = result;
  }

  @Override
  public void run() {
    super.run();
    ArrayList<Thread> threads = new ArrayList<>();
    for(int i=0;i<matrixA.length;i++){
      AddByRow run = new AddByRow(matrixA, matrixB, result, i);
      Thread thread = new Thread(run);
      thread.start();
      threads.add(thread);
      if(threads.size()%10 == 0){
        try {
          thread.join();
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
  }
