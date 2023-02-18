import java.util.Random;

public class CreateMatrix extends Thread{
  int row;
  int column;
  int [][]matrix;
  public CreateMatrix(int row,int column){
    this.row = row;
    this.column = column;
    matrix = new int [row][column];
  }
  public CreateMatrix(int row,int column, int[][] matrix){
    this.row = row;
    this.column = column;
    this.matrix  = matrix;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public int[][] getElement(){
    return matrix;
  }
  public void generateMatrix(){
    Random random = new Random();
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        matrix[i][j] = random.nextInt(10);
      }
    }
  }
  public void displayMatrix(){
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }

  @Override
  public void run() {
    super.run();
    generateMatrix();
  }
}
