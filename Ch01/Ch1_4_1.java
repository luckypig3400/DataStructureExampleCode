/* �{���d��: Ch1_4_1.java */
class Customer {           // Customer���O�ŧi
   private String name;    // �������
   private String address;
   public int age;
   // �غc�l: �ϥΰѼƳ]�w������ƪ�l��
   public Customer(String name, String a) {
      this.name = name;    // �]�w�m�W
      address = a;         // �]�w�a�}
   }
   // ��k: �Ǧ^�m�W
   public String getName(){ return name; }
   // ��k: �Ǧ^���
   public String getAddress(){ return address; }
   // ��k: ��ܶl�H���
   public void printLabel()  {
      System.out.println("�m�W: " + name);
      System.out.println("�a�}: " + address);
      System.out.println("�~��: " + age);
      System.out.println("-------------------");
   }
}
// �D���O
public class Ch1_4_1 {
   // �D�{��
   public static void main(String[] args) {
      Customer joe;             // �ŧi�����ܼ�
      joe = new Customer("���|�w","�s�_��"); // �إߪ���
      joe.age = 37;             // ���wpublic�����ܼ� 
      joe.printLabel();         // �I�s��k
      System.out.println("�m�W: "+joe.getName());
      System.out.println("�a�}: "+joe.getAddress());
      System.out.println("�~��: "+joe.age);
   }
}