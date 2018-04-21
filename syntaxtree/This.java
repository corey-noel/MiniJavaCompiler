package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class This extends Exp {
  public void accept(Visitor v, int l, int c) {
    super(l, c);
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}
