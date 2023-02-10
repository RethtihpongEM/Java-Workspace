import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BasicMath{
  float addition(float x,float y){
    return x+y;
  }
  float subtraction(float x,float y){
    return x-y;
  }
  float multiplication(float x,float y){
    return x*y;
  }
  float division(float x,float y){
    return x/y;
  }
}
public class Lab06_5_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    Font sanSerif = new Font(Font.SANS_SERIF,Font.ITALIC,15);
    Font sanSerifBold = new Font(Font.SANS_SERIF,Font.BOLD,15);
    JFrame frame = new JFrame("Exercise 5");

    JLabel title = new JLabel("Calculator");
    title.setFont(sanSerifBold);
    title.setBounds(15,0,100,50);
    frame.add(title);

    JLabel a = new JLabel("A= ");
    a.setFont(sanSerif);
    a.setBounds(15,50,100,50);
    frame.add(a);

    JTextField t1 = new JTextField("");
    t1.setFont(sanSerifBold);
    t1.setBounds(15, 100,300,25);
    frame.add(t1);

    JLabel b = new JLabel("B= ");
    b.setFont(sanSerif);
    b.setBounds(15,125,100,50);
    frame.add(b);

    JTextField t2 = new JTextField("");
    t2.setFont(sanSerifBold);
    t2.setBounds(15, 175,300,25);
    frame.add(t2);

    JButton b1 = new JButton("A+B");
    b1.setBounds(15,215,75,25);
    frame.add(b1);

    JLabel result1 = new JLabel("=");
    result1.setBounds(15,235,100,50);
    result1.setFont(sanSerif);
    frame.add(result1);
    b1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BasicMath math = new BasicMath();
        result1.setText("= " + math.addition(Float.parseFloat(t1.getText()),Float.parseFloat(t2.getText())));
      }
    });

    JButton b2 = new JButton("A-B");
    b2.setBounds(15,275,75,25);
    frame.add(b2);

    JLabel result2 = new JLabel("=");
    result2.setBounds(15,300,100,50);
    result2.setFont(sanSerif);
    frame.add(result2);
    b2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BasicMath math = new BasicMath();
        result2.setText("= " + math.subtraction(Float.parseFloat(t1.getText()),Float.parseFloat(t2.getText())));
      }
    });

    JButton b3 = new JButton("A*B");
    b3.setBounds(15,340,75,25);
    frame.add(b3);

    JLabel result3 = new JLabel("=");
    result3.setBounds(15,365,100,50);
    result3.setFont(sanSerif);
    frame.add(result3);
    b3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BasicMath math = new BasicMath();
        result3.setText("= " + math.multiplication(Float.parseFloat(t1.getText()),Float.parseFloat(t2.getText())));
      }
    });

    JButton b4 = new JButton("A/B");
    b4.setBounds(15,405,75,25);
    frame.add(b4);

    JLabel result4 = new JLabel("=");
    result4.setBounds(15,430,100,50);
    result4.setFont(sanSerif);
    frame.add(result4);
    b4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BasicMath math = new BasicMath();
        result4.setText("= " + math.division(Float.parseFloat(t1.getText()),Float.parseFloat(t2.getText())));
      }
    });

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(500,550);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
