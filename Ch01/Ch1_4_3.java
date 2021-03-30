/* 程式範例: Ch1_4_3.java */
class Order {   // Order外層類別
   private String orderNo;
   private OrderStatus itsStatus;
   class OrderStatus { // OrderStatus內層類別
      private boolean isShipped;
      // 建構子: OrderStatus內層類別
      public OrderStatus(boolean shipped) {
         isShipped = shipped;
      }
      // 方法: 顯示訂單狀態
      public void printStatus() {
         System.out.println("  ===內層類別===");
         System.out.println("  送貨: " + isShipped);
         System.out.println("  ==============");
      }
   }
   // 建構子: Order外層類別
   public Order(String no, boolean shipped) {
      this.orderNo = no;
      itsStatus=new OrderStatus(shipped);// 建立內層物件
   }
   // 成員方法: 顯示訂單資料
   public void printOrder() {
      System.out.println("----訂單資料----");
      System.out.println("編號: " + orderNo);
      System.out.println("送貨: "+itsStatus.isShipped);
      itsStatus.printStatus(); // 呼叫內層類別的成員方法
   }
}
// 主類別
public class Ch1_4_3 {
   // 主程式
   public static void main(String[] args) {
      // 宣告物件變數且建立物件
      Order order1 = new Order("001", false);
      Order order2 = new Order("002", true);
      order1.printOrder();      // 顯示訂單資料
      order2.printOrder();
   }
}