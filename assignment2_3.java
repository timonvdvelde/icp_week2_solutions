import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int day;
    Scanner input = new Scanner(System.in);

    // get input
    day = input.nextInt();

    // print output based on input
    if (day == 0) {
      System.out.println("Monday");
    }
    else if (day == 1) {
      System.out.println("Tuesday");
    }
    else if (day == 2) {
      System.out.println("Wednesday");
    }
    else if (day == 3) {
      System.out.println("Thursday");
    }
    else if (day == 4) {
      System.out.println("Friday");
    }
    else if (day == 5) {
      System.out.println("Saturday");
    }
    else if (day == 6) {
      System.out.println("Sunday");
    }

  }
}
