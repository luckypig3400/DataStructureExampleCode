/* 程式範例: Ch3_3_3.java */ 
import java.io.*;
// 單向鏈結串列類別
class SinglyLinked_Insert extends SinglyLinked {
   // 建構子: 建立單向串列
   public SinglyLinked_Insert(int[] data) {super(data);}
   // 方法: 插入節點
   public void insertNode(Node ptr, int d) {
      Node newnode;
      // 建立節點物件
      newnode = new Node(d);
      if ( ptr == null ) {
         // 情況1: 插入第一個節點
         newnode.next = first;   // 新節點成為串列開始
         first = newnode;
      }
      else {
         if ( ptr.next == null ) { // 串列最後一個節點
           // 情況2: 插入最後一個節點
           ptr.next = newnode;     // 最後指向新節點
           newnode.next = null;    // 新節點指向null
         }
         else {
           // 情況3: 插入成為中間節點
           newnode.next = ptr.next;// 新節點指向下一節點
           ptr.next = newnode;     // 節點ptr指向新節點
         }
      }
   }
}
// 主類別
public class Ch3_3_3 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp = 0;  // 宣告變數
      int[] dt = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      SinglyLinked_Insert s=new SinglyLinked_Insert(dt);
      System.out.print("原來的串列: ");
      s.printList();  // 顯示串列
      // 節點插入
      s.insertNode(null, 50); // 插入第一個節點
      System.out.print("插入後串列: ");
      s.printList();          // 顯示插入後串列
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("輸入插入編號(-1結束)==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = s.searchNode(temp); // 找尋節點
            if ( ptr != null ) {
               System.out.print("輸入新編號(0~100)==> ");
               System.out.flush();         // 清除緩衝區
               // 讀取新的郵寄編號
               temp = Integer.parseInt(input.readLine());
               s.insertNode(ptr, temp);
               System.out.print("插入後串列: ");
               s.printList();          // 顯示插入後串列
            }
         }
      }
      input.close();                // 關閉串流
   }
}