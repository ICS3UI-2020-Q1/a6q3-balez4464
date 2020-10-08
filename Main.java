import java.util.Scanner;
/**
 *This program allows the user to enter numbers and finds the largest number within the array
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user to put in numbers
    System.out.println("Please enter in 10 integers to put into the array");

    //creates a constant for the array
    final int NUM_AMOUNT = 10;

    //creates array for the nummebrs
    int numbers[] = new int[NUM_AMOUNT];

    //for loop so user can write down their numbers
    for (int i = 0; i < numbers.length; i++){
      //allows them to print in thier numbers
      numbers[i] = input.nextInt();
    }

    //variable to find the largest value
    int comparer = numbers[0];

    //for loop to compare the greatest value to
    for (int i = 0; i < numbers.length; i++){
      //if the comparer is less then the given number
      if (comparer < numbers[i]){
        //makes the comaprer the largest out of the group
        comparer = numbers[i];
      }
    }
    //prints out largest number
    System.out.println("The largest number is " + comparer);


  }
}
