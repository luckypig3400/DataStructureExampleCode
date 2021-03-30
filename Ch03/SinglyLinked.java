/* 程式範例: SinglyLinked.java */
// 單向鏈結串列類別
public class SinglyLinked extends List { 
   // 建構子: 建立單向鏈結串列
   public SinglyLinked(int[] array) {
      Node newnode;
      first = null;         // 初始開頭指標
      for ( int i = 0; i < array.length; i++ ) {
         // 建立節點物件
         newnode = new Node(array[i]);// 建立節點
         newnode.next = first;     // 新節點為第一個節點
         first = newnode;          // 重設開頭指標
      }
   }
   // 方法: 檢查串列是否是空的
   public boolean isListEmpty() {
      if ( first == null ) return true;
      else                 return false;
   }
   // 方法: 顯示串列資料
   public void printList() {
      Node current = first;       // 目前的串列指標
      while ( current != null ) { // 顯示主迴圈
         System.out.print("[" + current.data + "]");
         current = current.next;  // 下一個節點
      }
      System.out.println();
   }
   // 方法: 搜尋節點資料
   public Node searchNode(int d) {
      Node current = first;       // 目前的串列指標
      while ( current != null ) { // 搜尋主迴圈
         if ( current.data == d ) // 是否找到資料
            return current;       // 找到
         current = current.next;  // 下一個節點
      }
      return null;                // 沒有找到
   }
}