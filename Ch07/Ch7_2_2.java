/* 程式範例: Ch7_2_2.java */
public class Ch7_2_2 { 
   // 主程式
   public static void main(String[] args) {
      int edge[][] = { {1, 2}, {2, 1},  // 邊線陣列
                       {1, 3}, {3, 1},
                       {2, 3}, {3, 2},
                       {2, 4}, {4, 2},
                       {3, 5}, {5, 3},
                       {4, 5}, {5, 4} };
      Graph_List g = new Graph_List(10, edge);// 建立圖形
      System.out.println("圖形G的鄰接串列內容: ");
      g.printGraph();  // 顯示圖形
   }
}