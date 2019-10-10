
package com.vijfhart.casestudy.tree;

public interface LevelComparable<E extends Node<E>> extends Comparable<E> {
  public int compareLevelTo();

}