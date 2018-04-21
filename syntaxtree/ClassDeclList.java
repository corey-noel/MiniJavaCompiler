package syntaxtree;

import java.util.Vector;

public class ClassDeclList extends Node {
  private Vector list;

  public ClassDeclList() {
    super(-1, -1);
    list = new Vector();
  }

  public void addElement(ClassDecl n) {
    list.addElement(n);
  }

  public ClassDecl elementAt(int i)  {
    return (ClassDecl)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }
}
