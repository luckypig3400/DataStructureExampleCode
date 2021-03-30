/* 程式範例: DoublyLinked.java */
// 雙向鏈結串列類別 
public class DoublyLinked extends DList {
   // 建構子: 建立單向鏈結串列
   public DoublyLinked(int[] array) {
      DNode newnode, before;
      first = new DNode(array[0]); // 建立第1個節點物件
      before = first;              // 指向第一個節點
      now = first;                 // 重設目前節點指標
      for ( int i = 1; i < array.length; i++ ) {
         // 建立節點物件
         newnode = new DNode(array[i]);
         newnode.previous = before;// 將新節點指向前節點
         before.next = newnode;    // 將前節點指向新節點
         before = newnode;         // 新節點成為前節點
      }
   }
   // 方法: 顯示雙向串列的節點資料
   public void printDList() {
      DNode current = first;       // 目前的節點指標
      while ( current != null ) {  // 顯示主迴圈
         if ( current == now )
            System.out.print("#" + current.data + "#");
         else
            System.out.print("[" + current.data + "]");
         current = current.next;   // 下一個節點
      }
      System.out.println();
   }
   // 方法: 移動節點指標到下一個節點
   public void nextNode() {
      if ( now.next != null )
         now = now.next;            // 下一個節點
   }
   // 方法: 移動節點指標到上一個節點
   public void previousNode() {
      if ( now.previous != null )
         now = now.previous;        // 前一個節點
   }
   // 方法: 重設節點指標
   public void resetNode() { now = first; }
   // 方法: 取得節點指標
   public DNode readNode() { return now; }
}