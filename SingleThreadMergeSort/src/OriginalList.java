import java.util.Random;

public class OriginalList {
  private final int size;
  private final int [] list;
  OriginalList(int size){
    this.size = size;
    list = new int[size];
  }

  public void displayList(int size){
    System.out.print("List = ");
    for (int i = 0;i<size;i++){
      System.out.print(list[i] + " ");
    }
    System.out.println();
  }

  public int getSize() {
    return size;
  }

  public int[] getList() {
    return list;
  }
  public int getElement(int i){
    return list[i];
  }
  public void setElement(int i,int value){
    list[i] = value;
  }

  void autoGenerateList(int size){
    Random random = new Random();
    for(int i=0;i<size;i++){
      list[i] = random.nextInt(100);
    }
  }
}
