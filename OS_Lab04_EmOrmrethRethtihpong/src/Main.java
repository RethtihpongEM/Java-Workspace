import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    int rowA,columnA,rowB,columnB;
    boolean checkIfMatrixIsCorrect = false;
    do {
      System.out.println("Matrix A: ");
      System.out.print("Input row: ");
      rowA = scanner.nextInt();
      System.out.print("Input column: ");
      columnA = scanner.nextInt();
      System.out.println("Matrix B: ");
      System.out.print("Input row: ");
      rowB = scanner.nextInt();
      System.out.print("Input column: ");
      columnB = scanner.nextInt();

      if(columnA == rowB){
        checkIfMatrixIsCorrect = true;
      }else{
        System.out.println("Cannot calculate please input again....");
      }
    }while (!checkIfMatrixIsCorrect);
    Date start = new Date();
    CreateMatrix matrixA = new CreateMatrix(rowA ,columnA);
    CreateMatrix matrixB = new CreateMatrix(rowB,columnB);
    matrixA.start();
    matrixB.start();
    System.out.println("Matrix A:");
    matrixA.displayMatrix();
    System.out.println("Matrix B:");
    matrixB.displayMatrix();
    int [][] result = new int[matrixA.getRow()][matrixB.getColumn()];
    MultiplyMatrix multiplyMatrix = new MultiplyMatrix(matrixA.getElement(),matrixB.getElement(),result);
    multiplyMatrix.start();
    multiplyMatrix.join();
    Date end = new Date();
    System.out.println("\nTime taken in seconds: " + (double)(end.getTime() - start.getTime())/1000);
    CreateMatrix resultMatrix = new CreateMatrix(matrixA.getRow(),matrixB.getColumn(),result);
    resultMatrix.displayMatrix();
  }
}