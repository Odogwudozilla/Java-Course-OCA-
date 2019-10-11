package com.vijfhart.casestudy.tree;

import java.util.*;

public interface TreeIterator<E extends Node<E>> extends Iterator<E> {
  public int level();

  public void startWith(E e);

  public boolean isLeaf();

}