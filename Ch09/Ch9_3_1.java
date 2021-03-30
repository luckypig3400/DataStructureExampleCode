/* 程式範例: Ch9_3_1.java */ 
import java.io.*;
public class Ch9_3_1 {
   // 方法: 二元搜尋法
   static boolean binary(int[] data,int l,int h,int k) {
      int m;                     // 宣告中間元素索引
      if ( l > h )               // 遞迴的終止條件
         return false;           // 沒有找到
      else {
         m = (l + h) / 2;        // 計算中間索引值
         if ( k == data[m] ) return true;    // 找到
         else if ( k < data[m] )// 前半部分
                 return binary(data, l, m-1, k);
              else              // 後半部分
                 return binary(data, m+1, h, k);
      }
   }
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int[] data =              // 搜尋的陣列
            {1, 8, 9, 15, 25, 33, 42, 66, 74, 81, 90};
      int key = 0;              // 搜尋鍵值
      int len = data.length;    // 取得陣列尺寸
      System.out.print("原始陣列: ");
      for ( int i = 0; i < len; i++ )
         System.out.print("["+data[i]+"]");// 顯示陣列
      System.out.println();
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("請輸入搜尋值(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // 呼叫二元搜尋法的搜尋方法
            if ( binary(data, 0, len, key) )
               System.out.println("搜尋到鍵值:" + key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}