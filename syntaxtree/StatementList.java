package syntaxtree;

import java.util.Vector;

public class StatementList extends Node {
  private Vector list;

  public StatementList() {
    super(-1, -1);
    list = new Vector();
  }

  public void addElement(Statement n) {
    list.addElement(n);
  }

  public Statement elementAt(int i)  {
    return (Statement)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }
}
