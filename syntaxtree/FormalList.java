package syntaxtree;

import java.util.Vector;

public class FormalList extends Node {
  private Vector list;

  public FormalList() {
    super(-1, -1);
    list = new Vector();
  }

  public void addElement(Formal n) {
    list.addElement(n);
  }

  public Formal elementAt(int i)  {
    return (Formal)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }
}
