/* 程式範例: CircularQueue.java */ 
public class CircularQueue { // 環狀佇列類別
   public int[] queue;       // 環狀佇列陣列宣告
   public int front;         // 環狀佇列的前端
   public int rear;          // 環狀佇列的尾端
   // 建構子: 建立環狀佇列
   public CircularQueue(int size) { 
      queue = new int[size]; // 建立陣列
      front = -1;
      rear = -1;
   }
   // 方法: 檢查環狀佇列是否是空的
   public boolean isCQueueEmpty() {
      if ( front == rear ) return true;
      else                 return false;
   }
   // 方法: 檢查環狀佇列是否已滿
   public boolean isCQueueFull() {
      int pos;
      pos = (rear+1) % queue.length;
      if ( front == pos ) return true;
      else                return false;
   }
   // 方法: 將資料存入環狀佇列
   public boolean enqueue(int d) {
      if ( isCQueueFull() )      // 檢查是否已滿
         return false;           // 已滿, 無法存入
      else {               // 是否超過,重新定位
         rear = (rear+1) % queue.length;
         queue[rear] = d;
      }   
      return true;
   }
   // 方法: 從環狀佇列取出資料
   public int dequeue() {
      if ( isCQueueEmpty() )     // 檢查佇列是否是空
         return -1;              // 無法取出
      front = (front+1) % queue.length; // 重新定位
      return queue[front];          // 傳回佇列取出元素
   }
}