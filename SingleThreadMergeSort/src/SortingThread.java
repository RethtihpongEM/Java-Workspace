public class SortingThread {
  private int [] sortList;
  private int size;
  SortingThread(int size){
    this.size=size;
    sortList = new int[size];
  }


  public void sortAndMerge(int size1,int size2,int[]array1,int[]array2){
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
}
