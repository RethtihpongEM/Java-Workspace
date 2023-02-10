class AbstractMath{
  int reverseNumber(int number){
    return 0;
  }
  int roundedNumber(double num){
    return 0;
  }
  int countDistinct(int [] values){
    return 0;
  }
  int decimalToBinary(int decimal){
    return 0;
  }
}
class MATH extends AbstractMath{
  int reverseNumber(int number){
    int reverse = 0;
    while(number!= 0){
      reverse = (reverse*10) + (number%10);
      number = number/10;
    }
    return reverse;
  }
  int roundedNumber(double num){
    
    return (int)(Math.round(num));
  }
}
public class Lab06_1_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    MATH math = new MATH();
    System.out.println(math.roundedNumber(3.7));

  }
}
