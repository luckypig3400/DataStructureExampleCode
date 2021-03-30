/* 程式範例: Ch4_5.java */
public class Ch4_5 { 
   // 遞迴方法: 河內塔問題
   static void hanoiTower(int dishs, int peg1, 
                          int peg2, int peg3) {
      if ( dishs == 1 )  // 終止條件
         System.out.println("盤子從 "+peg1+"移到 "+peg3);
      else {
         hanoiTower(dishs-1,peg1,peg3,peg2); // 第1步驟
         System.out.println("盤子從 "+peg1+"移到 "+peg3);
         hanoiTower(dishs-1,peg2,peg1,peg3); // 第3步驟
      }     
   }
   // 主程式
   public static void main(String[] args) {   
      // 變數宣告
      int dishs = 3;  // 盤子數
      // 呼叫遞迴方法
      hanoiTower(dishs, 1, 2, 3); 
   }
}