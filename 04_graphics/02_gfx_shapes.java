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
    myDrawShapes(g2d);

    // Wait for 1 second before filling the shapes
    Wait(1);

    myDrawShapesFilled(g2d);
  }

  // Helper function for simulating delay
  public static void Wait(int seconds) {
    try {
      Thread.sleep(seconds*1000);
    }
    catch(InterruptedException ex) {
      System.out.println("Error"+ ex);
    }
  }

  public void myDrawShapes(Graphics2D g2d) {
    // Let's draw a diagonal line in our application frame
    // Let's draw a diagonal line in our application frame
    g2d.drawLine(0, 0, 1280, 800);

    // Rectangle
    g2d.setColor(Color.RED);
    g2d.drawRect(100, 100, 300, 300);

    // Rounded Rectangle
    g2d.setColor(Color.RED);
    g2d.drawRoundRect(500, 10, 600, 100, 32, 32);

    // Oval
    g2d.setColor(Color.YELLOW);
    g2d.drawOval(50, 50, 1000, 600);

    // Circle
    g2d.setColor(Color.GREEN);
    g2d.drawOval(400, 400, 150, 150);
  }

  public void myDrawShapesFilled(Graphics2D g2d) {
    // Let's draw a diagonal line in our application frame
    // Let's draw a diagonal line in our application frame
    g2d.drawLine(0, 0, 1280, 800);

    // Rectangle
    g2d.setColor(Color.RED);
    g2d.fillRect(100, 100, 300, 300);

    // Rounded Rectangle
    g2d.setColor(Color.RED);
    g2d.fillRoundRect(500, 10, 600, 100, 32, 32);

    // Oval
    g2d.setColor(Color.YELLOW);
    g2d.fillOval(50, 50, 1000, 600);

    // Circle
    g2d.setColor(Color.GREEN);
    g2d.fillOval(400, 400, 150, 150);
  }

}
