import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(400, 500);
    frame.setLayout(null);

    JLabel label = new JLabel("Select a direction below");
    label.setBounds(100, 20, 200, 20);

    JLabel label_2 = new JLabel("");
    label_2.setBounds(100, 180, 200, 20);

    // 4 radio button options
    JRadioButton option_1, option_2, option_3, option_4;
    option_1 = new JRadioButton("North");
    option_1.setBounds(100, 50, 200, 30);
    option_2 = new JRadioButton("South");
    option_2.setBounds(100, 80, 200, 30);
    option_3 = new JRadioButton("East");
    option_3.setBounds(100, 110, 200, 30);
    option_4 = new JRadioButton("West");
    option_4.setBounds(100, 140, 200, 30);

    // Event handlers
    option_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_2.setText("North selected");
      }
    });
    option_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_2.setText("South selected");
      }
    });
    option_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_2.setText("East selected");
      }
    });
    option_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_2.setText("West selected");
      }
    });

    // Now create Button Group and add all these options to it
    ButtonGroup option_group = new ButtonGroup();
      option_group.add(option_1);
      option_group.add(option_2);
      option_group.add(option_3);
      option_group.add(option_4);

    // Add all the components to application frame
    frame.add(label);
    frame.add(option_1);
    frame.add(option_2);
    frame.add(option_3);
    frame.add(option_4);
    frame.add(label_2);

    frame.setVisible(true);
  }
}
