package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class Exp extends Node {
  public Exp(int l, int c) {
    super(l, c);
  }
  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}
