import javax.swing.*;
import java.awt.event.*;

public class GUIApp {
  public static void main(String[] args) {

    JFrame frame = new JFrame("Cupertinii Swing GUI");
    frame.setSize(400, 500);
    frame.setLayout(null);

    JLabel label = new JLabel("Select days");
    label.setBounds(100, 20, 200, 20);

    JLabel label_2 = new JLabel("");
    label_2.setBounds(100, 200, 200, 20);

    // 4 radio button options
    JCheckBox option_1, option_2, option_3, option_4, option_5;

    option_1 = new JCheckBox("Monday");
    option_1.setBounds(100, 50, 200, 30);
    option_2 = new JCheckBox("Tuesday");
    option_2.setBounds(100, 80, 200, 30);
    option_3 = new JCheckBox("Wednesday");
    option_3.setBounds(100, 110, 200, 30);
    option_4 = new JCheckBox("Thursday");
    option_4.setBounds(100, 140, 200, 30);
    option_5 = new JCheckBox("Friday");
    option_5.setBounds(100, 170, 200, 30);

    // Event handlers
    // Either we can do this in following way
    option_1.addActionListener(new ActionListener() {
      boolean selected_op = false;
      public void actionPerformed(ActionEvent e) {
        selected_op = !selected_op;
        label_2.setText("Monday : " + selected_op );
      }
    });

    // Or we can directly use ItemListener
    option_2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        boolean selected_op;
        if(e.getStateChange() == 1) {
          selected_op = true;
        }
        else {
          selected_op = false;
        }
        label_2.setText("Tuesday : " + selected_op );
      }
    });

    option_3.addActionListener(new ActionListener() {
      boolean selected_op3 = false;
      public void actionPerformed(ActionEvent e) {
        selected_op3 = !selected_op3;
        label_2.setText("Wednesday : " + selected_op3 );
      }
    });
    option_4.addActionListener(new ActionListener() {
      boolean selected_op4 = false;
      public void actionPerformed(ActionEvent e) {
        selected_op4 = !selected_op4;
        label_2.setText("Thursday : " + selected_op4 );
      }
    });
    option_5.addActionListener(new ActionListener() {
      boolean selected_op5 = false;
      public void actionPerformed(ActionEvent e) {
        selected_op5 = !selected_op5;
        label_2.setText("Friday : " + selected_op5 );
      }
    });

    // Add all the components to application frame
    frame.add(label);
    frame.add(option_1);
    frame.add(option_2);
    frame.add(option_3);
    frame.add(option_4);
    frame.add(option_5);
    frame.add(label_2);

    frame.setVisible(true);
  }
}
