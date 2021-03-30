/* 程式範例: Ch3_5_2.java */ 
import java.io.*;
// 雙向鏈結串列類別
class DoublyLinked_Insert extends DoublyLinked {
   // 建構子: 建立雙向串列
   public DoublyLinked_Insert(int[] data) {super(data);}
   // 方法: 插入節點
   public void insertDNode(DNode ptr, int d) {
      DNode newnode = new DNode(d);// 建立節點物件
      if ( first == null )         // 如果串列是空的
         first = newnode;          // 傳回新節點指標
      if ( ptr == null ) {
         // 情況1: 插在第一個節點之前, 成為串列開始
         newnode.previous = null;  // 前指標為null
         newnode.next = first;     // 新節點指向串列開始
         first.previous = newnode; // 原節點指向新節點
         first = newnode;          // 新節點成為串列開始
      }
      else {
         if ( ptr.next == null ) { // 是否是最後一個節點
            // 情況2: 插在串列的最後
            ptr.next = newnode;    // 最後節點指向新節點
            newnode.previous = ptr;// 新節點指回最後節點
            newnode.next = null;   // 後回指標為null
         }
         else {
            // 情況3: 插入節點至串列的中間節點
            ptr.next.previous = newnode; // 指回新節點
            newnode.next = ptr.next;     // 指向下一節點
            newnode.previous = ptr; // 新節點指回插入節點
            ptr.next = newnode;     // 插入節點指向新節點
         }
      }
   }
}
// 主類別
public class Ch3_5_2 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp = 0;  // 宣告變數
      int[] d = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      DoublyLinked_Insert dl=new DoublyLinked_Insert(d);
      System.out.print("原來的串列: ");
      dl.printDList();  // 顯示串列
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      // 節點插入
      dl.insertDNode(null, 50); // 插入第一個節點
      while ( temp != 4 ) {
         System.out.print("插入後串列: ");
         dl.printDList();          // 顯示插入後串列
         System.out.print("[1]往下移動 [2]往前移動 ");
         System.out.print("[3]新增節點 [4]離開 ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         switch ( temp ) {
            case 1: dl.nextNode();     // 往下移動
               break;
            case 2: dl.previousNode(); // 往前移動
               break;
            case 3: // 新增節點
               System.out.print("輸入新號碼(7~100)==> ");
               System.out.flush();     // 清除緩衝區
               temp = Integer.parseInt(input.readLine());
               dl.insertDNode(dl.readNode(), temp);
               dl.resetNode();         // 重設目前指標
               break;
         }
      }
      input.close();                   // 關閉串流
   }
}