/* 程式範例: Ch8_2_3.java */ 
import java.io.*;
public class Ch8_2_3 {
   // 方法: 插入排序法
   static void insertSort(char[] data) {
      int i,j;                        // 宣告變數
      int count = data.length;        // 取得陣列尺寸
      char temp;
      for ( i = 1; i < count; i++ ) { // 第一層迴圈
         temp = data[i];              // 建立初值
         j = i - 1;                   // 開始索引
         // 空出一個插入位置
         while ( j >= 0 && temp < data[j] ) {
            data[j+1] = data[j];
            j--;
         }
         data[j+1] = temp;            // 插入字元
         // 顯示第一層迴圈執行後交換的字串
         System.out.println(i + ": " + new String(data));
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
      insertSort(data);             // 執行插入排序法
      // 顯示排序後字串
      System.out.println("排序後字串:"+new String(data));
   }
}