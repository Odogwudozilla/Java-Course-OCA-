class Rectangle implements Comparable<Rectangle> {
  int length, width;

  Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public String toString() {
    return "("+length+","+width+")"; 
  }

  public int compareTo(Rectangle other) {
    final int myArea = this.length*this.width;
    final int otherArea = other.length*other.width;
    if(myArea > otherArea) // this is greater than other  
      return 1;
    if(myArea < otherArea) // this is smaller than other 
      return -1;
    return 0;              // this and other have equal areas
  }
}
