public class Sublist extends Thread{
  private int [] subList;
  private int size;
  Sublist(int size){
    this.size = size;
    this.subList = new int[size];
  }
  public void setElement(int index,int value){
    subList[index] = value;
  }
  public void displayList(){
    for(int i=0;i<this.size;i++){
      System.out.print(subList[i] + " ");
    }
  }

  public int[] getSubList() {
    return subList;
  }

  public void sort(){
    int temp;
    for (int i=0;i<this.size;i++){
      for (int j=i+1;j<this.size;j++){
        if(subList[i]>subList[j]){
          temp = subList[i];
          subList[i] = subList[j];
          subList[j] = temp;
        }
      }
    }
  }

  @Override
  public void run() {
    sort();
  }
}
