/* 程式範例: Ch9_2.java */
import java.io.*; 
public class Ch9_2 {
   // 方法: 循序搜尋法
   static boolean sequential(int[] data,int len,int k) {
      for ( int i = 0; i < len; i++ ) // 搜尋迴圈
         // 比較是否是鍵值
         if ( data[i] == k ) return true;
      return false;
   }
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int[] data =              // 搜尋的陣列
         {9, 25, 33, 74, 90, 15, 1, 8, 42, 66, 81};
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
            // 呼叫循序搜尋法的搜尋方法
            if ( sequential(data, len, key) )
               System.out.println("搜尋到鍵值:" + key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}