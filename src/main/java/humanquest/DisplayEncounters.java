package humanquest;

import //TODO Import the correct package and class for the Die object

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Class creates encounters and uses dice.
 *
 * @author {YOUR NAME HERE}
 */
public class DisplayEncounters {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // TODO Create and initialize the total variable
    /*
     * TODO Create and roll dice
     */
    // Set up scanning and files.
    File encFile = null;
    Scanner scanner = null;
    // Connect files to Scanner object.
    try {
      encFile = new File("inputs/encounters.txt");
      scanner = new Scanner(encFile);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String title = // TODO Get encounter title from file
    int check = // TODO Get difficulty number from file
    // TODO Use encounterReport
  } 
  
  /** Prints the reports of the encounter.
   *
   * @param title Name of the encounter
   * @param check Roll required for encounter success
   * @param total The total roll of all dice
   */
  public static void encounterReport(String title, int check, int total) {
    title = title.replace("_"," ");
    System.out.println("To resist the charms of the " + title + ":");
    System.out.println("Gator needed to roll\t" + check);
    System.out.println("Gator's actual roll\t" + total);
    System.out.println();
    if (total > check) {
      System.out.println("The Gator Wizard resisted!");
    } else {
      System.out.println("The Gator Wizard was charmed!");
    }
  }
}