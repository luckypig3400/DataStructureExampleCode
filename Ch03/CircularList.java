/* 程式範例: CircularList.java */ 
// 環狀鏈結串列類別, 繼承抽象類別List, 實作ListInterface
public class CircularList extends List
                          implements ListInterface {
   // 建構子: 建立環狀鏈結串列
   public CircularList(int[] array) {
      Node last = first;   // 最後一個節點的指標
      Node newnode;
      for ( int i = 0; i < array.length; i++ ) {
         // 建立節點物件
         newnode = new Node(array[i]);
         if ( i==0 ) last = newnode; // 指向最後一個節點
         newnode.next = first;
         first = newnode;
      }
      last.next = first;   // 連結第1個節點, 建立環狀串列
   }
   // 方法: 檢查串列是否是空的
   public boolean isListEmpty() {
      if ( first == null ) return true;
      else                 return false;
   }
   // 方法: 顯示串列資料
   public void printList() {
      Node current = first;  // 目前的串列指標
      do {  // 顯示主迴圈
         System.out.print("[" + current.data + "]");
         current = current.next;  // 下一個節點
      } while ( current != first );
      System.out.println();
   }
   // 方法: 取得串列長度
   public int length() {
      Node current = first;  // 目前的串列指標
      int count = 0;
      if ( !isListEmpty() )
         do {  // 計數主迴圈
            count++;
            current = current.next;  // 下一個節點
         } while ( current != first );
      return count;
   }
   // 方法: 取得線性串列的第i個元素
   public Node getNode(int i) {
      Node current = first;  // 目前的串列指標
      int count = 1;         // 參數從1開始
      while ( count < i ) {
         current = current.next;  // 下一個節點
         count++;            // 計數加1
      }
      return current;
   }
   // 方法: 搜尋節點資料
   public Node searchNode(int d) {
      Node current = first;       // 目前的串列指標
      do {  // 搜尋主迴圈
         if ( current.data == d ) // 是否找到資料
            return current;       // 找到
         current = current.next;  // 下一個節點
      } while (current != first && first != first.next);
      return null;                // 沒有找到
   }
   // 方法: 插入節點
   public void insertNode(Node ptr, int d) {
      Node previous, newnode;
      // 建立節點物件
      newnode = new Node(d);
      if ( isListEmpty() ) {       // 串列是空的
          first = newnode;         // 第一個節點
          first.next = newnode;    // 下一個指向自己
      }
      if ( ptr == null ) {
         // 情況1: 插入第一個節點且成為串列開始
         newnode.next = first;     // 新節點成為串列開始
         previous = first;
         // 找出最後一個節點
         while ( previous.next != first )
            previous=previous.next;// 下一個節點
         previous.next = newnode;  // 指向新的第一個節點
         first = newnode;          // 新的串列開始
      }
      else {
         // 情況2: 插在節點之後
         newnode.next = ptr.next;  // 新節點指向下一節點
         ptr.next = newnode;       // 節點ptr指向新節點
      }
   }
   // 方法: 刪除節點
   public int deleteNode(Node ptr) {
      Node previous;               // 前一節點指標
      int value = ptr.data;        // 節點值
      if ( isListEmpty() ) return -1;// 串列是空的
      previous = first;
      if ( first != first.next )     // 串列超過一個節點
         while ( previous.next != ptr ) // 找ptr前一個節點
           previous = previous.next; // 下一個節點
      if ( ptr == first ) {          // 如果是第一節點
         // 情況1: 刪除第1個節點
         first = first.next;         // 下一個節點
         previous.next = ptr.next;   // 前節點指向下一節點
      }
      else
         // 情況2: 刪除中間節點
         previous.next = ptr.next;   // 前節點指向下一節點
      return value;                  // 傳回刪除的節點值
   }
}