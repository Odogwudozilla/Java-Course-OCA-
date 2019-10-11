package com.vijfhart.casestudy.tree;

public class NameNode extends AbstractNode<NameNode> {
  private String name;

  public NameNode(String name, NameNode parent) {
    setParent(parent);
    this.name = name;
  }

  public NameNode(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

  public String getName() {
    return name;
  }

}