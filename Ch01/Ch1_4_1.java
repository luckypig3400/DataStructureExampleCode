/* 程式範例: Ch1_4_1.java */
class Customer {           // Customer類別宣告
   private String name;    // 成員資料
   private String address;
   public int age;
   // 建構子: 使用參數設定成員資料初始值
   public Customer(String name, String a) {
      this.name = name;    // 設定姓名
      address = a;         // 設定地址
   }
   // 方法: 傳回姓名
   public String getName(){ return name; }
   // 方法: 傳回月份
   public String getAddress(){ return address; }
   // 方法: 顯示郵寄資料
   public void printLabel()  {
      System.out.println("姓名: " + name);
      System.out.println("地址: " + address);
      System.out.println("年齡: " + age);
      System.out.println("-------------------");
   }
}
// 主類別
public class Ch1_4_1 {
   // 主程式
   public static void main(String[] args) {
      Customer joe;             // 宣告物件變數
      joe = new Customer("陳會安","新北市"); // 建立物件
      joe.age = 37;             // 指定public成員變數 
      joe.printLabel();         // 呼叫方法
      System.out.println("姓名: "+joe.getName());
      System.out.println("地址: "+joe.getAddress());
      System.out.println("年齡: "+joe.age);
   }
}