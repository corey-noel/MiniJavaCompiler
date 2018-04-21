package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class Type extends Node {
  public Type(int l, int c) {
    super(l, c);
  }

  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}
