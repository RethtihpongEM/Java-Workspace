public class Main {
  public static void main(String[] args) throws InterruptedException {
    CreateMatrix matrixA = new CreateMatrix(2,2);
    matrixA.start();
    matrixA.join();
    CreateMatrix matrixB = new CreateMatrix(2,2);
    matrixB.start();
    matrixB.join();
    if(matrixA.getRow() == matrixB.getRow() && matrixB.getColumn() == matrixB.getColumn()){
      int [][] result = new int[matrixA.getRow()][matrixB.getColumn()];
      for (int i=0;i<matrixA.getRow();i++){
        for (int j=0;j<matrixA.getColumn();j++){
          MatrixAddition matrixAddition = new MatrixAddition(matrixA.getElement(i,j),matrixB.getElement(i,j));
          matrixAddition.start();
          matrixAddition.join();
          result[i][j] = matrixAddition.getResult();
        }
      }

      System.out.println("Matrix A: ");
      matrixA.display();
      System.out.println();
      System.out.println("Matrix B: ");
      matrixB.display();
      System.out.println();
      System.out.println("Result: ");
      for (int i=0;i<matrixA.getRow();i++){
        for (int j=0;j<matrixA.getColumn();j++){
          System.out.print(result[i][j] + " ");
        }
        System.out.println();
      }
    }else{
      System.out.println("Cannot Compute.....");
    }
  }
}