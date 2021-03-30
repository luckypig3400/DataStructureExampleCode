/* 程式範例: QueueInterface.java */ 
// QueueInterface介面宣告
public interface QueueInterface {
   // 介面方法: 檢查佇列是否是空的
   boolean isQueueEmpty();
   // 介面方法: 將資料存入佇列
   boolean enqueue(int d);
   // 介面方法: 從佇列取出資料
   int dequeue();
}