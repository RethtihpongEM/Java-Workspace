import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

abstract class TextRandomizer{
  abstract char randomizeACharacter();
  abstract String randomizeAString(int length);
  abstract String[] randomizeStrings(int length, int amount);
}

class RandomText extends TextRandomizer{
  Random random = new Random();
  @Override
  char randomizeACharacter() {
    return (char) ('a' + random.nextInt(26));
  }

  @Override
  String randomizeAString(int length) {
    StringBuilder str = new StringBuilder();
    for(int i=0;i<length;i++){
      str.append(randomizeACharacter());
    }
    return str.toString();
  }

  @Override
  String[] randomizeStrings(int length, int amount) {
    String[] str = new String[amount];
    StringBuilder stringBuilder = new StringBuilder();
    for(int i=0;i<amount;i++){
      str[i] = randomizeAString(length);
    }
    for(int i=1;i<amount;i++){
      for(int j =0;j<amount;j++){
        if(str[i].equals(str[j])){
          str[i] = randomizeAString(length);
        }
      }
    }
    return str;
  }
}

public class Lab07_3_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("==== Text Randomizer ====");
    System.out.println("1. A Character");
    System.out.println("2. A String");
    System.out.println("3. Unique Strings");
    System.out.println("4. Quit");
    System.out.print("Choose an opt: ");
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput;
    do {
      RandomText randomText = new RandomText();
      menu();
      userInput = scanner.nextInt();
      switch (userInput){
        case 1:
          System.out.println("Random character: " + randomText.randomizeACharacter());
          break;
        case 2:
          System.out.print("Input length of a string: ");
          userInput = scanner.nextInt();
          System.out.println("Random a string: " + randomText.randomizeAString(userInput));
          break;
        case 3:
          int length;
          int amount;
          System.out.print("Input length of a string: ");
          length = scanner.nextInt();
          System.out.print("Input amount of string: ");
          amount =scanner.nextInt();
          System.out.println("Random a string: " + Arrays.toString(randomText.randomizeStrings(length, amount)));
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid input....");
          break;
      }
    }while (true);
  }
}
