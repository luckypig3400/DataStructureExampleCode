/* 程式範例: Ch7_4_3.java */ 
class Edge {                // 圖形邊線類別
   int from;                // 開始頂點
   int to;                  // 終點頂點
   int weight;              // 權值
   Edge next;               // 指下一條邊線
   // 建構子
   public Edge(int from, int to, int weight) {
      this.from = from;       this.to = to;
      this.weight = weight;   next = null;
   }
};
class EdgeList { // 邊線串列類別
   public int[] vertex;     // 檢查迴圈的頂點陣列
   private Edge first;      // 邊線串列開始指標
   // 建構子: 建立圖形的邊線串列
   public EdgeList(int size, int[][] edge) {
      Edge newnode;           // 新邊線節點指標
      Edge last = null;       // 最後邊線節點指標
      vertex = new int[size]; // 建立陣列且初始頂點陣列
      for ( int i = 0; i < size; i++) vertex[i] = -1;
      // 建立邊線串列主迴圈
      for ( int i = 0; i < edge.length; i++) {
         newnode = new Edge(edge[i][0],  // 建立邊線物件
                   edge[i][1],edge[i][2]);
         if ( first == null ) {  // 串列的第一個節點
           first = newnode;      // 建立串列開始指標
           last = first;         // 保留最後節點指標
         } else {
           last.next = newnode;  // 鏈結至最後節點
           last = newnode;       // 保留最後節點指標
         }
      }
   }
   // 方法: 新增到同一個集合
   private void addSet(int from, int to) {
      int to_root = to;             // 從終點頂點找
      while ( vertex[to_root] > 0 )
         to_root = vertex[to_root];
      vertex[to_root] = from;       // 結合兩個頂點
   }
   // 方法: 兩個頂點是否是同一個集合, 擁有同一個根頂點
   private boolean isSameSet(int from, int to) {
      int from_root = from;          // 從開始頂點找
      int to_root = to;              // 從終點頂點找
      while ( vertex[from_root] > 0 )// 找尋根頂點
         from_root = vertex[from_root];
      while ( vertex[to_root] > 0 )  // 找尋根頂點
         to_root = vertex[to_root];
      if ( from_root == to_root )   // 是否是同一根頂點
            return true;            // 同一集合
      else  return false;           // 不同集合
   }
   // 方法: 最低成本擴張樹
   public void minSpanTree() {
      Edge ptr = first;             // 指向串列的開始
      int i, total = 0;
      while ( ptr != null ) {
         // 是否是同一個集合, 相同會產生迴圈
         if ( !isSameSet(ptr.from,ptr.to) ) {
            // 加入最低成本擴張樹的邊線
            System.out.println("頂點 V"+ptr.from +
                   " -> V"+ptr.to+"成本: "+ptr.weight);
            total += ptr.weight;          // 計算成本
            addSet(ptr.from,ptr.to);      // 新增至集合
         }
         ptr = ptr.next;             // 下一條邊線
      }
      System.out.println("最低成本擴張樹的成本: "+total);
   }
}
// 主類別
public class Ch7_4_3 {
   // 主程式
   public static void main(String[] args) {
      int edge[][] = { { 1, 2, 2 }, // 成本邊線陣列
                       { 2, 4, 3 },
                       { 1, 4, 4 },
                       { 3, 5, 5 },
                       { 2, 5, 6 },
                       { 2, 3, 8 },
                       { 3, 4, 10 },
                       { 4, 5, 15 } };
      EdgeList el= new EdgeList(6, edge);// 建立邊線串列
      System.out.println("圖形的最低成本擴張樹:");
      el.minSpanTree();            // 建立最小成本擴張樹
      System.out.print("頂點陣列內容: "); // 顯示頂點陣列
      for ( int i = 1; i < el.vertex.length; i++ )
         System.out.print("[" + el.vertex[i] + "]");
      System.out.println();
   }
}