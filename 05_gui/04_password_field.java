import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(1280,800);
    frame.setLayout(null);

    JLabel label = new JLabel();
    label.setBounds(200, 200, 200, 50);

    JPasswordField pwd = new JPasswordField("Input your password");
    pwd.setBounds(200, 100, 200, 50);

    JButton btn = new JButton("Login");
    btn.setBounds(200, 150, 200, 150);

    // This function will handle action like pressing enter in text field.
    pwd.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        loginFunction(pwd, label, frame);
      }
    });

    // Btn click
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        loginFunction(pwd, label, frame);
      }
    });

    // add label and txt field to app frame.
    frame.add(pwd);
    frame.add(btn);
    frame.add(label);

    frame.setVisible(true);
  }

  public static void loginFunction(JTextField txt, JLabel label, JFrame frame) {
    String textFieldData = txt.getText();
    System.out.println(textFieldData);
    String stored_password = "123456";
    if( textFieldData.equals(stored_password) ) {
      label.setText("Login successful");
    }
    else {
      label.setText("Login unsuccessful");
    }
    return;
  }
}
