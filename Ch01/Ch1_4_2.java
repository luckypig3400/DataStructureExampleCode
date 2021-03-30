/* 程式範例: Ch1_4_2.java */
class Vehicle {     // Vehicle類別宣告 
   private String name;    // 型號名稱
   private double price;   // 價格
   // 建構子
   public Vehicle(String name, double price) {
      this.name = name;
      this.price = price;
   }
   // 方法: 顯示交通工具的資料
   public void printVehicle() {
      // 顯示交通工具的資料
      System.out.println("型號: " + name);
      System.out.println("價格: " + price);
   } 
}
class Car extends Vehicle { // Car類別宣告
   private int doors;       // 幾門車
   // 建構子
   public Car(String name, double price, int doors) {
      super(name, price);   // 呼叫父類別的建構子
      this.doors = doors;
   }
   // 方法: 顯示轎車資料
   public void printCar() {
      // 顯示轎車資料
      System.out.println("====轎車資料====");
      printVehicle();       // 呼叫父類別的成員方法
      System.out.println("車有幾門: " + doors);
   } 
}
// 主類別
public class Ch1_4_2 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Car類別型態的變數, 並且建立物件
      Car nissan = new Car("Sentra180", 49.9,4);
      Car honda = new Car("Civil", 55, 2); 
      nissan.printCar();       // 顯示轎車資料
      honda.printCar();
   }
}