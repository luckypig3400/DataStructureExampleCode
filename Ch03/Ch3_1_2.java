/* 程式範例: Ch3_1_2.java */ 
abstract class Shape {  // Shape抽象類別宣告
   // 成員資料
   public double x;   // X座標
   public double y;   // Y座標
}
interface AreaInterface {   // AreaInterface介面宣告
   // 常數的宣告
   final double PI = 3.1415926;
   // 介面方法: 計算面積
   void area();
}
// Circle類別宣告
class Circle extends Shape implements AreaInterface {
   // 成員資料
   private double r;     // 半徑
   // 建構子
   public Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // 實作AreaInterface介面的方法area()
   public void area() {
      System.out.println("X座標: " + x);
      System.out.println("Y座標: " + y);
      System.out.println("圓半徑: " + r);
      System.out.println("圓面積: " + PI*r*r);
   }
}
// 主程式類別
public class Ch3_1_2 {
   // 主程式
   public static void main(String[] args) {
      // 宣告Circle類別型態的變數, 並且建立物件
      Circle c = new Circle(5.0, 5.0, 8.0);
      // 呼叫物件的介面方法area()
      c.area();
      // 顯示介面的常數值
      System.out.println("PI常數: "+AreaInterface.PI);
   }
}