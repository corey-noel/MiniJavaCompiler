package syntaxtree;

import java.util.Vector;

public class VarDeclList extends Node {
  private Vector list;

  public VarDeclList(int l, int c) {
    super(l, c);
    list = new Vector();
  }

  public void addElement(VarDecl n) {
    list.addElement(n);
  }

  public VarDecl elementAt(int i)  {
    return (VarDecl)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }
}
