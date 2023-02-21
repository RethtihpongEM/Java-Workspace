import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class Student{
  private String firstName;
  private String lastName;
  private int age;
  private String major;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getMajor() {
    return major;
  }
}
public class Lab07_5_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    JFrame f = new JFrame("Student Management");

    JPanel TitlePanel = new JPanel();
    JLabel titleLabel = new JLabel("Student Information");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
    TitlePanel.add(titleLabel);

    DefaultTableModel header = new DefaultTableModel();

    JPanel middlePanel = new JPanel(new BorderLayout());

    header.addColumn("First Name");
    header.addColumn("Last Name");
    header.addColumn("Age");
    header.addColumn("Major");


    JTable table = new JTable(header);
    JScrollPane scrollPane = new JScrollPane(table);
    middlePanel.add(scrollPane, BorderLayout.CENTER);

    DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();

    JPanel DescriptionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JTextField firstNameField = new JTextField(10);
    JTextField lastNameField = new JTextField(10);
    JTextField ageField = new JTextField(4);
    JTextField majorField = new JTextField(15);
    DescriptionPanel.add(new JLabel("First Name: "));
    DescriptionPanel.add(firstNameField);
    DescriptionPanel.add(new JLabel("Last Name: "));
    DescriptionPanel.add(lastNameField);
    DescriptionPanel.add(new JLabel("Age: "));
    DescriptionPanel.add(ageField);
    DescriptionPanel.add(new JLabel("Major: "));
    DescriptionPanel.add(majorField);

    JButton b1 = new JButton("Add New");
    DescriptionPanel.add(b1);

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        Student student = new Student();

        student.setFirstName(firstNameField.getText());
        student.setLastName(lastNameField.getText());
        student.setAge(Integer.parseInt(ageField.getText()));
        student.setMajor(majorField.getText());
        Object[] row = {student.getFirstName(), student.getLastName(), student.getAge(), student.getMajor()};

        defaultTable.addRow(row);

        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        majorField.setText("");
      }
    });

    f.getContentPane().setLayout(new BorderLayout());
    f.getContentPane().add(TitlePanel, BorderLayout.NORTH);
    f.getContentPane().add(DescriptionPanel, BorderLayout.CENTER);
    f.getContentPane().add(middlePanel, BorderLayout.SOUTH);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setResizable(false);
    f.setVisible(true);
  }
}
