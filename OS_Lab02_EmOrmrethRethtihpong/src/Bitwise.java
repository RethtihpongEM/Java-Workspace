public class Bitwise {
  void logicalAND(int a, int b){
    System.out.printf("Logical AND between %d and %d = %d",a,b,a&b);
    /**
     * convert a and b into binary
     * then check a and b using AND operator
     * get result then convert back to decimal
     */
  }
  void logicalOR(int a, int b){
    System.out.printf("Logical AND between %d and %d = %d",a,b,a|b);
    /**
     * convert a and b into binary
     * then check a and b using OR operator
     * get result then convert back to decimal
     */
  }
  void XOR(int a, int b){
    System.out.printf("Logical AND between %d and %d = %d",a,b,a^b);
    /**
     * convert a and b into binary
     * then check a and b using XOR operator
     * get result then convert back to decimal
     */
  }
  void bitwiseInversion(int a){
    System.out.printf("Inversion of %d = %d",a,~a);
    /**
     * convert a into binary
     * inverse a
     * get result then convert back to decimal
     */
  }
  void leftShift(int a){
    System.out.printf("Left Shift of %d = %d",a,a<<2);
    /**
     * Perform leftShift operator
     */
  }
  void rightShift(int a){
    System.out.printf("Right Shift of %d = %d",a,a>>2);
    /**
     * Perform rightShift operator
     */
  }
}
