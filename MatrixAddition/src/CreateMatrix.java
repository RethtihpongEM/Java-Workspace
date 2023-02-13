import java.util.Random;

public class CreateMatrix extends Thread {
  private int row;
  private int column;
  private int [][] matrix;
  public int getRow(){
    return row;
  }
  public int getColumn(){
    return column;
  }
  public int getElement(int i,int j){
    return matrix[i][j];
  }
  CreateMatrix(int row,int column){
    this.row = row;
    this.column = column;
    matrix = new int[row][column];
  }
  void randomMatrix(){
    Random random = new Random();
    for(int i=0;i<row;i++){
      for(int j =0 ;j<column;j++){
        matrix[i][j] = random.nextInt(100);
      }
    }
  }
  void display(){
      for (int i=0;i<row;i++){
        for (int j=0;j<column;j++){
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
  }

  @Override
  public void run() {
    super.run();
    randomMatrix();
  }
}
