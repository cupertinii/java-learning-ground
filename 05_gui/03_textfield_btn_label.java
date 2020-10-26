import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(1280,800);
    frame.setLayout(null);

    JLabel label = new JLabel();
    label.setBounds(200, 200, 200, 50);

    JTextField txt = new JTextField("Input a number");
    txt.setBounds(200, 100, 200, 50);

    JButton btn = new JButton("Calculate");
    btn.setBounds(200, 150, 200, 50);

    // This function will handle action like pressing enter in text field.
    txt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calculate(txt, label);
      }
    });

    // Btn click
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calculate(txt, label);
      }
    });

    // add label and txt field to app frame.
    frame.add(label);
    frame.add(txt);
    frame.add(btn);

    frame.setVisible(true);
  }

  public static void calculate(JTextField txt, JLabel label) {
    String textFieldData = txt.getText();
    int input = Integer.parseInt(textFieldData);
    int ouput = input * input;

    label.setText("Square of " + input + " is " + ouput);
    return;
  }
}
