/* �{���d��: Ch10_4_3.java */ 
import java.util.*;
public class Ch10_4_3 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����HashMap�ŧi
      HashMap<String,String> hmap = new HashMap<>();
      String key1 = "Joe";
      String key2 = "Tom";
      hmap.put("Joe", "���|�w");    // �s�W����
      hmap.put("Jane", "���p��");
      hmap.put("Tom", "���p�w");
      // ���X����TreeMap�ŧi
      TreeMap<String,String> tmap = new TreeMap<>(hmap);
      // ��ܶ��X���󤺮e
      System.out.println("TreeMap���e: " + tmap);
      tmap.put("Marry", "���L" );
      tmap.put("Tony", "�p�s�k" );
      // ��ܶ��X���󤺮e
      System.out.println("�s�W�G����: " + tmap);
      System.out.println("�Ĥ@��: "+tmap.firstKey());
      System.out.println("�̫�@��: "+tmap.lastKey());
      // ���X���󪺳������e
      System.out.print("�b[" + key1 + "]��ȫe: ");
      System.out.println(tmap.headMap(key1));
      System.out.print("�b[" + key2 + "]��ȫ�: ");
      System.out.println(tmap.tailMap(key2));
      System.out.print("�b[" + key1 + "]�M[" + key2 +
                       "]����: " );
      System.out.println(tmap.subMap(key1, key2));
   }
}