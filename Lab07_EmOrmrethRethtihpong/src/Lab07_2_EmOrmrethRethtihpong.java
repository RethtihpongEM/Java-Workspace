import java.util.*;

abstract class NumberRandomizer{
  abstract int randomizeInBetween(int min,int max);
  abstract int[] randomizeUniqueInBetween(int min,int max,int amount);
}
class RandomNumber extends NumberRandomizer{

  @Override
  int randomizeInBetween(int min, int max) {
    Random rand = new Random();
    return rand.nextInt(max-min) + min;
  }

  @Override
  int[] randomizeUniqueInBetween(int min, int max, int amount) {
    int [] result = new int[amount];
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=min;i<=max;i++){
      list.add(i);
    }
    Collections.shuffle(list);
    for(int i=0;i<amount;i++){
      result[i] = list.get(i);
    }
    return result;
  }
}
public class Lab07_2_EmOrmrethRethtihpong {
  static boolean askIfContinue(){
    System.out.print("Do you want to continue(y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }
  static void menu(){
    System.out.println("==== Number Randomizer ====");
    System.out.println("1. In between");
    System.out.println("2. Unique in between");
    System.out.println("3. Quit");
    System.out.print("Choose an opt: ");
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    RandomNumber randomNumber = new RandomNumber();
    int input;
    int min,max;
    do {
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          do {
            System.out.println(":::Random in between:::");
            System.out.print("Minimum: ");
            min = scanner.nextInt();
            System.out.print("Maximum: ");
            max = scanner.nextInt();
            System.out.println("Result: " + randomNumber.randomizeInBetween(min,max));
          }while (askIfContinue());
          break;
        case 2:
          do {
            System.out.println(":::Unique in between:::");
            System.out.print("Minimum: ");
            min = scanner.nextInt();
            System.out.print("Maximum: ");
            max = scanner.nextInt();
            System.out.print("Amount: ");
            input = scanner.nextInt();
            int []result = randomNumber.randomizeUniqueInBetween(min,max,input);
            System.out.println("Result: " + Arrays.toString(result));
          }while (askIfContinue());
          break;
      }
    }while (true);
  }
}
