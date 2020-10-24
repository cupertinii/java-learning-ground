import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
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

    myDrawImage(g2d);
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

  public void myDrawImage(Graphics2D g2d) {
    g2d.setColor(Color.RED);

    // We are going to use ImageIO for reading jpg data
    // Reference:
    // https://docs.oracle.com/javase/7/docs/api/javax/imageio/ImageIO.html
    //
    try {
      Image img = ImageIO.read(new File("./sample.jpg"));
      g2d.drawImage(img, 0, 0, null);
    }
    catch(Exception e) {
      System.out.println("Some error occurred");
    }
  }
}
