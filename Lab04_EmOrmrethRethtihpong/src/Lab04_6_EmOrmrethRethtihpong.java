class Students {
  int ID;

  String name;
  String gender;
  int age;
  String email;
  Students next;
  Students(int ID, String name, int age, String email){
    this.ID = ID;
    this.name = name;
    this.age = age;
    this.email = email;
  }
  void setNext(Students next){
    this.next = next;
  }
}

class StudentList{
  Students head;
  int size;

 void add(Students student) {
  if (head == null) {
    head = student;
  } else {
    Students current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.setNext(student);
  }
  size++;
}
void remove(int index){
  if (size == 0){
    System.out.println("List is empty");
  }else{
    if (index >= size || index <0){
      System.out.println("Cannot delete");
    }else{
      Students current = head;
      if(index == 0){
        head = head.next;
      }else{
        for(int i=0;i<index-1;i++){
          current = current.next;
        }
        current.setNext(current.next.next);
      }

      size--;
    }
  }
}
  void removeLast(){
     remove(size-1);
  }

  void display(){
   if(size==0){
     System.out.println("Array is empty");
   }
    Students current = head;
    for(int i=0;i<size;i++){
      System.out.print(current.name + " ");
      current = current.next;
    }
    System.out.println();
  }
  void clear(){
   head = null;
   size = 0;
  }
}
public class Lab04_6_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    StudentList myArr = new StudentList();
    System.out.println("==> Add");
    myArr.add(new Students(1001, "Pong", 20,"ormrethrethtihpong.em@cadt.student.edu.kh"));
    myArr.add(new Students(1002, "Chhay", 19,"chhay@cadt.student.edu.kh"));
    myArr.add(new Students(1003, "Panha", 21,"panha@cadt.student.edu.kh"));
    myArr.add(new Students(1004, "Liza", 17,"liza@cadt.student.edu.kh"));
    myArr.add(new Students(1005, "Kakada", 19,"kakada@cadt.student.edu.kh"));
    myArr.display();
    System.out.println("==> Remove at index 0");
    myArr.remove(0);
    myArr.display();
    System.out.println("==> Remove at last");
    myArr.removeLast();
    myArr.display();
    System.out.println("==> Clear");
    myArr.clear();
    myArr.display();
  }
}
