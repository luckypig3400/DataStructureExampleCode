/* �{���d��: Ch10_6_1.java */ 
import java.util.*;
public class Ch10_6_1 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����HashSet�ŧi
      HashSet<String> hset = new HashSet<>();
      hset.add("���|�w");
      hset.add("���p��");
      hset.add("���p�w");
      System.out.println("HashSet���e: " + hset);
      // ���X����HashMap�ŧi
      HashMap<String,String> hmap = new HashMap<>();
      hmap.put("Joe", "���|�w");
      hmap.put("Jane", "���p��");
      hmap.put("Tom", "���p�w");
      System.out.println("HashMap���e: " + hmap);
      // �ϥ�Iterator�������HashSet����
      Iterator<String> iterator = hset.iterator();
      System.out.print("HashSet���X(iterator):");
      while (iterator.hasNext())
         System.out.print(" "+iterator.next());
      System.out.println();
      // �ϥ�Iterator�������Keys����
      Set<String> keys = hmap.keySet();
      Iterator<String> iterator1 = keys.iterator();
      System.out.print("HashMap��Keys���X(iterator):");
      while (iterator1.hasNext())
         System.out.print(" "+iterator1.next());
      System.out.println();
   }
}