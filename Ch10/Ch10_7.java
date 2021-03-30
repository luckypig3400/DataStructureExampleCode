/* �{���d��: Ch10_7.java */ 
import java.util.*;
class Customer {   // Customer���O�ŧi
   // �������
   public String name; // �m�W
   public int age;     // �~��
   // �غc�l: �ϥΰѼƳ]�w������ƪ�l��
   public Customer(String n, int v) {
      name = n;        // �]�w�m�W
      age = v;         // �]�w�~��
   }
}
// ��@Comparator���������O
class myComparator implements Comparator<Customer> {
   // �����Ӥ���
   public int compare(Customer ele1, Customer ele2) {
      // ����Ȥ�m�W
      return ele1.name.compareTo(ele2.name);
   }
}
// �D���O
public class Ch10_7 {
   // �D�{��
   public static void main(String[] args) {
      Customer temp;      // ��Customer�ߪ�����
      Customer joe = new Customer("Joe", 35);
      Customer jane = new Customer("Jane", 30);
      Customer tom  = new Customer("Tom", 28);
      Customer mary  = new Customer("Mary", 27);
      // �إ�Comparator����
      myComparator comparator = new myComparator();
      // ���X����TreeSet�ŧi
      TreeSet<Customer> tset = new TreeSet<>(comparator);
      tset.add(joe);      // �s�W����
      tset.add(tom);
      tset.add(jane);
      tset.add(mary);
      // �ϥ�Iterator�������TreeSet����
      Iterator<Customer> iterator = tset.iterator();
      System.out.println("TreeSet���X(iterator):");
      while (iterator.hasNext()) {
         // ���oCustomer����
         temp = iterator.next();
         // ��ܫȤ���
         System.out.println(" " + temp.name +
                       "(" + temp.age + ")");
      }  
   }
}