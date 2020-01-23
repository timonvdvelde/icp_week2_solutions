import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int a, b, c;
    Scanner input = new Scanner(System.in);

    // get input
    System.out.println("Enter three integers:");
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    // If a is the smallest number:
    if (a <= b && a <= c) {
      if (b <= c) {
        System.out.printf("%d %d %d\n", a, b, c);
      }
      else {
        System.out.printf("%d %d %d\n", a, c, b);
      }
    }
    // b is the smallest number
    else if (b <= a && b <= c) {
      if (a <= c) {
        System.out.printf("%d %d %d\n", b, a, c);
      }
      else {
        System.out.printf("%d %d %d\n", b, c, a);
      }
    }
    // c is the smallest number
    else if (c <= a && c <= b) {
      if (a <= b) {
        System.out.printf("%d %d %d\n", c, a, b);
      }
      else {
        System.out.printf("%d %d %d\n", c, b, a);
      }
    }

    // Note, you could also write non-nested if statements,
    // but this seemed logically easier for me to write.
  }
}

