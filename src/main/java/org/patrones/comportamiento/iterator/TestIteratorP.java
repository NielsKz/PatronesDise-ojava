package org.patrones.comportamiento.iterator;

import java.util.Iterator;

public class TestIteratorP {
  public static void main(String[] args) {
    ListNode<String> listNode = new ListNode<>(new Node<>("hola"));
    listNode.addEnd("como");
    listNode.addEnd("estas");
    Iterator<Node<String>> iterator = listNode.iterator;
    while (iterator.hasNext())
      System.out.println(iterator.next());

  }
}
