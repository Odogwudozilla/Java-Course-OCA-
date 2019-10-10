package com.vijfhart.casestudy.tree;

public class NameNode implements Node<NameNode> {
  private String name;
  private NameNode parent;

  public NameNode(String name, NameNode parent) {

    setParent(parent);

    this.name = name;

  }

  public NameNode(String name) {

    this.name = name;

  }

  @Override
  public String getName() {

    return name;

  }

  @Override
  public String toString() {

    return name;

  }

  @Override
  public NameNode getParent() {
    return parent;
  }

  @Override
  public boolean isLeaf() {
    return false;
  }

  @Override
  public void setParent(NameNode node) {
    this.parent = parent;
  }

  @Override
  public int compareLevelTo(NameNode node) {

  }

  @Override
  public int compareTo(NameNode node) {

  }

}