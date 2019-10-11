package com.vijfhart.casestudy.tree;

public interface TreeIterable<E extends Node<E>> extends Iterable<E> {

  TreeIterator<E> iterator();

}