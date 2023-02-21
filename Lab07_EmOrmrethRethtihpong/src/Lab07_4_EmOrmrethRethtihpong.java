import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame{
  Frame(String title){
    this.setTitle(title);
    this.setSize(500, 750);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setVisible(true);
  }
}
class Button extends JButton{
  Button (String text,int x,int y){
    this.setText(text);
    this.setBounds(x,y,300,50);
    this.setBackground(Color.white);
    this.setHorizontalAlignment(SwingConstants.LEFT);
  }
}
public class Lab07_4_EmOrmrethRethtihpong{
  public static void main(String[] args) {
    Frame mainFrame = new Frame("Exercise 4");

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(Color.white);
//    mainPanel.setBounds(0,0,500,750);

    JLabel settingLabel = new JLabel("Setting");
    settingLabel.setBounds(50, 0, 100, 50);
    settingLabel.setFont(new Font("Arial",Font.BOLD,22));

    Button generalB = new Button("1.General",0,0);
    Button wifiB = new Button("2. Wi-Fi",0,60);
    Button bluetoothB = new Button("3. Bluetooth",0,120);
    Button mobileDataB = new Button("4. Mobile Data",0,180);
    Button hotspotB = new Button("5. Hotspot",0,240);
    Button notificationB = new Button("6. Notification",0,300);
    Button quitB = new Button("Quit",0,360);

    mainPanel.add(generalB);
    mainPanel.add(wifiB);
    mainPanel.add(bluetoothB);
    mainPanel.add(mobileDataB);
    mainPanel.add(hotspotB);
    mainPanel.add(notificationB);
    mainPanel.add(quitB);

    mainFrame.add(mainPanel,BorderLayout.CENTER);

  }
}
