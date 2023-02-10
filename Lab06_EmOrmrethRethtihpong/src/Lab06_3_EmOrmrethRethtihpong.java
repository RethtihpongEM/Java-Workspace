
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

public class Lab06_3_EmOrmrethRethtihpong{
  public static void main(String[] args) throws IOException {

    JFrame f = new JFrame("First GUI");


    JLabel l1,l2,l3,l4,l5;
    l3 = new JLabel();
    l4 = new JLabel();
    l5 = new JLabel();

    l1= new JLabel("Count number of Vowel, Consonant and Space");
    l1.setBounds(15,0,275,50);

    l2 = new JLabel("Text: ");
    l2.setBounds(15,25,100,50);


    l3.setBounds(15,130,150,25);


    l4.setBounds(15,150,150,25);


    l5.setBounds(15,170,150,25);

    JTextField t1 = new JTextField("");
    t1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,14));
    t1.setBounds(15,75,300,25);

    JButton b1 = new JButton("Find");
    b1.setBounds(15,105,75,25);

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String str = t1.getText();
        int i=0;
        int vowel =0;
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
        l3.setText("Count of vowel is: " + vowel);
        l4.setText("Count of consonant is: " + consonant);
        l5.setText("Count of space is: " + space);
      }
    });

    f.add(l1);
    f.add(l2);
    f.add(t1);
    f.add(b1);
    f.add(l3);
    f.add(l4);
    f.add(l5);

    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
  }
}
