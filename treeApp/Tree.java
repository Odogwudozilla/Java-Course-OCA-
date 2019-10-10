package com.vijfhart.casestudy.tree;

public interface Tree<E extends Node<E>> extends TreeIterable<E> {

  public void add(E node);

}
