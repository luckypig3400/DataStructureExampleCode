/* �{���d��: Ch1_4_3.java */
class Order {   // Order�~�h���O
   private String orderNo;
   private OrderStatus itsStatus;
   class OrderStatus { // OrderStatus���h���O
      private boolean isShipped;
      // �غc�l: OrderStatus���h���O
      public OrderStatus(boolean shipped) {
         isShipped = shipped;
      }
      // ��k: ��ܭq�檬�A
      public void printStatus() {
         System.out.println("  ===���h���O===");
         System.out.println("  �e�f: " + isShipped);
         System.out.println("  ==============");
      }
   }
   // �غc�l: Order�~�h���O
   public Order(String no, boolean shipped) {
      this.orderNo = no;
      itsStatus=new OrderStatus(shipped);// �إߤ��h����
   }
   // ������k: ��ܭq����
   public void printOrder() {
      System.out.println("----�q����----");
      System.out.println("�s��: " + orderNo);
      System.out.println("�e�f: "+itsStatus.isShipped);
      itsStatus.printStatus(); // �I�s���h���O��������k
   }
}
// �D���O
public class Ch1_4_3 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧi�����ܼƥB�إߪ���
      Order order1 = new Order("001", false);
      Order order2 = new Order("002", true);
      order1.printOrder();      // ��ܭq����
      order2.printOrder();
   }
}