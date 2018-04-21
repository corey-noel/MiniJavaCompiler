package syntaxtree;

import java.util.Vector;

public class ClassDeclList extends Node {
   private Vector list;

   public ClassDeclList(int l, int c) {
    super(l, c);
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
