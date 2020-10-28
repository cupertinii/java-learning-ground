import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(400,500);
    frame.setLayout(null);

    JButton btn_1 = new JButton("Button - Simple Message");
    btn_1.setBounds(10, 50, 380, 50);

    // Show Message Dialog
    btn_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        // This will create a alert dialog box
        JOptionPane.showMessageDialog(
          frame,                                    // Parent
          "Button Clicked!",                        // Message String
          "Title of this dialog",                   // Dialog Title (Optional)
          JOptionPane.WARNING_MESSAGE);             // Message Type (Optional)
      }
    });

    JButton btn_2 = new JButton("Button - Show Confirmation with Yes/No");
    btn_2.setBounds(10, 100, 380, 50);

    // Show Yes/No Message Box
    btn_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        // This will create a alert dialog box with Yes/No buttons
        int response = JOptionPane.showConfirmDialog(
          frame,                                    // Parent
          "Button Clicked!",                        // Message String
          "Do you agree?",                          // Dialog Title (Optional)
          JOptionPane.YES_NO_OPTION);               // Message Type (Optional)

        if(response == JOptionPane.NO_OPTION) {
          System.out.println("Clicked => No");
        }
        else if(response == JOptionPane.YES_OPTION) {
          System.out.println("Clicked => Yes");
        }
      }
    });

    JButton btn_3 = new JButton("Button - Show Input Box");
    btn_3.setBounds(10, 150, 380, 50);

    // Show Input dialog box
    btn_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        // This will create a Input dialog box
        String input = JOptionPane.showInputDialog(
          frame,                                    // Parent
          "Enter your age.");                       // Message String

        System.out.println("Age = " + input);
      }
    });

    frame.add(btn_1);
    frame.add(btn_2);
    frame.add(btn_3);

    frame.setVisible(true);
  }
}
