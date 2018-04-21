package syntaxtree;

import java.util.Vector;

public class FormalList extends Node {
   private Vector list;

   public FormalList(int l, int c) {
    super(l, c);
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
