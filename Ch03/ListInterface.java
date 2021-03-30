/* 程式範例: ListInterface.java */ 
// ListInterface介面宣告
public interface ListInterface {   
   // 介面方法: 取得串列長度
   int length();
   // 介面方法: 取得線性串列的第i個元素
   Node getNode(int i);
   // 介面方法: 搜尋節點資料
   Node searchNode(int d);
   // 介面方法: 插入節點
   void insertNode(Node ptr, int d);
   // 介面方法: 刪除節點
   int deleteNode(Node ptr);
}