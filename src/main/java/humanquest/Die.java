package humanquest;

import java.util.Random;

/** Creates dice of various side counts.
 *
 * @author {YOUR NAME HERE}
 */
public class Die {
  
  private int value;
  private int sides;
  private Random dieObject = new Random();
  
  /** Constructor.
   *
   * @param faces Number representing the number of sides for a die
   */
  
  public Die(int faces) {
    sides = // TODO Set argument sides as incoming argument (faces)
  }
  
  /** Rolls the die and returns the result.
   *
   * 
   */
  public void roll() {
    value = // TODO Implement nextInt() to accomodate the number of sides
  }
  
  /** Makes the roll value available.
   *
   *
   */
  public int getRoll() {
    return value;
  }
  
  /** Casts value as a string.
   *
   * 
   */
  public String toString() {
    result = // TODO Create roll result as a string
    return result;
  }
}