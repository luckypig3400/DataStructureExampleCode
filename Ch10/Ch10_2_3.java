/* �{���d��: Ch10_2_3.java */ 
import java.util.*;
public class Ch10_2_3 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����HashSet�ŧi
      HashSet<String> hset = new HashSet<>();
      String name = "Joe Chen";
      String name1 = "Tom Wang";
      hset.add("Joe Chen");      // �s�W����
      hset.add("Tom Wang");
      hset.add("Jane Chiang");
      // ���X����TreeSet�ŧi
      TreeSet<String> tset = new TreeSet<>(hset);
      // ��ܶ��X���󤺮e
      System.out.print("TreeSet���e: ");
      System.out.println(tset);
      tset.add("Marry Lee");
      tset.add("Tony Chen");
      // ��ܶ��X���󤺮e
      System.out.print("�s�W�G����: ");
      System.out.println(tset);
      System.out.println("�Ĥ@��: " + tset.first());
      System.out.println("�̫�@��: " + tset.last());        
      // ���X���󪺳������e
      System.out.print("�b[" + name + "]�����e: ");
      System.out.println(tset.headSet(name));
      System.out.print("�b[" + name + "]������: ");
      System.out.println(tset.tailSet(name)); 
      System.out.print("�b[" + name + "]�M[" + name1 +
                       "]����: " );
      System.out.println(tset.subSet(name, name1));       
   }
}