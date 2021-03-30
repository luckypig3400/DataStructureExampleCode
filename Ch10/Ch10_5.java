/* �{���d��: Ch10_5.java */ 
import java.util.*;
class Stack {  // ���|���O���ŧi
   // �إ�LinkedList����
   private LinkedList<Integer> llist = new LinkedList<>();
   // �s�W���|����
   public void push(Integer obj) {
      llist.addFirst(obj);
   }
   // ���X���|����
   public Integer pop() {
      Integer obj = llist.getFirst();
      llist.removeFirst();
      return obj;
   }
   public boolean isStackEmpty() {
      return (llist.size()>0 ? false : true);
   }
}
// �D���O
public class Ch10_5 {
   // �D�{��
   public static void main(String[] args) {
      // ���|������String�}�C
      Integer[] data = new Integer[6];
      data[0] = new Integer(1);    // ���w�}�C���
      data[1] = new Integer(2);
      data[2] = new Integer(3);
      data[3] = new Integer(4);
      data[4] = new Integer(5);
      data[5] = new Integer(6);
      Stack stack = new Stack();   // �إ߰��|����
      System.out.print("�s�J���|��ƪ�����: ");
      // �ϥΰj��N��Ʀs�J���|
      for (int i=0; i< data.length; i++) {
         stack.push(data[i]);
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n���X���|��ƪ�����: ");
      while ( !stack.isStackEmpty() ) // ���X���|���
          System.out.print("[" + stack.pop() + "]");
      System.out.println();
   }
}