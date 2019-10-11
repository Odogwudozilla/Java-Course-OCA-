package com.vijfhart.casestudy.tree;

public class TreeApp {
  public static void main(String[] args) {

    NameNode otu = new NameNode("Otu", null);
    NameNode abuo = new NameNode("Abuo", otu);
    NameNode ato = new NameNode("Ato", abuo);
    NameNode ano = new NameNode("Ano", otu);
    NameNode ise = new NameNode("Ise", otu);
    NameNode isii = new NameNode("Isii", ise);

    NodeTree<NameNode> tree = new NodeTree<>();

    tree.add(otu);
    tree.add(abuo);
    tree.add(ato);
    tree.add(ano);
    tree.add(ise);

    TreeIterator<NameNode> iter = tree.iterator();

    while (iter.hasNext()) {
      NameNode node = iter.next();
      System.out.println(node + ": " + iter.level());
    }

    System.out.println("At least I can (still) compile");
  }

}