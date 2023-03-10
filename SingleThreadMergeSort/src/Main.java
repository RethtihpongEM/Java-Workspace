import java.util.Arrays;
import java.util.Scanner;

public class Main {
//  static int[] firstHalf(int size1,int[]originalArray){
//    OriginalList array1 = new OriginalList(size1);
//    for(int i=0;i<size1;i++){
//      array1.setElement(i,originalArray[i]);
//    }
//    return array1.getList();
//  }
//  static int[]secondHalf(int size2, int[]originalArray){
//    OriginalList array2 = new OriginalList(size2);
//    for(int i=0;i<size2;i++){
//      array2.setElement(i,originalArray[(size2-1)+i]);
//    }
//    return array2.getList();
//  }
//  static int[] sortArray(int size,int[]array){
//    int temp;
//    for (int i=0;i<size;i++){
//      for (int j=i+1;j<size;j++){
//        if(array[i]>array[j]){
//          temp = array[i];
//          array[i] = array[j];
//          array[j] = temp;
//        }
//      }
//    }
//    return array;
//  }
//  static void sortArray(int size1,int size2,int []array1,int []array2){
//
//  }
//  static void divideArrayInto2(int size, int[]originalArray){
//    int size1,size2;
//    if(size<0){
//      return;
//    }else if(size%2 == 0){
//      size2 =size1 = size/2;
//    }else{
//      size1 = size/2;
//      size2 = size1 + 1;
//    }
//    OriginalList array2 = new OriginalList(size2,secondHalf(size2,originalArray));
//    OriginalList array1 = new OriginalList(size1,firstHalf(size1,originalArray));
////    array1.displayList(size1);
////    array2.displayList(size2);
//    OriginalList sortArray1 = new OriginalList(size1,sortArray(size1,array1.getList()));
//    OriginalList sortArray2 = new OriginalList(size2,sortArray(size2,array2.getList()));
////    sortArray(size2,array2.getList());
////    sortArray1.displayList(size1);
////    array2.displayList(size2);
//  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter size of the list: ");
//    int input = scanner.nextInt();
    int input = 100000000;
    int size = input;
    OriginalList originalList = new OriginalList(size);
    originalList.autoGenerateList(size);
//    originalList.displayList(size);
    long startTime = System.currentTimeMillis();
//    divideArrayInto2(size,originalList.getList());
//    originalList.displayList(size);
    //Seperate list
    int size1;
    int size2;
    if(size<0){
      return;
    }else if(size%2 == 0){
      size2 =size1 = size/2;
    }else{
      size1 = size/2;
      size2 = size1 + 1;
    }

    OriginalList array1 = new OriginalList(size1);
    OriginalList array2 = new OriginalList(size2);
    for(int i = 0;i<size1;i++){
      array1.setElement(i,originalList.getElement(i));
    }
    for(int i=0;i<size2;i++){
      array2.setElement(i,originalList.getElement((size2-1)+i));
    }


    int leftOf1,rightOf1;
    if(size1<0){
      return;
    }else if(size1%2 == 0){
      leftOf1 = rightOf1 = size1/2;
    }else{
      leftOf1 = size1/2;
      rightOf1 = leftOf1 + 1;
    }
    OriginalList leftOf1Array = new OriginalList(leftOf1);
    OriginalList rightOf1Array = new OriginalList(rightOf1);
    for(int i = 0;i<leftOf1;i++){
      leftOf1Array.setElement(i,array1.getElement(i));
    }
    for(int i=0;i<rightOf1;i++){
      rightOf1Array.setElement(i,array1.getElement((rightOf1-1)+i));
    }
    int[]sortedLeftArray = new int[size1];
    int i=0,j=0,k=0;
    while (i< leftOf1 && j<rightOf1){
      if(leftOf1Array.getElement(i) < rightOf1Array.getElement(j)){
        sortedLeftArray[k] = leftOf1Array.getElement(i);
        k++;
        i++;
      }else{
        sortedLeftArray[k] = rightOf1Array.getElement(j);
        k++;
        j++;
      }
    }
    for (;i<leftOf1;i++){
      sortedLeftArray[k] = leftOf1Array.getElement(i);
      k++;
    }
    for(;j<rightOf1;j++){
      sortedLeftArray[k] = rightOf1Array.getElement(j);
      k++;
    }

    int leftOf2,rightOf2;
    if(size2<0){
      return;
    }else if(size2%2 == 0){
      leftOf2 = rightOf2 = size2/2;
    }else{
      leftOf2 = size2/2;
      rightOf2 = leftOf2 + 1;
    }
    OriginalList leftOf2Array = new OriginalList(leftOf2);
    OriginalList rightOf2Array = new OriginalList(rightOf2);
    for(i = 0;i<leftOf2;i++){
      leftOf2Array.setElement(i,array2.getElement(i));
    }
    for(i=0;i<rightOf2;i++){
      rightOf2Array.setElement(i,array2.getElement((rightOf2-1)+i));
    }
    int[]sortedRightArray = new int[size2];
    i=0;
    j=0;
    k=0;
    while (i< leftOf2 && j<rightOf2){
      if(leftOf2Array.getElement(i) < rightOf2Array.getElement(j)){
        sortedRightArray[k] = leftOf2Array.getElement(i);
        k++;
        i++;
      }else{
        sortedRightArray[k] = rightOf2Array.getElement(j);
        k++;
        j++;
      }
    }
    for (;i<leftOf2;i++){
      sortedRightArray[k] = leftOf2Array.getElement(i);
      k++;
    }
    for(;j<rightOf2;j++){
      sortedRightArray[k] = rightOf2Array.getElement(j);
      k++;
    }

//    array1.displayList(size1);
//    array2.displayList(size2);
//    int temp;

//    for (int i=0;i<size1;i++){
//      for (int j=i+1;j<size1;j++){
//        if(array1.getElement(i)>array1.getElement(j)){
//          temp = array1.getElement(i);
//          array1.setElement(i,array1.getElement(j));
//          array1.setElement(j,temp);
//        }
//      }
//    }
//    for (int i=0;i<size2;i++){
//      for (int j=i+1;j<size2;j++){
//        if(array2.getElement(i)>array2.getElement(j)){
//          temp = array2.getElement(i);
//          array2.setElement(i,array2.getElement(j));
//          array2.setElement(j,temp);
//        }
//      }
//    }
//    array1.displayList(size1);
//    array2.displayList(size2);
    int [] sortedList = new int[size];
//    for(i=0;i<size1;i++){
//      k=0;
//      for(j=0;j<size2;j++){
//        if (sortedLeftArray[i]<sortedRightArray[j]){
//          sortedList[k] = sortedLeftArray[i];
//          k++;
////          i++;
//        }else{
//          sortedList[k] = sortedRightArray[j];
//          k++;
////          j++;
//        }
//      }
//    }
    i=0;
    j=0;
    k=0;
    while (i< size1 && j<size2){
      if(sortedLeftArray[i] < sortedRightArray[j]){
        sortedList[k] = sortedLeftArray[i];
        k++;
        i++;
      }else{
        sortedList[k] =sortedRightArray[j];
        k++;
        j++;
      }
    }
    for (;i<size1;i++){
      sortedList[k] = sortedLeftArray[i];
      k++;
    }
    for(;j<size2;j++){
      sortedList[k] = sortedRightArray[j];
      k++;
    }
    long endTime = System.currentTimeMillis();
    System.out.println(endTime-startTime + " = Millesecons");
//    for(i=0;i<sortedList.length;i++){
//      System.out.print(sortedList[i] + " ");
//    }
  }
}