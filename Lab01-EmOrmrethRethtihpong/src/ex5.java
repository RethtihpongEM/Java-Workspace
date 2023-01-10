public class ex5 {
    public static void main(String [] args){
        String text = "I love My Hometown";
        System.out.println("Text length is: " + text.length());

        String text2 = "I love my little country";
        System.out.println("Result: " + text2.substring(7,24));

        String text3 = "Hi Students!";
        System.out.println("\"i\" is at index: "+ text3.indexOf("i"));
        System.out.println("\"u\" is at index: "+ text3.indexOf("u"));
        System.out.println("\"e\" is at index: "+ text3.indexOf("e"));

        String text4 = "Hi Students!";
        String text5 = "Students!";
        String text6 = "Hi Students!";
        System.out.println("Text4 is equal to Text5: "+ text4.equals(text5));
        System.out.println("Text4 is equal to Text6: "+ text4.equals(text6));

        String text7 = "Hi Students!";
        String text8 = "Students";
        String text9 = "Teacher";
        System.out.println("Text7 contains Text8: "+ text7.contains(text8));
        System.out.println("Text7 contains Text9: "+ text7.contains(text9));
    }
}
