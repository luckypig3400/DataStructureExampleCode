/* 程式範例: Vertex.java */
public class Vertex {     // 圖形頂點類別 
   int data;       // 頂點資料
   Vertex next;    // 指下一個頂點的指標
   // 建構子
   public Vertex(int data) {
      this.data = data;
      next = null;
   }
};