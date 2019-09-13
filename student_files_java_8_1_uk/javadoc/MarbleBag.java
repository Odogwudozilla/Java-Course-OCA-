
/**
 * The class Marblebag is an example class.
 * The methods setLost and setWon can be used to change the marble count.
 * The method getMarbleCount can be used to retrieve the marble count.
 *
 *
 *
 *
 * @author Marko Draisma
 * @version 1.0 05/09/2002
 */

  public class MarbleBag{

/**
 *  The attribute marbleCount won't show in the Java Documentation.
 *  Only public attributes, constructors and methods are shown.
 */

  private int marbleCount;


/**
 *  A default marble bag with 30 marbles.
 */

  public MarbleBag() {
    marbleCount = 30;
  }
  
/**
 *  A marble bag with a given marble count.
 *
 *  @param  count      The marble count in this marble bag.
 */

  public MarbleBag(int count) {
    marbleCount=count;
  }
  

/**
 *  Increases the marble count in the marble bag after a won match.
 *
 *  @param  won    The marble count that is won.
 *
 *  @see    #getMarbleCount()
 *  @see    #setLost(int)
 */

  public void setWon(int won) {
    marbleCount = marbleCount + won;
  }
  

/**
 *  Decreases the narble count in the marble bag after a lost match.
 *
 *  @param  lost    The marble count that is lost. 
 *  @see    #getMarbleCount()
 *  @see    #setWon(int)
 */

  public void setLost(int lost) {
    marbleCount = marbleCount - lost;
  }

/**
 *  Shows the current marble count in the marble bag.
 *
 *  @return The current marble count in the marble bag.
 *  @see    #setWon(int)
 *  @see    #setLost(int)
 */

  public int getMarbleCount() {
    return marbleCount;
  }
  
}
