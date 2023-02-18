public class AddByRow extends Thread{
  int[][] matrixA;
  int [][]matrixB;
  int[][] result;
  int row;
  AddByRow(int[][] matrixA, int [][]matrixB,int[][]result, int row){
    this.matrixA = matrixA;
    this.matrixB = matrixB;
    this.result = result;
    this.row = row;
  }
  AddByRow(int[][] matrixA, int [][]matrixB, int [][]result){
    this.matrixA = matrixA;
    this.matrixB = matrixB;
    this.result = result;
  }

  @Override
  public void run() {
    super.run();
    for (int i = 0; i < matrixA.length; i++) {
      result[row][i] = 0;
      for (int j = 0; j < matrixB.length; j++) {
        result[row][i] += matrixA[row][j] * matrixB[j][i];
      }
    }
  }
}
