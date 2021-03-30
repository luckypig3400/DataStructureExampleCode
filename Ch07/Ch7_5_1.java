/* 程式範例: Ch7_5_1.java */ 
// Dijkstra演算法類別
class Dijkstra extends AdjacencyMatrix {
   private int[] dist;       // 路徑長度陣列
   private int[] pi;         // 前一頂點陣列
   private int[] selected;   // 選擇的頂點陣列
   // 建構子: 建立鄰接矩陣圖形
   public Dijkstra(int size, int[][] edge) {
      super(size, edge);
      dist = new int[size];          // 建立陣列
      pi = new int[size];
      selected = new int[size];
      for ( int i = 1; i < size; i++ ) { // 初始陣列迴圈
         selected[i] = 0;            // 清除陣列內容
         pi[i] = 0;                  // 清除陣列內容
      }
   }
   // 方法: 找尋某一頂點至各頂點的最短距離
   public void shortestPath(int source) {
      int min_len;                   // 最短距離
      int min_v = 1;                 // 最短距離的頂點
      int i,j;
      for ( i = 1; i < graph.length; i++ )// 初始陣列迴圈
         dist[i] = graph[source][i]; // 初始距離
      selected[source] = 1;          // 開始頂點加入集合
      dist[source] = 0;              // 設定開始頂點距離
      System.out.println("V   1   2   3   4   5   6");
      // 顯示dist[]陣列內容
      for ( j = 1; j < graph.length; j++ ) { // 選擇頂點
         if ( j == 1 ) System.out.print(source);
         if ( dist[j] == MAX ) System.out.print("  ∞");
         else {  // 調整顯示位置
            if ( dist[j] < 10 )  System.out.print(" ");
            if ( dist[j] < 100 ) System.out.print(" ");
            System.out.print(" " + dist[j]); // 顯示距離
         }
      }
      System.out.println();
      // 一共執行頂點數-1次的迴圈
      for ( i = 1; i < graph.length-1; i++ ) {
         min_len = MAX;              // 先設為無窮大
         // 找出最短距離頂點的迴圈
         for ( j = 1; j < graph.length; j++ )
            // 從不屬於集合的頂點陣列找尋最近距離頂點 s
            if ( min_len>dist[j] && selected[j]==0 ) {
               min_v = j;            // 目前最短的頂點
               min_len = dist[j];    // 記錄最短距離
            }
         selected[min_v] = 1;        // 將頂點加入集合
         System.out.print(min_v);    // 顯示選擇頂點
         if ( i == 1 ) pi[min_v] = 1;// 前頂點
         // 計算開始頂點到各頂點最短距離陣列的迴圈
         for ( j = 1; j < graph.length; j++ ) {
           if ( selected[j] == 0 &&  // 是否距離比較短
               dist[min_v]+graph[min_v][j] < dist[j]) {
             // 指定成較短的距離
             dist[j] = dist[min_v] + graph[min_v][j];
             pi[j] = min_v;          // 記錄前一個頂點
           }
           if ( dist[j]==MAX ) System.out.print("  ∞");
           else {  // 調整顯示的位置, 顯示最短距離
              if ( dist[j] < 10 )  System.out.print(" ");
              if ( dist[j] < 100 ) System.out.print(" ");
              System.out.print(" " + dist[j]);
           }
         }
         System.out.println();
      }
      System.out.println("前一頂點陣列: ");
      System.out.println("V  1   2   3   4   5   6");
      for ( j = 1; j < graph.length; j++ ) {
         System.out.print("   "+pi[j]);// 顯示前一個頂點
      }
      System.out.println();
   }
}
// 主類別
public class Ch7_5_1 {
   // 主程式
   public static void main(String[] args) {
      int edge[][] = { {1, 2, 35},  // 加權邊線陣列
                       {1, 3, 90},
                       {2, 3, 45},
                       {2, 4, 30},
                       {3, 5, 25},
                       {4, 5, 45},
                       {5, 6, 200} };
      Dijkstra di = new Dijkstra(7, edge);  // 建立圖形
      System.out.println("圖形G的鄰接矩陣內容: ");
      di.printGraph();             // 顯示圖形
      System.out.println(
           "從頂點1到各頂點最近距離的Dijkstra計算過程:");
      di.shortestPath(1);          // 找尋最短路徑
      System.out.println();
   }
}