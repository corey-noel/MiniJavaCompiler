package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class Statement extends Node {
  public Statement(int l, int c) {
    super(l, c);
  }

  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}
