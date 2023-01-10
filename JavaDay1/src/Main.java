import java.util.Scanner;
import mypack.Arithmetic;
public class Main {
    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = input.nextInt();

        System.out.print("Enter b: ");
        b = input.nextInt();

        Arithmetic obj = new Arithmetic();

        System.out.println("Sum: "+obj.sum(a,b));
        System.out.println("Divide: "+obj.divide(a,b));
        System.out.println("Minus: "+obj.minus(a,b));
        System.out.println("Multiply: "+obj.multiply(a,b));
        System.out.println("Modulo: "+obj.modulo(a,b));
    }
}