package com.vijfhart.casestudy.tree;

public interface Node<E extends Node<E>> extends Comparable<E>, LevelComparable<E> {
  public boolean isLeaf();

  public void setParent(E node);

  public E getParent();

}
