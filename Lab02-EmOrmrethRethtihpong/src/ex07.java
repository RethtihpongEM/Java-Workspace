//Exercise 7
import java.util.Locale;
import java.util.Scanner;
public class ex07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a sentence: ");
    String str = input.nextLine();
    str = str.toLowerCase();
    int i=0;
    int vowel=0;
    int space=0;
    int consonant=0;
    while(i<str.length()){
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        vowel++;
      }else if (str.charAt(i) == ' '){
        space++;
      }else{
        consonant++;
      }
      i++;
    }
    System.out.println("Count of vowel is: " + vowel);
    System.out.println("Count of consonant is: " + consonant);
    System.out.println("Count of space is: " + space);
  }
}
