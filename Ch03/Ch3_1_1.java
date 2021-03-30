/* 程式範例: Ch3_1_1.java */ 
abstract class Shape {   // Shape抽象類別宣告
   // 成員資料
   public double x;   // X座標
   public double y;   // y座標
   // 抽象方法: 計算面積
   abstract void area();
}
class Circle extends Shape {  // Circle類別宣告
   // 成員資料
   public double r;   // 半徑
   // 建構子
   public Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // 成員方法: 實作抽象方法area()
   public void area() {
      System.out.println("圓面積: " + 3.1416*r*r);
   }
}
// 主程式類別
public class Ch3_1_1 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Circle類別型態的變數, 並且建立物件
      Circle c = new Circle(5.0, 10.0, 4.0);
      // 顯示圓形c的資料
      System.out.println("圓形c的資料 =====");
      System.out.println("X座標: " + c.x);
      System.out.println("Y座標: " + c.y);
      System.out.println("半徑: " + c.r);
      // 呼叫物件的實例方法
      c.area();
   }
}