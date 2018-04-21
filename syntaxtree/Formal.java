package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class Formal extends Node {
  public Type t;
  public Identifier i;

  public Formal(Type at, Identifier ai, int l, int c) {
    super(l, c);
    t=at; i=ai;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}
