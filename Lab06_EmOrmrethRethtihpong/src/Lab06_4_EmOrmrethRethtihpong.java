import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Lab06_4_EmOrmrethRethtihpong {
  public static String calculateQuadratic(float a, float b, float c){
    String result = "";
    double delta, sqrtDelta;
    double root1, root2;
    if (a == 0 && b == 0){
      System.exit(0);
    }else{
      delta = b*b - 4*a*c;
      if (delta>0){
        //Calculation the square root of delta and root
        sqrtDelta = Math.sqrt(delta);
        root1 = (-b + sqrtDelta)/(2*a);
        root2 = (-b - sqrtDelta)/(2*a);

        result = "x1 = " + root1+ ", x2 = "+root2;

      } else if (delta==0){
        //Calculating the root
        root1 = -b/2*a;

        result = "x1 = x2 = " +root1;
      }else{
        result = "Equation roots are complex!";
      }
    }
    return result;
  }
  public static void main(String[] args) {
    Font sanSerif = new Font(Font.SANS_SERIF,Font.ITALIC,15);
    Font sanSerifBold = new Font(Font.SANS_SERIF,Font.BOLD,15);

    JFrame frame = new JFrame("Exercise 4");

    JLabel title = new JLabel("Find roots of quadratic equation ax^2 + bx + c = 0");
    title.setBounds(15,0,350,50);
    title.setFont(sanSerifBold);

    JLabel a = new JLabel("a=");
    a.setBounds(15,25,25,50);
    a.setFont(sanSerif);

    JTextField t1 = new JTextField("");
    t1.setFont(sanSerifBold);
    t1.setBounds(15,65,300,25);

    JLabel b = new JLabel("b=");
    b.setBounds(15,75,25,50);
    b.setFont(sanSerif);

    JTextField t2 = new JTextField("");
    t2.setFont(sanSerifBold);
    t2.setBounds(15,115,300,25);

    JLabel c = new JLabel("c=");
    c.setBounds(15,125,25,50);
    c.setFont(sanSerif);

    JTextField t3 = new JTextField("");
    t3.setFont(sanSerifBold);
    t3.setBounds(15,165,300,25);

    JButton b1 = new JButton("Find");
    b1.setBounds(15,200,75,25);

    JLabel result = new JLabel();
    result.setBounds(15,225,300,25);
    result.setFont(sanSerifBold);

    b1.addActionListener(new ActionListener() { @Override
      public void actionPerformed(ActionEvent e) {
        result.setText(calculateQuadratic(Float.parseFloat(t1.getText()),Float.parseFloat(t2.getText()),Float.parseFloat(t3.getText())));
      }
    });

    frame.add(title);
    frame.add(a);
    frame.add(t1);
    frame.add(b);
    frame.add(t2);
    frame.add(c);
    frame.add(t3);
    frame.add(b1);
    frame.add(result);

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
