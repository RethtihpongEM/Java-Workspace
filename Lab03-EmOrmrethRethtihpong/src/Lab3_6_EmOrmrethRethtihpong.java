class MathII{
  static double pi = 3.14159265359;
  static int factorial(int a){
    if (a == 0){
      return 1;
    }
    for (int i=a-1;i>0;i--){
      a = a*i;
    }
    return a;
  }
  static float rectangleSurface(double width, double height){
    return (float)(width*height);
  }
  static float circleSurface(double radius){
    return (float) (pi*(radius*radius));
  }
  static int max(int a,int b,int c,int d,int e){
    int max = a;
    if(b>max){
      max = b;
    }
    if (c > max){
      max = c;
    }
    if (d > max){
      max = d;
    }
    if (e > max){
      max = e;
    }
    return max;
  }
  static int min(int a,int b,int c,int d,int e){
    int min = a;
    if(b<min){
      min = b;
    }
    if (c < min){
      min = c;
    }
    if (d < min){
      min = d;
    }
    if (e < min){
      min = e;
    }
    return min;
  }
}
public class Lab3_6_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    System.out.println("Result of 5 factorial: " + MathII.factorial(5));
    System.out.println("Result of 5m by 3.5m: " + MathII.rectangleSurface(5,3.5) + "square meter");
    System.out.println("Result of circle surface: " + MathII.circleSurface(5));
    System.out.println("Max of 5,2,1,6,7: "+ MathII.max(5,2,1,6,7));
    System.out.println("Min of 5,2,1,6,7: "+ MathII.min(5,2,1,6,7));
  }
}
