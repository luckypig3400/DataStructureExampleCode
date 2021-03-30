/* 程式範例: List.java */ 
// 串列的抽象類別
public abstract class List {
   public Node first;  // 串列的開頭指標
   // 抽象方法: 檢查串列是否是空的
   abstract boolean isListEmpty();
   // 抽象方法: 顯示串列資料
   abstract void printList();   
}