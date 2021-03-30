/* 程式範例: Ch5_2_1.java */ 
class Queue_Array implements QueueInterface{ // 佇列類別
   private int[] queue;        // 佇列陣列宣告
   private int front;          // 佇列的前端
   private int rear;           // 佇列的尾端
   // 建構子: 建立佇列
   public Queue_Array(int size) {
      queue = new int[size];   // 建立陣列
      front = -1;
      rear = -1;
   }
   // 方法: 檢查佇列是否是空的
   public boolean isQueueEmpty() {
      if ( front == rear ) return true;
      else                 return false;
   }
   // 方法: 將資料存入佇列
   public boolean enqueue(int d) {
      if ( rear >= queue.length )  // 是否超過佇列容量
         return false;
      else {
         queue[++rear] = d;    // 存入佇列
         return true;
      }
   }
   // 方法: 從佇列取出資料
   public int dequeue() {
      if ( isQueueEmpty() )    // 佇列是否是空的
         return -1;
      else
         return queue[++front];// 取出資料
   }
}
// 主類別
public class Ch5_2_1 {
   // 主程式
   public static void main(String[] args) {
      int[] data = {1, 2, 3, 4, 5, 6};    // 宣告陣列
      Queue_Array q = new Queue_Array(10);// 建立佇列物件
      int i;
      System.out.print("存入佇列資料的順序: ");
      // 使用迴圈將資料存入佇列
      for ( i = 0; i < 6; i++) {
         q.enqueue(data[i]);
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n取出佇列資料的順序: ");
      while ( !q.isQueueEmpty() )   // 取出佇列資料
         System.out.print("[" + q.dequeue() + "]");
      System.out.println();
   }
}