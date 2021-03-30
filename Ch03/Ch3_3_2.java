/* 程式範例: Ch3_3_2.java */
import java.io.*;
// 單向鏈結串列類別 
class SinglyLinked_Delete extends SinglyLinked {
   // 建構子: 建立單向串列
   public SinglyLinked_Delete(int[] data) {super(data);}
   // 方法: 刪除節點
   public int deleteNode(Node ptr) {
      Node current = first;   // 指向前一節點
      int value = ptr.data;   // 取得刪除的節點值
      if ( isListEmpty() ) return -1;// 檢查串列是否空的
      if (ptr==first || ptr==null) { // 串列開始或null
         // 情況1: 刪除第一個節點
         first = first.next;         // 刪除第1個節點
      } else {
         while (current.next!=ptr)   // 找節點ptr的前節點
            current = current.next;
         if ( ptr.next == null )     // 是否是串列結束
            // 情況2: 刪除最後一個節點
            current.next = null;     // 刪除最後一個節點
         else // 情況3: 刪除中間節點
            current.next = ptr.next; // 刪除中間節點
      }
      return value;                  // 傳回刪除的節點值
   }
}
// 主類別
public class Ch3_3_2 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp;  // 宣告變數
      int[] dt = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      // 刪除節點
      SinglyLinked_Delete s=new SinglyLinked_Delete(dt);
      System.out.print("原來的串列: ");
      s.printList();  // 顯示串列
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("輸入刪除的編號(-1結束)==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = s.searchNode(temp);  // 找尋節點
            if ( ptr != null ) {
               temp = s.deleteNode(ptr); // 刪除節點
               System.out.println("刪除節點: " + temp);
               System.out.print("刪除後串列: ");
               s.printList();          // 顯示刪除後串列
            }
         }
      }
      input.close();                // 關閉串流
   }
}