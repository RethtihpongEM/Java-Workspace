import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame{
  Frame(String title){
    this.setTitle(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,750);
    this.setLayout(null);
    this.setResizable(false);
    this.setVisible(true);
  }
}
class Panel extends JPanel{
  Panel(int row ,int column){
    GridLayout layout = new GridLayout(row,column);
    layout.setVgap(10);
    this.setBounds(95,50,300,500);
    this.setLayout(layout);

    this.setSize(300,500);
  }
}
class Button extends JButton{
  Button(String title){
    this.setHorizontalAlignment(SwingConstants.LEFT);
    this.setText(title);
    this.setBackground(Color.white);
  }
}

public class Lab07_4_EmOrmrethRethtihpong {
  static void aboutPage(JFrame f){
    JPanel generalAboutPanel = new JPanel(new GridLayout(4,2));

    JLabel l1 = new JLabel("Setting > General > About");
    l1.setFont(new Font("Arial", Font.BOLD, 24));
    l1.setBounds(10, 11, 300, 36);
    f.add(l1);

    JLabel l2, l3, l4, l5, l6, l7;

    JButton b4 = new JButton("Back");
    b4.setBackground(Color.white);
    b4.setHorizontalAlignment(SwingConstants.LEFT);
    b4.setBounds(50,250,300,50);

    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f.remove(l1);
        f.remove(generalAboutPanel);
        f.remove(b4);
        generalPage(f);
      }
    });

    l2 = new JLabel("Name");
    l3 = new JLabel("IPhone");
    l4 = new JLabel("Model");
    l5 = new JLabel("IXs");
    l6 = new JLabel("Version");
    l7 = new JLabel("18.5");


    generalAboutPanel.setBackground(null);
    generalAboutPanel.setBounds(50,70,480,229);

    generalAboutPanel.add(l2);
    generalAboutPanel.add(l3);
    generalAboutPanel.add(l4);
    generalAboutPanel.add(l5);
    generalAboutPanel.add(l6);
    generalAboutPanel.add(l7);
    f.add(b4);

    f.add(generalAboutPanel);

    f.revalidate();
    f.repaint();
  }
  static void generalPage(JFrame f){
    Panel generalPanel = new Panel(7,1);
    JLabel Label = new JLabel("Setting > General");
    Label.setFont(new Font("Arial",Font.BOLD,24));
    Label.setBounds(25,0,300,50);
    Button b1 = new Button("1. About");
    Button b2 = new Button("2. Software Update");
    Button b3 = new Button("3. Storage");
    Button b4 = new Button("Back");
    generalPanel.add(b1);
    generalPanel.add(b2);
    generalPanel.add(b3);
    generalPanel.add(b4);

    f.getContentPane().add(Label);
    f.getContentPane().add(generalPanel);

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f.remove(Label);
        f.getContentPane().remove(generalPanel);
        aboutPage(f);

      }
    });
    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        f.remove(Label);
        f.getContentPane().remove(generalPanel);
        mainPage(f);
        f.revalidate();
        f.repaint();
      }
    });

    f.revalidate();
    f.repaint();
  }

  static void mainPage(JFrame f){

    Panel mainPanel = new Panel(7,1);


    JLabel Label = new JLabel("Setting");
    Label.setFont(new Font("Arial",Font.BOLD,24));
    Label.setBounds(25,0,100,50);

    Button b1 = new Button("1. General");
    Button b2 = new Button("2. Wi-Fi");
    Button b3 = new Button("3. Bluetooth");
    Button b4 = new Button("4. Mobile Data");
    Button b5 = new Button("5. Hotspot");
    Button b6 = new Button("6. Notification");
    Button b7 = new Button("Quit");


    mainPanel.add(b1);
    mainPanel.add(b2);
    mainPanel.add(b3);
    mainPanel.add(b4);
    mainPanel.add(b5);
    mainPanel.add(b6);
    mainPanel.add(b7);


    b1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        f.remove(Label);
        f.getContentPane().remove(mainPanel);
        generalPage(f);
      }
    });
    b7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        f.dispose();
        System.exit(0);
      }
    });
    f.getContentPane().add(mainPanel);
    f.getContentPane().setLayout(null);
    f.getContentPane().add(Label);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500,750);
    f.setResizable(false);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    Frame f = new Frame("Exercise 5");
    mainPage(f);
  }
}
