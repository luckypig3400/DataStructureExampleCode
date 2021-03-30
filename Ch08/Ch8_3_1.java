/* 程式範例: Ch8_3_1.java */ 
import java.io.*;
public class Ch8_3_1 {
   // 方法: 合併陣列
   static void merge(char[] data,
                     int start, int mid, int end) {
      int left = start;            // 左半部的索引
      int right = mid + 1;         // 右半部的索引
      int i;
      // 配置合併區段所需的陣列
      char[] finalData = new char[end-start+1];
      // 合併左右兩半部分區段的迴圈
      for (i = 0; i < (end-start+1); i++) {
         if ( left > mid ) {
            finalData[i] = data[right];
            right++;
         } else if ( right > end ) {
            finalData[i] = data[left];
            left++;
         } else if (data[left] < data[right]) {
            finalData[i] = data[left];
            left++;
         } else {
            finalData[i] = data[right];
            right++;
         }
      }
      // 複製到原始陣列的區段
      for (i = 0; i < (end - start + 1); i++) {
          data[start + i] = finalData[i];
      } // 顯示合併後的字串
      System.out.print(start + "-" + mid + "-" + end);
      System.out.println(":["+new String(finalData)+"]");
   }
   // 遞迴方法: 合併排序法
   static void mergeSort(char[] data,int start,int end) {
      int mid;
      if ( end <= start ) return;    // 終止條件
      mid = (start + end) / 2;       // 中間索引
      mergeSort(data, start, mid);   // 遞迴排序左半邊
      mergeSort(data, mid+1, end);   // 遞迴排序右半邊
      merge(data, start, mid, end);  // 合併陣列
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
      mergeSort(data, 0, len-1);    // 執行合併排序法
      // 顯示排序後字串
      System.out.println("排序後字串:"+new String(data));
   }
}