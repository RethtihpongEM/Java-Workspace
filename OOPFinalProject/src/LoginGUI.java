import com.mysql.jdbc.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JDialog{
  private JTextField tfemail;
  private JPasswordField passwordField1;
  private JLabel password;
  private JButton loginButton;
  private JPanel loginPanel;



  public LoginGUI(JFrame parent){
    super(parent);
    setTitle("Welcome To POS System");
    setContentPane(loginPanel);
    setResizable(false);
    setModal(true);
    setMinimumSize(new Dimension(600,300));
    setLocationRelativeTo(parent);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
    loginButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String email = tfemail.getText();
        String password = String.valueOf(passwordField1.getPassword());
        Login login = new Login();
        try {
          Database database = new Database("possystem","root","",3306);
          if(login.authentication(database,email,password)){
            dispose();
          }else{
            JOptionPane.showMessageDialog(
                    LoginGUI.this,
                    "Email or Password Invalid",
                            "Try again",
                    JOptionPane.ERROR_MESSAGE
            );
          }
        } catch (Exception ex) {
          throw new RuntimeException(ex);
        }
      }
    });
  }
}
