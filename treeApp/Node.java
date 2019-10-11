package com.vijfhart.casestudy.tree;

public interface Node<E extends Node<E>> extends Comparable<E>, LevelComparable<E> {
  boolean isLeaf();

  void setParent(E parent);

  E getParent();

}
