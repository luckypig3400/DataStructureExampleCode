/* 程式範例: Ch8_4_2.java */ 
import java.io.*;
class BSTree_Sort extends BSTree {     // 繼承BSTree類別
   // 建構子
   public BSTree_Sort(char[] data) {
      super(data);
   }
   // 方法: 二元搜尋樹排序法
   public void BSTreeSort() {
      inOrder(head);     // 呼叫中序走訪方法
   }
}
public class Ch8_4_2 {
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
      // 建立二元搜尋樹
      BSTree_Sort bst = new BSTree_Sort(data);
      bst.BSTreeSort();           // 執行二元搜尋樹排序法
   }
}