/* 程式範例: Ch1_6_2.java */
import java.io.*;
public class Ch1_6_2 {
   // 方法: 顯示費氏數列
   static void fibonacci(int n) {
      int fn;                        // F(n)變數
      int fn2;                       // F(n-2)變數
      int fn1;                       // F(n-1)變數
      int i;
      if ( n <= 1 )                  // 項數是否小於1
         System.out.println("["+n+"]"); // 顯示費氏數列
      else {
         fn2 = 0;                    // 設定 F(n-2)
         fn1 = 1;                    // 設定 F(n-1)
         System.out.print("[0][1]"); // 顯示前二項
         for ( i = 2; i <= n; i++ ) {// 顯示數列的迴圈
            fn = fn2 + fn1;          // 計算各一般項
            System.out.print("["+fn+"]");  // 顯示數列
            fn2 = fn1;               // 重設 F(n-2)
            fn1 = fn;                // 重設 F(n-1)
         }
         System.out.println();
      }
   }
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 變數宣告
      int n = 0;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while( n != -1 ) {
         System.out.print("請輸入數列項數(-1結束)==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         n = Integer.parseInt(in.readLine());
         if ( n > 0 ) {
            // 呼叫方法
            fibonacci(n);        // 呼叫費氏數列方法
         }
      }
      in.close();                // 關閉串流
   }
}