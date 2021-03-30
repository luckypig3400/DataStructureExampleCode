/* 程式範例: Ch1_5_2.java */
import java.io.*;
public class Ch1_5_2 {
   // 方法: 計算n!的值
   static long factorial(int n) {
      if ( n == 1 )   // 終止條件
         return 1;
      else  
         return n * factorial(n-1);
   }
   // 主程式
   public static void main(String[] args) 
                                    throws Exception {
      // 變數宣告
      int no = 0;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while( no != -1 ) {
         System.out.print("請輸入階層數(-1結束)==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         no = Integer.parseInt(in.readLine());
         if ( no > 0 ) {
            // 函數的呼叫
            System.out.print(no+"!函數值: ");
            System.out.println(factorial(no));
         }
      }
      in.close();                // 關閉串流
   }
}