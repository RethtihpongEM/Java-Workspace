import java.io.*;
import java.util.*;
public class writeToFile {
  public static void main(String[] args) throws Exception {
    FileWriter filewriter = new FileWriter("teacher.txt", true);
    PrintWriter printWriter = new PrintWriter(filewriter);
    printWriter.println("b");
    printWriter.close();
  }
}
