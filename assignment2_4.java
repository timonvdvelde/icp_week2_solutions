import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int today, nrDays, newDay;
    Scanner input = new Scanner(System.in);

    // ask for input
    System.out.println("What is the starting day?");
    today = input.nextInt();
    System.out.println("How many days will pass?");
    nrDays = input.nextInt();

    // add nrDays to today and put it back in 0-6 range.
    newDay = (today + nrDays) % 7;
    
    // print resulting day
    if (newDay == 0) {
      System.out.println("Monday");
    }
    else if (newDay == 1) {
      System.out.println("Tuesday");
    }
    else if (newDay == 2) {
      System.out.println("Wednesday");
    }
    else if (newDay == 3) {
      System.out.println("Thursday");
    }
    else if (newDay == 4) {
      System.out.println("Friday");
    }
    else if (newDay == 5) {
      System.out.println("Saturday");
    }
    else if (newDay == 6) {
      System.out.println("Sunday");
    }
  }
}
