import java.util.Scanner;
import java.util.ArrayList;

class Shape{
  int length;
  int width;
  int height;
  int bottom;
}

class Line extends Shape{

  Line(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public void displayLine() {
    for(int i = 0; i<length; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}

class Rectangle extends Shape{

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void displayRectangle() {
    for(int i = 0; i<height; i++) {
      for(int j = 0; j<width; j++) {
        if(i == 0 || i == height-1 || j == 0 || j == width-1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

}

class Triangle extends Shape{
  Triangle(int bottom, int height){
    this.bottom = bottom;
    this.height = height;
  }
  public int getBase() {
    return bottom;
  }
  public int getHeight() {
    return height;
  }
  public void displayTriangle() {
    int spaces = height - 1;
    for(int i = 0; i<height; i++) {
      for(int j = 0; j<spaces; j++) {
        System.out.print(" ");
      }
      for(int j = 0; j<(i*2+1); j++) {
        System.out.print("*");
      }
      spaces--;
      System.out.println();
    }

  }
}

public class Lab05_3_EmOrmrethRethtihpong {
  static void menu() {
    System.out.println("==== Menu ====");
    System.out.println("1. View all line");
    System.out.println("2. View all rectangle");
    System.out.println("3. View all triangle");
    System.out.println("4. Add new shape");
    System.out.println("5. Exit");
    System.out.print("Choose an option: ");
  }
  static void addShapeMenu(){
    System.out.println("==== Add new shape ====");
    System.out.println("Select a shape");
    System.out.println("1. line");
    System.out.println("2. Rectangle");
    System.out.println("3. Triangle");
    System.out.print("Choose an option: ");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Line> lines = new ArrayList<Line>();
    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
    ArrayList<Triangle> triangles = new ArrayList<Triangle>();
    do {
      menu();
      int input = scanner.nextInt();
      scanner.nextLine();
      switch (input) {
        case 1:
          for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ". Length: " + lines.get(i).getLength());
            lines.get(i).displayLine();
          }
          break;
        case 2:
          for (int i = 0; i < rectangles.size(); i++) {
            System.out.println((i + 1) + ". Width: " + rectangles.get(i).getWidth() + " Height: " + rectangles.get(i).getHeight());
            rectangles.get(i).displayRectangle();
          }
          break;
        case 3:
          for (int i = 0; i < triangles.size(); i++) {
            System.out.println((i + 1) + ". Base: " + triangles.get(i).getBase() + " Height: " + triangles.get(i).getHeight());
            triangles.get(i).displayTriangle();
          }
          break;
        case 4:
          addShapeMenu();
          input = scanner.nextInt();
          scanner.nextLine();
          if (input == 1) {
            System.out.print("Input length: ");
            int length = scanner.nextInt();
            scanner.nextLine();
            lines.add(new Line(length));
          } else if (input == 2) {
            System.out.print("Input width: ");
            int width = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input height: ");
            int height = scanner.nextInt();
            scanner.nextLine();
            rectangles.add(new Rectangle(width, height));
          } else if (input == 3) {
            System.out.print("Input bottom: ");
            int bottom = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input height: ");
            int height = scanner.nextInt();
            scanner.nextLine();
            triangles.add(new Triangle(bottom, height));
          }
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Input...");
      }
    } while (true);
  }
}
