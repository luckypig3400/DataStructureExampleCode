/* 程式範例: Ch5_5.java */ 
class PriorityQueue {           // 優先佇列類別
   private Comparable[] queue;  // 優先佇列的陣列宣告
   private int pos;             // 目前存入的陣列索引值
   // 建構子: 建立優先佇列
   public PriorityQueue(int size) {
      queue = new Comparable[size]; // 建立陣列
      pos = 0;                      // 初始索引值
   }
   // 方法: 檢查優先佇列是否是空的
   public boolean isPriorityQueueEmpty() {
      return pos == 0;    // 是否是空的
   }
   // 方法: 將元素存入優先佇列
   public boolean enqueue(Comparable item) {
      if ( pos == queue.length )    // 檢查是否已滿
         return false;              // 已滿, 無法存入
      else
         queue[pos++] = item;       // 存入佇列
      return true;
   }
   // 方法: 從優先佇列取出元素
   public Comparable dequeue() {
      int maxPriority = 0;          // 最高優先權的索引值
      Comparable item;
      if ( isPriorityQueueEmpty() ) // 檢查佇列是否是空
         return null;               // 無法取出
      // 找出最高優先權的佇列元素
      for (int i = 1 ; i < pos; i++) {
         // 找出最大的索引值, 最高優先權
         if (queue[i].compareTo(queue[maxPriority]) > 0)
             maxPriority = i;   // 比較下一個索引
      }
      item = queue[maxPriority];// 取出最高優先權的元素
      // 搬移列空的陣列元素
      pos--;                    // 刪除一個元素
      queue[maxPriority] = queue[pos]; // 取代取出元素
      return item;
   }
}
// 主類別
public class Ch5_5 {
   // 主程式
   public static void main(String[] args) {
      int[] data = {3, 2, 1, 6, 5, 4};    // 宣告陣列
      // 建立優先佇列物件
      PriorityQueue pq = new PriorityQueue(10);
      System.out.print("存入佇列資料的順序: ");
      // 使用迴圈將資料存入佇列
      for ( int i = 0; i < 6; i++) {
         pq.enqueue(new Integer(data[i]));// 存入佇列
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n取出佇列資料的順序: ");
      while ( !pq.isPriorityQueueEmpty() )// 取出佇列資料
         System.out.print("["+(Integer)pq.dequeue()+"]");
      System.out.println();
   }
}