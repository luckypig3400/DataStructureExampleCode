/* 程式範例: StackInterface.java */ 
// StackInterface介面宣告
public interface StackInterface {   
   // 介面方法: 檢查堆疊是否是空的
   boolean isStackEmpty();
   // 介面方法: 將資料存入堆疊
   boolean push(int d);
   // 介面方法: 從堆疊取出資料
   int pop();
}