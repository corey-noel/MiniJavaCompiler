package syntaxtree;

import java.util.Vector;

public class VarDeclList extends Node {
  private Vector list;

  public VarDeclList() {
    super(-1, -1);
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
