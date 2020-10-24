import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.awt.image.BufferedImage;

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
      // We are going to read data from image so using BufferedImage
      //
      BufferedImage img = ImageIO.read(new File("./sample.jpg"));

      int width = img.getWidth(null);
      int height = img.getHeight(null);

      System.out.printf("Image width and height = (%d, %d) \n", width, height );

      for(int x=0; x<10; x++) {
        for(int y=0; y<10; y++) {
          Color rgb = new Color(img.getRGB(x, y));
          System.out.printf("RGB data at (%d,%d) = [%d,%d,%d] \n", x, y, rgb.getRed(), rgb.getGreen(), rgb.getBlue() );
        }
      }
      //g2d.drawImage(img, 0, 0, null);
    }
    catch(Exception e) {
      System.out.println("Some error occurred");
    }
  }
}
