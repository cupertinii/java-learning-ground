import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(1280,800);
    frame.setLayout(null);

    JLabel label = new JLabel();
    label.setBounds(200, 200, 100, 50);

    JTextField txt = new JTextField("Your Name");
    txt.setBounds(200, 100, 100, 50);

    // This function will handle action like pressing enter in text field.
    txt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String textFieldData = txt.getText();

        label.setText("Hi " + textFieldData + " !");
      }
    });

    // add label and txt field to app frame.
    frame.add(label);
    frame.add(txt);

    frame.setVisible(true);
  }
}
