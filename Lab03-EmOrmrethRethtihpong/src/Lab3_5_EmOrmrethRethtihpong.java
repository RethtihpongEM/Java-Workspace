class Math1{
  static int add(int a, int b){
    return a+b;
  }
  static int subtract (int a, int b){
    return a-b;
  }
  static int multiply(int a, int b){
    return a*b;
  }
  static float divide(int a ,int b){
    return (float)a/b;
  }
  static int min(int a, int b){
    if (a<b){
      return a;
    }else{
      return b;
    }
  }
  static int max(int a, int b){
    if (a>b){
      return a;
    }else{
      return b;
    }
  }

}
public class Lab3_5_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    System.out.println("Result of a + b: " + Math1.add(3,4));
    System.out.println("Result of a - b: " + Math1.subtract(4,3));
    System.out.println("Result of a * b: " + Math1.multiply(5,2));
    System.out.println("Result of a / b: " + Math1.divide(5,2));
    System.out.println("Min between a and b is: " + Math1.min(7,2));
    System.out.println("Max between a and b is: " + Math1.max(7,2));

  }
}
