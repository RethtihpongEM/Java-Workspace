import java.util.Scanner;

interface GridLayout{
  void insertAtRow(int rowNumber, int [] values);
  void insertAtColumn(int columnNumber, int[] values);
  void clearAtRow(int rowNumber);
  void clearAtColumn(int columnNumber);
  void updateCell(int rowNumber,int columnNumber,int value);
  void displayGrid();
  void clear();
}
class Grid implements GridLayout{

  int [][] array = new int[7][7];
  private int row;
  private int column;

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  public void setRow(int row) {
    this.row = row;
  }

  @Override
  public void insertAtRow(int rowNumber, int[] values) {
    for(int i=0;i<=6;i++){
      array[rowNumber][i] = values[i];
    }
  }

  @Override
  public void insertAtColumn(int columnNumber, int[] values) {
    for(int i=0;i<=6;i++){
      array[i][columnNumber] = values[i];
    }
  }

  @Override
  public void clearAtRow(int rowNumber) {
    for(int i=0;i<=6;i++){
      array[rowNumber][i] = 0;
    }
  }

  @Override
  public void clearAtColumn(int columnNumber) {
    for(int i=0;i<=6;i++){
      array[i][columnNumber] = 0;
    }
  }

  @Override
  public void updateCell(int rowNumber, int columnNumber, int value) {
    array[rowNumber][columnNumber] = value;
  }

  @Override
  public void displayGrid() {
    System.out.println(":::: The GRID ::::");
    System.out.println("\t0 1 2 3 4 5 6");
    System.out.println("\t- - - - - - -");
    for(int i=0;i<=6;i++){
      System.out.print(i + " - ");
      for(int j=0;j<=6;j++){
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

  @Override
  public void clear() {
    for (int j=0;j<=6;j++){
      for(int i=0;i<=6;i++){
        array[j][i] = 0;
      }
    }
  }
}
public class Lab08_1_EmOrmrethRethtihpong {
  static boolean askIfContinue(){
    System.out.print("Do you want to continue(y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }
  static void menu(){
    System.out.println("1. Update a single cell");
    System.out.println("2. Insert at a row");
    System.out.println("3. Insert at a column");
    System.out.println("4. Clear at a row");
    System.out.println("5. Clear at a column");
    System.out.println("6. Clear all");
    System.out.println("7. Quit");
    System.out.print("Choose an opt: ");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int []values = new int[7];
    int input;
    Grid grid = new Grid();
    do {
      grid.displayGrid();
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          System.out.print("Input row: ");
          grid.setRow(scanner.nextInt());
          System.out.print("Input column: ");
          grid.setColumn(scanner.nextInt());
          System.out.print("Input value: ");
          input = scanner.nextInt();
          grid.updateCell(grid.getRow(), grid.getColumn(), input);
          break;
        case 2:
          System.out.print("Input row: ");
          grid.setRow(scanner.nextInt());
          for(int i=0;i<=6;i++){
            System.out.print("Input column " + i + " : ");
            values[i] = scanner.nextInt();
          }
          grid.insertAtRow(grid.getRow(), values);
          break;
        case 3:
          System.out.print("Input column: ");
          grid.setColumn(scanner.nextInt());
          for(int i=0;i<=6;i++){
            System.out.print("Input row " + i + " : ");
            values[i] = scanner.nextInt();
          }
          grid.insertAtColumn(grid.getColumn(), values);
          break;
        case 4:
          System.out.print("Clear at a row : ");
          grid.setRow(scanner.nextInt());
          grid.clearAtRow(grid.getRow());
          break;
        case 5:
          System.out.print("Clear at a column : ");
          grid.setColumn(scanner.nextInt());
          grid.clearAtColumn(grid.getColumn());
          break;
        case 6:
          grid.clear();
          break;
        case 7:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Input...");
          break;
      }

    }while (true);
  }
}
