/* 程式範例: Ch9_3_2.java */ 
import java.io.*;
public class Ch9_3_2 {
   // 方法: 插補搜尋法的遞迴方法
   static boolean interSearch(int[] data, int key,
                              int left, int right) {
      int nextGuess;          // 下一個可能索引
      int offset;             // 索引位移
      int range;              // 鍵值範圍
      int index_range;        // 索引範圍
      int temp;
      if ( data[left] == key )// 找到了
         return true;
      else if ( left == right ||    // 沒有找到
                data[left] == data[right] )
              return false;
      else {
         index_range = right - left;// 計算索引範圍
         // 計算鍵值範圍
         range = data[right] - data[left];
         offset = key - data[left]; // 計算鍵值位移
         temp = ( offset * index_range ) / range;
         nextGuess = left + temp;   // 下一個可能索引
         if ( nextGuess == left )   // 檢查是否己試過
            nextGuess++;
         if ( key < data[nextGuess] )// 左邊部分遞迴呼叫
           return interSearch(data,key,left,nextGuess-1);
         else // 右邊部分遞迴呼叫
           return interSearch(data,key,nextGuess,right);
      }
   }
   // 方法: 插補搜尋法
   static boolean interpolation(int[] data,int n,int k) {
      if ( k < data[0] || k > data[n-1] )
         return false;              // 沒有找到
      else   // 呼叫遞迴方法
         return interSearch(data, k, 0, n-1);
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
            // 呼叫插補搜尋法的搜尋方法
            if ( interpolation(data, len, key) )
               System.out.println("搜尋到鍵值:" + key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}