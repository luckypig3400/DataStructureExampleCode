/* 程式範例: AdjacencyMatrix.java */ 
class AdjacencyMatrix { // 鄰接矩陣的圖形類別
   final int MAX = 10000;        // 無窮大
   public int[][] graph;         // 圖形陣列宣告
   // 建構子: 使用邊線陣列建立圖形
   public AdjacencyMatrix(int size, int[][] edge) {
      int i, j;      
      int from, to;            // 邊線的起點和終點
      graph = new int[size][]; // 建立二維陣列
      for ( i = 0; i < graph.length; i++ )
         graph[i] = new int[size];
      for ( i = 1; i < size; i++ )
         for ( j = 1; j < size; j++ )
            if ( i != j )
               graph[i][j] = MAX;     // 矩陣設為無窮大
            else
               graph[i][j] = 0;       // 對角線設為0
      for ( i = 0; i < edge.length; i++ ) { // 讀取邊線的迴圈
         from = edge[i][0];           // 邊線的起點
         to = edge[i][1];             // 邊線的終點
         graph[from][to] = edge[i][2];// 存入圖形的權值
      }
   }
   // 方法: 顯示圖形
   public void printGraph() {
      // 使用迴圈顯示圖形
      for ( int i = 1; i < graph.length; i++ ) {
         for ( int j = 1; j < graph[i].length; j++ )
            if ( graph[i][j] == MAX )
               System.out.print(" ∞ ");
            else {  // 調整輸出的字元數
               if ( graph[i][j] < 10 ) System.out.print(" ");
               if ( graph[i][j] < 100 ) System.out.print(" ");
               System.out.print(graph[i][j] + " ");
            } 
            System.out.println();
      }
   }
}