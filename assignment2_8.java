import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int player, computer;
    Scanner input = new Scanner(System.in);

    // Ask user input and select option for the computer player.
    System.out.println("Pick one: rock (0), paper (1), scissors (2)");
    player = input.nextInt(); 
    computer = (int) (Math.random() * 3);

    // Announce what the computer picked.
    if (computer == 0) {
      System.out.println("Computer picks rock.");
    }
    else if (computer == 1) {
      System.out.println("Computer picks paper.");
    }
    else if (computer == 2) {
      System.out.println("Computer picks scissors.");
    }
    else {
      // This shouldn't happen unless you have a bug.
      System.out.println("Computer is trying to cheat..");
      return;
    }

    // Check win or lose conditions.
    if ((player == 0 && computer == 1) ||
        (player == 1 && computer == 2) ||
        (player == 2 && computer == 0)) {
      System.out.println("You lose!!");
    }
    // Draw
    else if (player == computer) {
      System.out.println("You didn't lose, but at least you also didn't win.");
    }
    // Player wins.
    else if ((computer == 0 && player == 1) ||
             (computer == 1 && player == 2) ||
             (computer == 2 && player == 0)) {
      System.out.println("Hm, you win.");
    }
    else {
      System.out.println("Invalid input or something");
    }
  }
}

