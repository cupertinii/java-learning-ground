/*

Use System.out.printf( " format expression as string ", variables )
e.g. format-expression-as-string = "%10.2f"

Types:
d : decimal integer [byte, short, int, long]
f : floating-point number [float, double]
c : character Capital C will uppercase the letter
s : String Capital S will uppercase all the letters in the string
h : hashcode A hashcode is like an address. This is useful for printing a reference
n : newline Platform specific newline character- use %n instead of \n for greater compatibility
*/

public class App {
  public static void main(String[] args) {
    double area = 500.0/3;

    // Simple print a line (with a new line) on stdout
    System.out.println("Area = " + area);

    // Printing with a format - one decimal
    System.out.printf("Area = %.1f\n", area);

    // with leading zeros
    System.out.printf("Area = %010.1f\n", area);

    // with leading spaces
    System.out.printf("Area = %10.1f\n", area);


    // Printing currency rounded off
    double investment = 31405020.02;
    System.out.printf("Investment = $%,.0f\n", investment);

    // Octal and Hex representations..
    long color = 0x45FF00;
    System.out.printf("Color => %d (decimal) = %o (octal) = %h (hex) = %x (hex)\n", color, color, color, color);

  }
}
