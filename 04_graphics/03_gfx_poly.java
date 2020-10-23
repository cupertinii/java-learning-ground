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
    myDrawPolyShapes(g2d);

    // Wait for 1 second before filling the shapes
    Wait(1);

    myDrawPolyFilledShapes(g2d);
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

  public void myDrawPolyShapes(Graphics2D g2d) {
    // a Point P is (x, y) taken from xPoints[i] and yPoints[i]
    int[] xPoints = { 10, 120, 440, 50 };
    int[] yPoints = { 50, 220, 540, 260 };

    // Will draw a open polygon as the last coordinates are not same as first
    g2d.setColor(Color.RED);
    g2d.drawPolyline(xPoints, yPoints, xPoints.length);

    // Will draw a closed polygon with same set of points
    g2d.setColor(Color.GREEN);
    g2d.drawPolygon(yPoints, xPoints, xPoints.length);
  }

  public void myDrawPolyFilledShapes(Graphics2D g2d) {
    int[] xPoints = { 10, 120, 440, 50 };
    int[] yPoints = { 50, 220, 540, 260 };
    g2d.setColor(Color.YELLOW);
    g2d.fillPolygon(yPoints, xPoints, xPoints.length);
  }

}
