/* 程式範例: Ch8_4_3.java */
public class Ch8_4_3 { 
   // 方法: 建立堆積
   static void siftDown(int[] heap, int root, int len) {
      boolean done = false;             // 是否可結束
      int j, temp;
      j = 2 * root;                  // 子節點索引
      temp = heap[root];             // 堆積的根節點值
      while ( j <= len && !done ) {  // 主迴圈
         if ( j < len )              // 找最大子節點
            if ( heap[j] < heap[j+1] )
               j++;                  // 下一節點
            if ( temp >= heap[j] )   // 比較樹的根節點
               done = true;          // 結束
            else {
               heap[j/2] = heap[j];  // 父節點是目前節點
               j = 2 * j;            // 其子節點
            }
      }
      heap[j/2] = temp;              // 父節點為根節點值
   }
   // 方法: 堆積排序法
   static void heapSort(int[] heap, int len) {
      int i,j,temp;
      // 將二元樹轉成堆積
      for ( i = ( len / 2 ); i >= 1; i-- )
         siftDown(heap, i, len);
      System.out.print("\n堆積的內容: ");
      for ( j = 1; j < 10; j++ )     // 顯示堆積
         System.out.print("["+heap[j]+"]");
      // 堆積排序法的主迴圈
      for ( i = len - 1; i >= 1; i-- ) {
         temp = heap[i+1];           // 交換最後元素
         heap[i+1] = heap[1];
         heap[1] = temp;
         siftDown(heap, 1, i);       // 重建堆積
         System.out.print("\n重建的堆積: ");
         for ( j = 1; j < 10; j++ )  // 顯示處理內容
            System.out.print("["+heap[j]+"]");
      }
   }
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 0, 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      int i;
      System.out.print("二元樹內容: ");
      for ( i = 1; i < 10; i++ )     // 顯示二元樹內容
          System.out.print("["+data[i]+"]");
      heapSort(data, 9);             // 執行堆積排序法
      System.out.print("\n輸出排序結果: ");
      for ( i = 1; i < 10; i++ )     // 顯示排序結果
         System.out.print("["+data[i]+"]");
      System.out.println();
   }
}