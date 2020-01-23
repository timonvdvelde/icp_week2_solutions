class Main {
  public static void main(String[] args) {
    // ** Make sure you understand how this works! **

    // Math.random returns a random value between 0 and 1.
    double randomNumber = Math.random();
    System.out.println("randomNumber: " + randomNumber);

    // If we want instead a random number between 0 and 50,
    // we multiply our randomNumber by 50.
    randomNumber = randomNumber * 50;
    System.out.println("randomNumber * 50: " + randomNumber);

    // We can then cast it to an integer to get rid of the 
    // decimal value.
    int randomInt = (int)randomNumber;

    // Our final output.
    System.out.printf("Random integer between 0 and 50: %d\n", randomInt);
  }
}

