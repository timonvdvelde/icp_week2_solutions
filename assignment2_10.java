import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double centerX = 2, centerY = 2;
    double lengthX = 4, lengthY = 6;
    double testX, testY;
    Scanner input = new Scanner(System.in);

    // input
    System.out.println("Please enter a test coordinate x, y: ");
    testX = input.nextDouble();
    testY = input.nextDouble();
    
    // Finds boundaries of rectangle.
    double maxX = centerX + lengthX;
    double minX = centerX - lengthX;
    double maxY = centerY + lengthY;
    double minY = centerY - lengthY;

    // Tests whether point (textX, testY) is inside rectangle.
    if (testX <= maxX && testX >= minX && testY <= maxY && testY >= minY) {
      System.out.println("Test point is within rectangle.");
    }
    else {
      System.out.println("It's not.");
    }
  }
}

