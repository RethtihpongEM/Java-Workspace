public class Sublist1 extends Thread{
  private int [] subList1;
  private int size1;
  Sublist1(int size){
    this.size1 = size;
    this.subList1 = new int[size];
  }
  public void setElement(int index,int value){
    subList1[index] = value;
  }
  public void displayList(){
    for(int i=0;i<this.size1;i++){
      System.out.print(subList1[i] + " ");
    }
  }

  public int[] getSubList() {
    return subList1;
  }

  public void sort(){
    int temp1;
    for (int i=0;i<this.size1;i++){
      for (int j=i+1;j<this.size1;j++){
        if(subList1[i]>subList1[j]){
          temp1 = subList1[i];
          subList1[i] = subList1[j];
          subList1[j] = temp1;
        }
      }
    }
  }

  @Override
  public void run() {
    sort();
  }
}
