/* �{���d��: Ch10_2_2.java */ 
import java.util.*;
public class Ch10_2_2 {
   // �D�{��
   public static void main(String[] args) {
      // ���X����HashSet�ŧi
      HashSet<String> hset = new HashSet<>();
      String name = "���p��";
      String name1 = "���L";
      System.out.println("�s�W�����e�O�_�O�Ū�=" + 
                          hset.isEmpty());
      hset.add("���|�w");    // �s�W����
      hset.add("���p��");
      hset.add("���p�w");
      // ��ܤؤo�M�O�_�O�Ū�
      System.out.println("�s�W��ؤo=" + hset.size());
      System.out.println("�O�_�O�Ū�="+hset.isEmpty());
      // ��ܶ��X���󤺮e
      System.out.print("HashSet���e: ");
      System.out.println(hset);        
      // �O�_�֦����w����
      System.out.println("HashSet�O�_��[" + name + 
                         "]: " + hset.contains(name));
      System.out.println("HashSet�O�_��[" + name1 + 
                         "]: " + hset.contains(name1));
      // �R������
      hset.remove(name);
      System.out.print("HashSet�R��[" + name + "]:");
      System.out.println(hset);
      hset.clear();   // �M�����X����
   }
}