import java.util.Date;
import java.util.Scanner;
import java.util.Random;

class Matrix{
  int rowA;
  int columnA;
  int rowB;
  int columnB;
  int [][] matrixA;
  int [][] matrixB;
  int [][] resultMatrix;

  void createMatrix(){
    Scanner scanf = new Scanner(System.in);
    boolean checkIfMatrixIsCorrect = false;
    do {
      System.out.println("Matrix A: ");
      System.out.print("Input row: ");
      this.rowA = scanf.nextInt();
      System.out.print("Input column: ");
      this.columnA = scanf.nextInt();
      System.out.println("Matrix B: ");
      System.out.print("Input row: ");
      this.rowB = scanf.nextInt();
      System.out.print("Input column: ");
      this.columnB = scanf.nextInt();

      if(columnA == rowB){
        checkIfMatrixIsCorrect = true;
      }else{
        System.out.println("Cannot calculate please input again....");
      }
    }while (!checkIfMatrixIsCorrect);

      System.out.println("Matrix A: ");
      matrixA = new int[this.rowA][this.columnA];
      for (int i=0;i<this.rowA;i++){
        for (int j=0;j<this.columnA;j++){
          System.out.print("Input " + (i+1) + " x " + (j+1) + " : ");
          matrixA[i][j] = scanf.nextInt();
        }
      }
      System.out.println("Matrix B: ");
      matrixB = new int[this.rowB][this.columnB];
      for (int i=0;i<this.rowB;i++){
        for (int j=0;j<this.columnB;j++){
          System.out.print("Input " + (i+1) + " x " + (j+1) + " : ");
          matrixB[i][j] = scanf.nextInt();
        }
      }
  }
  void multiply() {
    resultMatrix = new int[3500][3500];
    Date start = new Date();
    for (int i = 0; i < 3500; i++) {
      for (int j = 0; j < 3500; j++) {
        resultMatrix[i][j] = 0;
        for (int k = 0; k < 3500; k++) {
          resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
        }
      }
    }
    Date end = new Date();
    System.out.println("\nTime taken in seconds: " + (double)(end.getTime() - start.getTime())/1000);
  }
  void displayMatrix(){
    System.out.println("Matrix A: ");
    for (int i=0;i<this.rowA;i++){
      for (int j=0;j<this.columnA;j++){
        System.out.print(matrixA[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Matrix B: ");
    for (int i=0;i<this.rowB;i++){
      for (int j=0;j<this.columnB;j++){
        System.out.print(matrixB[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Result: ");
    for (int i=0;i<this.rowA;i++){
      for (int j=0;j<this.columnB;j++){
        System.out.print(resultMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}

class SingleThread extends Matrix{
  void createMenu(){
    System.out.println("==== Menu ====");
    System.out.println("1. Create Matrix");
    System.out.println("2. Auto Generate Matrix");
    System.out.println("3. Multiply Matrix");
    System.out.println("4. Exit");
    System.out.print("Please choose an option: ");
  }
  void autoGenerateMatrix(){
    boolean checkIfMatrixIsCorrect = false;
    Scanner scanf = new Scanner(System.in);
    Random rand = new Random();
//    do {
//      System.out.println("Matrix A: ");
//      System.out.print("Input row: ");
//      this.rowA = scanf.nextInt();
//      System.out.print("Input column: ");
//      this.columnA = scanf.nextInt();
//      System.out.println("Matrix B: ");
//      System.out.print("Input row: ");
//      this.rowB = scanf.nextInt();
//      System.out.print("Input column: ");
//      this.columnB = scanf.nextInt();
//
//      if(columnA == rowB){
//        checkIfMatrixIsCorrect = true;
//      }else{
//        System.out.println("Cannot calculate please input again....");
//      }
//    }while (!checkIfMatrixIsCorrect);
    matrixA = new int[3500][3500];
    for (int i=0;i<3500;i++){
      for (int j=0;j<3500;j++){
        matrixA[i][j] = rand.nextInt(100);
      }
    }
    matrixB = new int[3500][3500];
    for (int i=0;i<3500;i++){
      for (int j=0;j<3500;j++){
        matrixB[i][j] = rand.nextInt(100);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);
    int userInput;
    SingleThread singleThread = new SingleThread();
    do {
      singleThread.createMenu();
//      userInput = scanf.nextInt();1
      switch (2){
        case 1:
          singleThread.createMatrix();
          break;
        case 2:
          singleThread.autoGenerateMatrix();
          singleThread.multiply();
          System.exit(0);
          break;
        case 3:
//          singleThread.displayMatrix();
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Invalid input...");
      }
    }while (true);
  }
}
public class Main {
  public static void main(String[] args) {
  }
}