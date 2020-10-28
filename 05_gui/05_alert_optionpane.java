import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);

    JButton btn = new JButton("Button - Simple Message");
    btn.setBounds(10, 50, 180, 50);

    // Show Message Dialog
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

        // This will create a alert dialog box
        JOptionPane.showMessageDialog(
          frame,                                    // Parent
          "Button Clicked!",                        // Message String
          "Title of this dialog",                   // Dialog Title (Optional)
          JOptionPane.WARNING_MESSAGE);             // Message Type (Optional)
      }
    });

    frame.add(btn);

    frame.setVisible(true);
  }
}
