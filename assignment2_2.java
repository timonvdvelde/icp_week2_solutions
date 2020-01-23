class Main {
  public static void main(String[] args) {
    // Generate random numbers between 0 and 6.
    double randomNumber = Math.random();
    randomNumber = randomNumber * 7;
    int randomInt = (int)randomNumber;

    // Test value and print day accordingly
    if (randomInt == 0) {
      System.out.println("Monday");
    }
    else if (randomInt == 1) {
      System.out.println("Tuesday");
    }
    else if (randomInt == 2) {
      System.out.println("Wednesday");
    }
    else if (randomInt == 3) {
      System.out.println("Thursday");
    }
    else if (randomInt == 4) {
      System.out.println("Friday");
    }
    else if (randomInt == 5) {
      System.out.println("Saturday");
    }
    else if (randomInt == 6) {
      System.out.println("Sunday");
    }
  }
}

