/* 程式範例: Ch3_3_1.java */
import java.io.*;
public class Ch3_3_1 { 
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp;  // 宣告變數
      int[] data = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      // 建立, 走訪與搜尋串列
      SinglyLinked sl=new SinglyLinked(data);// 建立串列
      System.out.print("原來的串列: ");
      sl.printList();  // 顯示串列
      System.out.println("串列是空的:"+sl.isListEmpty());
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
        System.out.print("輸入搜尋郵寄編號(-1結束)==> ");
        System.out.flush();           // 清除緩衝區
        // 讀取一列, 轉換成整數
        temp = Integer.parseInt(input.readLine());
        if ( temp != -1 )    // 搜尋節點資料
          if ( sl.searchNode(temp) != null )
            System.out.println("串列包含節點["+temp+"]");
          else
            System.out.println("串列不含節點["+temp+"]");
      }
      input.close();                // 關閉串流
   }
}