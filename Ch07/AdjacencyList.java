/* 程式範例: AdjacencyList.java */
public class AdjacencyList { // 鄰接串列類別
   public Vertex_List[] head;    // 圖形頂點的物件陣列
   // 建構子: 使用邊線陣列建立圖形
   public AdjacencyList(int size, int[][] edge) {
      int i, from, to;         // 邊線的起點和終點
      Vertex_List newnode, ptr;
      head = new Vertex_List[size]; // 建立物件陣列
      for ( i = 0; i < head.length; i++ )
         head[i] = new Vertex_List(0, 0); 
      for ( i = 0; i < edge.length; i++ ) { // 讀取邊線的迴圈
         from = edge[i][0];      // 邊線的起點
         to = edge[i][1];        // 邊線的終點
         head[to].data += 1;     // 內分支度加一
         // 建立頂點物件
         newnode = new Vertex_List(to, edge[i][2]);
         ptr = head[from];       // 指標陣列的頂點指標
         while ( ptr.next != null ) // 走訪至串列尾
            ptr = ptr.next;         // 下一個頂點
         ptr.next = newnode;        // 插入結尾
      }
   }
   // 方法: 顯示圖形
   public void printGraph() {
      Vertex_List ptr;
      // 使用迴圈顯示圖形
      for ( int i = 1; i < head.length; i++ ) {
         ptr = head[i].next;     // 頂點指標
         if ( ptr != null ) {    // 有使用的節點
            System.out.print("頂點V" + i + "(" + head[i].data + ") =>");// 頂點值, 內分支度
            while ( ptr != null ) {  // 走訪顯示
               System.out.print("V" + ptr.data + 
                                "(" + ptr.weight + ") ");  // 頂點內容
               ptr = ptr.next;       // 下一個頂點
            }
            System.out.println();
         }   
      }
   }
}