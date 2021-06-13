/* 程式範例: Ch8_2_2.java */ 
import java.io.*;
public class Ch8_2_2 {
   // 方法: 選擇排序法
   static void selectSort(char[] data) {
      int i, j, pos;                  // pos最小字元索引
      int count = data.length;        // 取得陣列尺寸
      char temp;
      for ( i = 0; i < count - 1; i++ ) { // 第一層迴圈
         pos = i;
         temp = data[pos];
         // 找尋最小字元的迴圈
         for ( j = i + 1; j < count; j++ )// 第二層迴圈
            if ( data[j] < temp ) {       // 是否更小
               pos = j;                   // 找到最小字元
               temp = data[j];
            }
         data[pos] = data[i];             // 交換兩個字元
         data[i] = temp;
         // 顯示第一層迴圈執行後交換的字串
         System.out.println(i+1 + ": "+new String(data));
      }
   }
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // 變數宣告
      int len;
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("請輸入排序字串:");
      System.out.flush();           // 清除緩衝區
      str = input.readLine();       // 讀取一列
      input.close();                // 關閉串流
      len = str.length();           // 取得字串長度
      char[] data = new char[len];  // 字元陣列宣告
      data = str.toCharArray();     // 轉換成陣列
      selectSort(data);             // 執行選擇排序法
      // 顯示排序後字串
      System.out.println("排序後字串:"+new String(data));
   }
}