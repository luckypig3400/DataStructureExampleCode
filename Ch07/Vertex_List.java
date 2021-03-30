/* 程式範例: Vertex_List.java */
public class Vertex_List {     // 圖形頂點類別
   int data;       // 頂點資料
   int weight;                  /* 權值 */ 
   Vertex_List next;    // 指下一個頂點的指標
   // 建構子
   public Vertex_List(int data, int weight) {
      this.data = data;
      this.weight = weight;
      next = null;
   }
};