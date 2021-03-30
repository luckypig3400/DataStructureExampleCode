/* 程式範例: Stack.java */ 
public class Stack implements StackInterface{ // 堆疊類別
   private Node top;           // 堆疊頂端
   // 建構子: 建立堆疊
   public Stack() { top = null; }
   // 方法: 檢查堆疊是否是空的
   public boolean isStackEmpty() {
      if ( top == null ) return true;
      else               return false;
   }
   // 方法: 將資料存入堆疊
   public boolean push(int d) {
      Node new_node;           // 新節點指標
      // 建立節點物件
      new_node = new Node(d);
      new_node.next = top;     // 新節點指向原開始
      top = new_node;          // 新節點成為堆疊開始
      return true;             // 成功將節點存入堆疊
   }
   // 方法: 從堆疊取出資料
   public int pop() {
      Node ptr;                // 指向堆疊頂端
      if ( !isStackEmpty() ) { // 堆疊是否是空的
         ptr = top;            // 指向堆疊頂端
         top = top.next;       // 堆疊指標指向下節點
         return ptr.data;      // 取出資料
      }
      else return -1;
   }
}