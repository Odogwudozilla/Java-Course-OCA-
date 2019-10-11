package com.vijfhart.casestudy.tree;

// Maak daarom de class AbstractNode aan die Node implementeert
// Verhuis de methoden compareTo(), compareLevelTo(), isLeaf(), 
// getParent() en setParent() naar AbstractNode
public abstract class AbstractNode<E extends AbstractNode<E>> implements Node<E> {

  private E parent;
  // Maak daarom een variabele childCount in AbstractNode: elke keer dat
  // setParent()
  // correct wordt aangeroepen, wordt childCount van de nieuwe parent node
  // opgehoogd,
  // en die van de vorige parent node verlaagd.
  int childCount;

  public void setParent(E e) {
    if (isDescendant(e)) {
      throw new IllegalArgumentException(e + " is a descendant of " + this + ", so can't be a parent");
    }
    this.parent = e;
    /*
     * if (this.parent.childCount > 0) { this.parent.childCount--; // childCount
     * oude parent updaten } this.parent = e; this.parent.childCount++; //
     * childCount nieuwe parent updaten;
     */
  }

  protected AbstractNode() {
  }

  public E getParent() {
    return parent;
  }

  @Override
  public boolean isLeaf() {
    return this.childCount == 0;
  }

  // Een opgegeven parent node in setParent() mag geen descendant node zijn van
  // de eigen node (this). Maak een private boolean methode isDescendant(E node)
  // die dit controleert.
  private boolean isDescendant(E e) {
    E node = e;
    while (node != null && node.getParent() != null) {
      if (node.getParent() == this) {
        return true; // e is descendant of this, can't be a parent of this
      }
      node = node.getParent();
    }
    return false;
  }

  public int compareLevelTo(E other) {
    if (this.getParent() == other.getParent()) {
      return 0;
    }
    if (other.getParent() == null) {
      return 1;
    }
    if (this.getParent() == null) {
      return -1;
    }
    return this.getParent().compareLevelTo(other.getParent());
  }

  public int compareTo(E other) {
    if (getParent() == null && other.getParent() != null)
      return -1;
    if (getParent() != null && other.getParent() == null)
      return 1;
    if (this.getParent() == other.getParent()) {
      return this.toString().compareTo(other.toString());
    }
    if (this.compareLevelTo(other) > 0) {
      if (getParent() == other)
        return 1;
      return getParent().compareTo(other);
    }
    if (this.compareLevelTo(other) < 0) {
      if (this == other.getParent())
        return -1;
      return this.compareTo(other.getParent());
    }
    return this.getParent().compareTo(other.getParent());
  }
}