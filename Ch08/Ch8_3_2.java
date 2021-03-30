/* 程式範例: Ch8_3_2.java */ 
import java.io.*;
public class Ch8_3_2 {
   // 遞迴方法: 快速排序法的遞迴函數
   static void q_sort(char[] data, int left, int right) {
      char partition;             // 分割的字元
      char temp;
      int i, j, k;
      if ( left < right ) {// 遞迴中止條件, 是否繼續分割
         i = left;                // 分割的最左索引
         j = right + 1;           // 分割的最右索引
         partition = data[left];  // 取第一個元素
         do { // 主迴圈分別從兩個方向找尋交換元素
            do {                  // 從左往右找
               i++;
            } while( i <= right && data[i] < partition );
            do {                  // 從右往左找
               j--;
            } while( j >= 0 && data[j] > partition );
            if ( i < j ) {
               temp = data[i];    // 交換資料
               data[i] = data[j];
               data[j] = temp;
            }
         } while( i < j );
         temp = data[left];       // 交換資料
         data[left] = data[j];
         data[j] = temp;
         // 顯示處理中的字串
         System.out.print("輸出結果: ");
         for ( k = left; k <= right; k++)
            System.out.print(data[k]);
         System.out.println();    // 換行
         q_sort(data, left, j-1); // 快速排序遞迴呼叫
         q_sort(data, j+1, right);// 快速排序遞迴呼叫
      }
   }
   // 方法: 快速排序法
   static void quickSort(char[] data) {
      q_sort(data, 0, data.length-1);
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
      quickSort(data);              // 執行快速排序法
      // 顯示排序後字串
      System.out.println("排序後字串:"+new String(data));
   }
}