/* 程式範例: DList.java */ 
public abstract class DList {  // 雙向串列抽象類別
   public DNode first;         // 雙向串列的開頭指標
   public DNode now;           // 雙向串列目前節點指標
   // 抽象方法: 顯示雙向串列的節點資料
   abstract void printDList();
   // 抽象方法: 移動節點指標到下一個節點
   abstract void nextNode();
   // 抽象方法: 移動節點指標到上一個節點
   abstract void previousNode();
   // 抽象方法: 重設節點指標
   abstract void resetNode();
   // 抽象方法: 取得節點指標
   abstract DNode readNode();
}