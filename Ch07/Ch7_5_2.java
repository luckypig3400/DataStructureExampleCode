/* 程式範例: Ch7_5_2.java */ 
class Floyd extends AdjacencyMatrix { // Floyd演算法類別
   private int[][] dist;// 路徑長度陣列
   // 建構子: 建立鄰接矩陣圖形
   public Floyd(int size, int[][] edge) {
      super(size, edge);
      dist = new int[size][]; // 建立二維陣列
      for ( int i = 0; i < graph.length; i++ )
         dist[i] = new int[size];
   }
   // 方法: 找尋各頂點到各頂點的最短距離
   public void shortestPath() {
      int i, j, k;
      // 初始陣列的巢狀迴圈
      for ( i = 1; i < graph.length; i++ )
         for ( j = i; j < graph.length; j++ )
            dist[i][j] = dist[j][i] = graph[i][j];
      // 找出最短距離的巢狀迴圈
      for ( k = 1; k < graph.length; k++ )
         // 走訪二維陣列計算最短路徑
         for ( i = 1; i < graph.length; i++ )
            for ( j = 1; j < graph.length; j++ )
               if ( dist[i][k]+dist[k][j] < dist[i][j] )
                  // 指定成為較短的距離
                  dist[i][j] = dist[i][k] + dist[k][j];
      System.out.print("V    1    2    3");
      System.out.println("    4    5    6");
      for ( i = 1; i < graph.length; i++ ) {
         System.out.print(i + " ");
         for ( j = 1; j < graph.length; j++ ) {
            // 調整顯示的位置, 顯示距離陣列
            if ( dist[i][j] < 10 ) System.out.print(" ");
            if ( dist[i][j] < 100 )System.out.print(" ");
            System.out.print(" " + dist[i][j] + " ");
         }
         System.out.println();
      }
   }
}
// 主類別
public class Ch7_5_2 {
   // 主程式
   public static void main(String[] args) {
      int edge[][] = { {1, 2, 35},  // 加權邊線陣列
                       {1, 3, 90},
                       {2, 3, 45},
                       {2, 4, 30},
                       {3, 5, 25},
                       {4, 5, 45},
                       {5, 6, 200} };
      Floyd fl = new Floyd(7, edge);  // 建立圖形
      System.out.println("圖形G的鄰接矩陣內容: ");
      fl.printGraph();             // 顯示圖形
      System.out.println(
             "從各頂點到各頂點最近距離的Floyd計算過程:");
      fl.shortestPath();          // 找尋最短路徑
      System.out.println();
   }
}