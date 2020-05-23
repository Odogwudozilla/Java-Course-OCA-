
class QuadrilateralTypes extends Shape implements ShapeProperty {

  // set the final variables for the shape
  public final int QUADRILATERAL_SIDE_LENGTH = 4;
  public final String name = "QUADRILATERAL";
  public final String PREFIX = "Your Quadrilateral is ";
  public final String RECT = "RECTANGLE";
  public final String SQUA = "SQUARE";
  public final String TRAP = "TRAPEZIUM";

  public String riderMessage = "\nRemember, for a Quadrilateral to be valid, it must be a enclosed shape with exactly "
      + QUADRILATERAL_SIDE_LENGTH + " sides";

  double[] theSides = new double[QUADRILATERAL_SIDE_LENGTH]; // create an array

  // Prints a welcome message to the console
  @Override
  public void introMessage() {
    System.out
        .println("This program collects inputs (representing 'sides') from the user and then determines the type of "
            + getName() + ", given those sides." + riderMessage + " \nLet's begin...");
  }

  @Override
  public void determineShapeType() {
    // TODO Auto-generated method stub

  }

  @Override
  public double[] calculateShape() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * The method below checks if the sides can form a valid Quadrilateral.
   */
  @Override
  public boolean isShapeValid(double[] theSides) {
    // the length of the array of sides must be equal to 4
    if (theSides.length != QUADRILATERAL_SIDE_LENGTH) {
      return false;
    }
    // each side must have a value greater than zero
    eachSide();

    return true;
  }

  @Override
  public String getName() {
    return this.name;
  }

}