package com.vijfhart.casestudy.tree;

public interface TreeIterable<E extends Node<E>> extends Iterable<E> {
  @Override
  public TreeIterator<E> iterator();

}