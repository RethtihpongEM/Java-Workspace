class Point{
  int a;
  void createPoint(int a){
    this.a = a;
  }
}

class Line extends Point {
  Point start = new Point();
  Point end = new Point();
  void createLine(int a, int b){
     start.createPoint(a);
     end.createPoint(b);
  }
}

class Triangle extends Line {
  Line line1 = new Line();
  Line line2 = new Line();
  Line line3 = new Line();

  void createTriangle(int a, int b ,int c) {
    line1.createLine(a,b);
    line2.createLine(b,c);
    line3.createLine(c,a);
  }
}

class Rectangle extends Triangle {
  Line line4 = new Line();

  void createRectangle(int a, int b ,int c, int d) {
    line1.createLine(a,b);
    line2.createLine(b,c);
    line3.createLine(c,d);
    line4.createLine(d,a);
  }
}

class ITStudent{
  String name;
  int age;
  String email;
  String correctAns;
  int score = 0;
  void createEmail(String name){
    this.email = name+"@student.cadt.edu.kh";
  }
}

class ProgrammingStudent extends ITStudent{

  ITStudent student = new ITStudent();
  String programmingQuiz;

  void checkAnswer(String value,String correctAnswer){
    if (value.equals(correctAnswer)){
      student.score+=3;
    }else{
      student.score--;
    }
  }
}

class TelecomStudent extends ITStudent{
  ITStudent student = new ITStudent();
  String telecomQuiz;
  void checkAnswer(String value,String correctAnswer){
    if (value.equals(correctAnswer)){
      student.score+=1;
    }
  }

}
public class Lab04_7_EmOrmrethRethtihpong {
  public static void main(String[] args) {
  }
}
