/* 程式範例: Ch7_4_2m.java */
public class Ch7_4_2m { 
   // 主程式
   public static void main(String[] args) {
      int edge[][] = {{1, 2,  2},  // 加權邊線陣列
                      {1, 3,  5},
                      {2, 4, 16},
                      {3, 2,  6},
                      {4, 5,  9},
                      {5, 3, 10},
                      {6, 3, 20}};
      AdjacencyMatrix g = new AdjacencyMatrix(7, edge);  // 建立圖形
      System.out.println("圖形G9的鄰接矩陣內容: ");
      g.printGraph();  // 顯示圖形
   }
}