/* 程式範例: Ch7_6.java */ 
// 拓樸排序的圖形類別
class TopoSort extends AdjacencyList {
   // 建構子: 建立鄰接串列圖形
   public TopoSort(int size, int[][] edge) {
      super(size, edge);
   }
   // 方法: 圖形的拓樸排序
   public boolean topoSort() {
      Vertex_List ptr;
      int i, vertex;
      Queue q = new Queue();       // 建立佇列
      // 將內分支度為零頁的頂點存入佇列的迴圈
      for ( i = 1; i < head.length; i++ )
         if ( head[i].data == 0 )  // 如果分支度是零
            q.enqueue(i);          // 將頂點存入佇列
      while ( !q.isQueueEmpty() ) {// 佇列是否已空
         vertex = q.dequeue();     // 將頂點從佇列取出
         // 顯示拓樸排序的頂點
         System.out.print(" " + vertex + " ");
         ptr = head[vertex].next;  // 頂點指標
         while ( ptr != null ) {   // 走訪至串列尾
            vertex = ptr.data;     // 取得頂點值
            head[vertex].data--;   // 頂點內分支度減一
            // 如果內分支度是零
            if ( head[vertex].data == 0  )
               q.enqueue(vertex);  // 將頂點存入佇列
            ptr = ptr.next;        // 下一個頂點
         }
      }
      System.out.println();
      for ( i = 1; i<head.length; i++ )// 檢查是否有迴圈
         if ( head[i].data != 0 )    // 內分支度不是零
            return true;             // 有迴圈
      return false;                  // 沒有迴圈
   }
}
// 主類別
public class Ch7_6 {
   // 主程式
   public static void main(String[] args) {
      int edge1[][] = { {3, 2, 1},     // 邊線陣列1
                        {2, 1, 1},
                        {2, 5, 1},
                        {2, 6, 1},
                        {1, 4, 1},
                        {5, 4, 1},
                        {7, 4, 1},
                        {6, 7, 1} };
      int edge2[][] = { {3, 2, 1},     // 邊線陣列2
                        {2, 1, 1},
                        {2, 5, 1},
                        {2, 6, 1},
                        {1, 4, 1},
                        {5, 4, 1},
                        {7, 4, 1},
                        {6, 7, 1},
                        {5, 6, 1},
                        {7, 5, 1} };
      TopoSort ts1 = new TopoSort(8, edge1);  // 建立圖形
      System.out.println("圖形1的鄰接串列內容=========");
      ts1.printGraph();             // 顯示圖形1
      System.out.println("圖形1拓樸排序的內容:");
      if ( ts1.topoSort() )         // 拓樸排序
         System.out.println("圖形1有迴圈");
      else
         System.out.println("圖形1沒有迴圈");
      TopoSort ts2 = new TopoSort(8, edge2);  // 建立圖形
      System.out.println("圖形2的鄰接串列內容=========");
      ts2.printGraph();             // 顯示圖形2
      System.out.println("圖形2拓樸排序的內容:");
      if ( ts2.topoSort() )         // 拓樸排序
         System.out.println("圖形2有迴圈");
      else
         System.out.println("圖形2沒有迴圈");
   }
}