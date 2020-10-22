import java.awt.*;
import javax.swing.JFrame;

// Reference :
// https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics2D.html

// AWT => Abstract Window Toolkit
// We need to extend Canvas class and provide our paint method

public class DisplayGraphics extends Canvas {

  public static void main(String[] args) {
    DisplayGraphics display_gfx = new DisplayGraphics();
    JFrame application_frame = new JFrame();
    application_frame.add(display_gfx);

    // Let's create window frame of 1280 width and 800 height
    application_frame.setSize(1280, 800);
    application_frame.setVisible(true);

    System.out.println("Press ctrl-c to quit.");
  }

  // Paint method - Standard rendering function
  public void paint(Graphics g) {
    // Let's create graphics 2D object from Graphics g object
    Graphics2D g2d = (Graphics2D) g;
    // Background can be set with setBackground function
    setBackground(Color.BLACK);
    myDrawLines(g2d);
  }

  public void myDrawLines(Graphics2D g2d) {
    // Let's draw a diagonal line in our application frame

    // Line 1
    g2d.setColor(Color.GREEN);
    g2d.drawLine(0, 0, 1280, 800);

    // Line 2
    g2d.setColor(Color.RED);
    g2d.drawLine(1280, 0, 0, 800);

    // ARC
    g2d.setColor(Color.YELLOW);
    g2d.drawArc(500, 500, 500, 500, 30, 120);
  }

}
