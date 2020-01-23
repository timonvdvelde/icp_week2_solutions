import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int userNumber;
    int userDigit1, userDigit2, userDigit3;
    int winDigit1,  winDigit2,  winDigit3;
    Scanner input = new Scanner(System.in);

    // Ask user input
    System.out.println("Guess the 3-digit lottery number: ");
    userNumber = input.nextInt();
    
    // split user input into digits.
    userDigit1 = userNumber % 10;
    userDigit2 = userNumber / 10 % 10;
    userDigit3 = userNumber / 100;

    // generate winning number
    winDigit1 = (int) (Math.random() * 5);
    winDigit2 = (int) (Math.random() * 5);
    winDigit3 = (int) (Math.random() * 5);
    System.out.printf("The winning number was %d%d%d\n", winDigit1, winDigit2, winDigit3);

    // All digits match
    if (userDigit1 == winDigit1 && userDigit2 == winDigit2 && userDigit3 == winDigit3) {
      System.out.println("You win 5 schmeckels!");
    }
    // All digits in user number exist in the winning number
    else if ((userDigit1 == winDigit1 || userDigit1 == winDigit2 || userDigit1 == winDigit3) 
          && (userDigit2 == winDigit1 || userDigit2 == winDigit2 || userDigit2 == winDigit3)
          && (userDigit3 == winDigit1 || userDigit3 == winDigit2 || userDigit3 == winDigit3)) {
      System.out.println("You win 3 schmeckels!");
    }
    // At least one digit in the user number exists in the winning number
    else if (userDigit1 == winDigit1 || userDigit1 == winDigit2 || userDigit1 == winDigit3 
          || userDigit2 == winDigit1 || userDigit2 == winDigit2 || userDigit2 == winDigit3
          || userDigit3 == winDigit1 || userDigit3 == winDigit2 || userDigit3 == winDigit3) {
      System.out.println("You win a schmeckel!");
    }
    // .. Too bad buddy
    else {
      System.out.println("You lose 10 schmeckels.");
    }
  }
}

