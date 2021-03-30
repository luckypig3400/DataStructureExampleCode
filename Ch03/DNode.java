/* 程式範例: DNode.java */ 
public class DNode {      // 雙向串列的節點類別
   int data;       // 節點資料
   DNode next;     // 指下一個節點的指標
   DNode previous; // 指向前一個節點
   // 建構子
   public DNode(int data) {
      this.data = data;
      next = previous = null;
   }
};