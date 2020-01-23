import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double a, b, c, discriminant, solution1, solution2;
    Scanner input = new Scanner(System.in);

    // input
    System.out.println("What are the factors a, b and c of your quadratic equations?");
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();

    discriminant = b * b - 4 * a * c;

    // not a quadratic equation
    if (a == 0) {
      System.out.println("Not a quadratic equation.");
      return;
    }

    // no solution
    if (discriminant < 0) {
      System.out.println("There is no solution.");
    }
    // one solution
    else if (discriminant == 0) {
      solution1 = -b / (2 * a);
      System.out.printf("One solution: x = %f\n.", solution1);
    }
    // two solutions
    else {
      solution1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      solution2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.printf("Two solutions: x1 = %f, x2 = %f\n.", solution1, solution2);
    }

  }
}
