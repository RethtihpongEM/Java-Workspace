public class SortingThread extends Thread{
  private int [] sortList;
  private int [] array1;
  private int [] array2;
  private int size;
  private int size1;
  private int size2;

  SortingThread(int size,int size1,int size2,int[]firstArray,int[]secondArray){
    this.size=size;
    sortList = new int[size];
    this.size1= size1;
    this.size2= size2;
    this.array1 = firstArray;
    this.array2 = secondArray;
  }
  public void sortAndMerge(){
    int i=0,j=0,k=0;
    while (i< size1 && j<size2){
      if(array1[i] < array2[j]){
        sortList[k] = array1[i];
        k++;
        i++;
      }else{
        sortList[k] =array2[j];
        k++;
        j++;
      }
    }
    while(i<size1){
      sortList[k] = array1[i];
      k++;
      i++;
    }
    while (j<size2){
      sortList[k] = array2[j];
      k++;
      j++;
    }
  }
  public void displayList(){
    for(int i=0;i<this.size;i++){
      System.out.print(sortList[i] + " ");
    }
  }

  @Override
  public void run() {
    sortAndMerge();
  }
}
