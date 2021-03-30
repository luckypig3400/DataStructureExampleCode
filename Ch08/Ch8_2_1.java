/* 程式範例: Ch8_2_1.java */ 
import java.io.*;
public class Ch8_2_1 {
   // 方法: 泡沫排序法
   static void bubbleSort(char[] data) {
      int i,j;                        // 變數宣告
      int count = data.length;        // 取得陣列尺寸
      char temp;
      for ( j = count; j > 1; j-- ) { // 第一層迴圈
         for ( i = 0; i < j - 1; i++ )// 第二層迴圈
            // 比較相鄰的陣列元素
            if ( data[i+1] < data[i] ) {
               temp = data[i+1];      // 交換陣列元素
               data[i+1] = data[i];
               data[i] = temp;
            }
         // 顯示第一層迴圈執行後交換的字串
         System.out.print(count-j+1);
         System.out.println(": " + new String(data));
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
      bubbleSort(data);             // 執行泡沫排序法
      // 顯示排序後字串
      System.out.println("排序後字串:"+new String(data));
   }
}