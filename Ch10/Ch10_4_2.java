/* �{���d��: Ch10_4_2.java */ 
import java.util.*;
public class Ch10_4_2 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����HashMap�ŧi
      HashMap<String,String> hmap = new HashMap<>();
      String key = "Tom";
      String name = "���|�w";
      System.out.println("�s�W�����e�O�_�O�Ū�=" +
                          hmap.isEmpty());
      hmap.put("Joe", "���|�w");    // �s�W����
      hmap.put("Jane", "���p��");
      hmap.put("Tom", "���p�w");
      hmap.put("Hueyan", "���|�w");
      // ��ܤؤo�M�O�_�O�Ū�
      System.out.println("�s�W��ؤo=" + hmap.size());
      System.out.println("�O�_�O�Ū�="+hmap.isEmpty());
      // ��ܶ��X���󤺮e
      System.out.println("Hashmap���e: " + hmap);
      // �O�_�֦����w����
      System.out.println("Hashmap�O�_��[" + key +
                     "]: " + hmap.containsKey(key));
      System.out.println("Hashmap�O�_��[" + name +
                     "]: " + hmap.containsValue(name));
      // ���o���w����
      System.out.print("���: " + key);
      System.out.println(" --> ��: " + hmap.get(key));
      // �ഫ��Set�MCollection����
      Set<String> keys = hmap.keySet();
      System.out.println("Keys���e: " + keys);
      Collection<String> values = hmap.values();
      System.out.println("Values���e: " + values);
      hmap.remove(key);     // �R������
      System.out.println("Hashmap�R��["+key+"]:"+hmap);
      hmap.clear();         // �M�����X����
   }
}