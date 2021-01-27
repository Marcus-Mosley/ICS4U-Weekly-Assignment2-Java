import java.util.Random;
import java.util.Scanner;

/**
* The RockPaperScissor program implements is the 
* childhood Rock, Paper, Scissors Game.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-27
*/
public class RockPaperScissors {
  /**
  * The check method sets the CPU's play and finds the winner.
  */
  public static String[] check(String player) {
    Random rand = new Random();
    int random = 1 + rand.nextInt(3);
    String cpu = "";
    String outcome = "";
    String[] text = new String[2];

    if (random == 1) {
      cpu = "ROCK";
      if (player.contains("ROCK")) {
        outcome = "A Tie? I will beat you next Time!";
      } else if (player.contains("PAPER")) {
        outcome = "Oh no, I lost! How did you find out my trick of always playing Rock?";
      } else if (player.contains("SCISSORS")) {
        outcome = "I win! Please Try Again.";
      }
    } else if (random == 2) {
      cpu = "PAPER";
      if (player.contains("ROCK")) {
        outcome = "I win! Please Try Again.";
      } else if (player.contains("PAPER")) {
        outcome = "A Tie? I will beat you next Time!";
      } else if (player == "SCISSORS") {
        outcome = "Oh no, I lost! How did you find out my trick of always playing Paper?";
      }
    } else if (random == 3) {
      cpu = "SCISSORS";
      if (player.contains("ROCK")) {
        outcome = "Oh no, I lost! How did you find out my trick of always playing Scissors?";
      } else if (player.contains("PAPER")) {
        outcome = "I win! Please Try Again.";
      } else if (player.contains("SCISSORS")) {
        outcome = "A Tie? I will beat you next Time!";
      }
    }

    text[0] = cpu;
    text[1] = outcome;
    return text;
  }

  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    String player;

    System.out.println("Rock, Paper, Scissors!");

    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.print("What do you choose?: ");
      player = input.nextLine().toUpperCase();

      if (player.contains("ROCK")) {
        break;
      } else if (player.contains("PAPER")) {
        break;
      } else if (player.contains("SCISSORS")) {
        break;
      } else {
        System.out.print("That is not an option!");
      }
    }

    String[] text = check(player);
    System.out.println("I choose " + text[0] + "!");
    System.out.printf(text[1]);
  }
}
