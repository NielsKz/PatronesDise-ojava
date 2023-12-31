package org.patrones.comportamiento.visitor;

public interface Visitable {
  void accept(Visitor visitor);

}
