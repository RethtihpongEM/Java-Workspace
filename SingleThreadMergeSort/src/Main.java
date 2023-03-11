import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static int size1;
  static int size2;
  static int size;
  static void divideArrayInto(){
    if(size<0){
      return;
    }else if(size%2 == 0){
      size2 =size1 = size/2;
    }else{
      size1 = size/2;
      size2 = size1 + 1;
    }
  }
  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter size of the list: ");
//    int input = scanner.nextInt();
    int input = 10;
    size = input;
    OriginalList originalList = new OriginalList(size);
    originalList.autoGenerateList(size);
    originalList.displayList(size);
    long startTime = System.currentTimeMillis();

    //Seperate list
    divideArrayInto();
    Sublist firstSublist = new Sublist(size1);
    Sublist secondSublist = new Sublist(size2);

    for(int i = 0;i<size1;i++){
      firstSublist.setElement(i,originalList.getElement(i));
    }
    for(int i = 0;i<size2;i++){
      secondSublist.setElement(i,originalList.getElement((size2-1)+i));
    }

    System.out.print("List 1: ");
    firstSublist.displayList();
    System.out.println();
    System.out.print("List 2: ");
    secondSublist.displayList();
    System.out.println();

    firstSublist.sort();
    secondSublist.sort();

    System.out.print("Sorted List 1: ");
    firstSublist.displayList();
    System.out.println();
    System.out.print("Sorted List 2: ");
    secondSublist.displayList();
    System.out.println();

    SortingThread sortingThread = new SortingThread(size);
    sortingThread.sortAndMerge(size1,size2,firstSublist.getSubList(),secondSublist.getSubList());

    System.out.print("Sorted: ");
    sortingThread.displayList();
    System.out.println();

    long endTime = System.currentTimeMillis();
    System.out.println(endTime-startTime + " = Milleseconds");

  }
}