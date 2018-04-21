package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class ClassDecl extends Node {
  public ClassDecl(int l, int c) {
    super(l, c);
  }

  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
}
