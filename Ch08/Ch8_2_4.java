/* 程式範例: Ch8_2_4.java */ 
import java.io.*;
public class Ch8_2_4 {
   static final int H_LEN = 3;       // h佇列的最大數
   // 方法: 謝耳排序法
   static void shellSort(char[] data) {
      int[] incs = { 4, 2, 1 };      // 設定h序列的增量
      int pos;                       // 處理的目前索引
      int h;                         // h序列的位移量
      int count = data.length;       // 取得陣列尺寸
      int i, j;
      char temp;
      for ( i = 0; i < H_LEN ; i++ ) {// 處理h序列的迴圈
         h = incs[i];                 // 取得h位移量
         for ( j = h; j < count; j++ ) { // 交換迴圈
            temp = data[j];          // 保留值
            pos = j - h;             // 計算索引
            while ( pos >= 0  &&     // 比較
                    temp < data[pos] && j <= count) {
               data[pos + h] = data[pos];  // 交換
               pos = pos - h;        // 下一個處理索引
            }
            data[pos + h] = temp;    // 與最後元素交換
         }
         // 顯示處理後的字串
         System.out.print("h序列" + h);
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
      shellSort(data);              // 執行謝耳排序法
      // 顯示排序後字串
      System.out.println("排序後字串:"+new String(data));
   }
}