package org.patrones.comportamiento.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TestIterator {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("hola","como","estas");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext())
      System.out.println(iterator.next());

    Stack<String> stack = new Stack<>();
    stack.push("hola");
    stack.push("como");
    stack.push("estas");
    iterator = stack.iterator();
    while (iterator.hasNext())
      System.out.println(iterator.next());

  }
}
