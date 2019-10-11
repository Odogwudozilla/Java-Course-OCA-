package com.vijfhart.casestudy.tree;

import java.util.*;

// Create a class NodeTree that implements Tree
public class NodeTree<E extends Node<E>> implements Tree<E> {

  // This class receives an ArrayList private List variable
  private List<E> nodeList = new ArrayList<>();

  public NodeTree() {
  }

  // Make the add (E node) method already
  public void add(E node) {
    // Nodes that are added with add () end up with nodeList
    nodeList.add(node);
  }

  // The currently only other method of NodeTree is the one method
  // TreeIterator returns.
  // Make this an anonymous inner class.
  public TreeIterator<E> iterator() {
    return new TreeIterator<E>() {

      // Use one for browsing nodes within TreeIterator
      // Iterator on the internal variable nodeList.
      // Save this in an instance variable with the name iterator, within the
      // anonymous inner class
      private Iterator<E> iterator;
      // Save in the TreeIterator after every call to next ()
      // the retrieved node in an instance variable with the name current.
      private E current;

      private E startNode;
      private boolean started = false;
      private boolean nextCalled = false;
      private int positionInList = 0;

      // Sort the variable nodeList when creating the new TreeIterator
      // We can't use a constructor for that, because it's an anonymous inner
      // class.
      // Therefore use an instance initializer.
      {
        Collections.sort(nodeList);
        // "Refresh" then the iterator variable
        iterator = nodeList.iterator();
      }

      public void startWith(E startNode) {
        // The startWith () method cannot be called after the first call
        // from next (). Check this
        if (started) {
          // Which exception is meant for this type of situation?
          throw new IllegalStateException("Iteration already started");
        }
        this.startNode = startNode;
        // Create a new List within startWith (),
        // and only include the nodes that participate
        List<E> list = new ArrayList<>();
        for (E e : list) {
          // Use within startWith ()
          // from a private boolean method descendantOfStartWith (E node)
          if (descendantOfStartWith(e)) {
            list.add(e);
          }
        }
        Collections.sort(list);
        // Then replace the iterator attribute with the Iterator of the filled List
        iterator = list.iterator();
      }

      // descendantOfStartWith (E node). This returns true as the specified node
      // equals or includes the specified start node, and
      // otherwise false
      private boolean descendantOfStartWith(E e) {
        E node = e;
        if (node == startNode)
          return true;
        while (node.getParent() != null) {
          if (node.getParent() == startNode)
            return true;
          node = node.getParent();
        }
        return false;
      }

      public boolean hasNext() {
        return iterator.hasNext();
      }

      public E next() {
        if (hasNext()) {
          started = true;
          current = iterator.next();
          nextCalled = true;
          positionInList++;
          return current;
        } else
          throw new IllegalStateException("Last element has been reached");
      }

      // The level method returns 0 if the current variable has no parent.
      // If current does have a parent, count the number of times that of that
      // parent again the parent can be retrieved.
      public int level() {
        int value = 0;
        E node = current;
        while (node != null && node != startNode) {
          node = node.getParent();
          value++;
        }
        return value;
      }

      public boolean isLeaf() {
        return false;
      }

      public void remove() {
        // The remove method may only be called after a call to next ().
        if (!nextCalled) {

          throw new IllegalStateException("Remove can only be used after a call of next()");
        }
        // A node may only be deleted if it is a leaf node.
        // Use the isLeaf () method of the current node for this
        if (!current.isLeaf()) {
          // Also give a clear error message if remove () is called with a
          // another node.
          throw new RuntimeException(current + " is not a leaf node.");
        }
        iterator.remove();
        if (startNode != null) {
          nodeList.remove(positionInList);
        }
        positionInList--;
      }

    };
  }
}