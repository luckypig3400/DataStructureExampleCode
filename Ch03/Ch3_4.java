/* 程式範例: Ch3_4.java */
import java.io.*;
public class Ch3_4 { 
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp;  // 宣告變數
      int[] data = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      // 建立, 走訪與搜尋串列
      CircularList cl = new CircularList(data); // 建立串列
      System.out.print("原來的串列: ");
      cl.printList();  // 顯示串列
      System.out.println("串列是否空的: " + cl.isListEmpty());
      System.out.println("串列長度: " + cl.length());
      System.out.println("第3個節點資料: " + cl.getNode(3).data);
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("請輸入搜尋的郵寄編號(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 )    // 搜尋節點資料
            if ( cl.searchNode(temp) != null )
               System.out.println("串列包含節點[" + temp + "]");
            else
               System.out.println("串列不含節點[" + temp + "]");
      }
      // 節點插入
      cl.insertNode(null, 50); // 插入第一個節點
      System.out.print("插入後串列: ");
      cl.printList();          // 顯示插入後串列
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("請輸入插入其後的郵寄編號(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = cl.searchNode(temp);  // 找尋節點
            if ( ptr != null ) {
               System.out.print("請輸入新的郵寄編號(0~100) ==> ");
               System.out.flush();           // 清除緩衝區
               temp = Integer.parseInt(input.readLine()); // 讀取新的郵寄編號
               cl.insertNode(ptr, temp);
               System.out.print("插入後串列: ");
               cl.printList();          // 顯示刪除後串列
            }
         }
      }
      // 刪除節點
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("請輸入刪除的郵寄編號(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = cl.searchNode(temp);  // 找尋節點
            if ( ptr != null ) {
               temp = cl.deleteNode(ptr); // 刪除節點
               System.out.println("刪除節點: " + temp);
               System.out.print("刪除後串列: ");
               cl.printList();          // 顯示刪除後串列
            }
         }
      }
      input.close();                // 關閉串流
   }
}