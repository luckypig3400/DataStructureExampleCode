/* �{���d��: Ch10_6_2.java */ 
import java.util.*;
public class Ch10_6_2 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����ArrayList�ŧi
      ArrayList<String> alist = new ArrayList<>(4);
      alist.add("���|�w");      // �s�W����
      alist.add("���p��");
      alist.add("���p�w");
      alist.add("�i�L��");
      System.out.println("ArrayList����: " + alist);
      // �ϥ�ListIterator�������List����
      System.out.print("List����(ListIterator):");
      ListIterator<String> iterator=alist.listIterator(0);
      while (iterator.hasNext() )
         System.out.print(" " + iterator.next());
      System.out.println();
      // �ϥ�ListIterator�����ϦV���List����
      System.out.print("�ϦV��ܤ���(ListIterator):");
      ListIterator<String> iterator1 =
                    alist.listIterator(alist.size());
      while (iterator1.hasPrevious() )
         System.out.print(" "+iterator1.previous());
      System.out.println();
   }
}