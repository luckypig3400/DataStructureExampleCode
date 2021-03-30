/* 程式範例: Ch6_3_1.java */ 
class BTree_Array { // 二元樹類別
   private int[] btree;        // 二元樹陣列宣告
   // 建構子: 建立二元樹
   public BTree_Array(int size, int[] array) {
      int level, i;            // 樹的階層
      btree = new int[size];   // 建立陣列
      // 清除陣列元素
      for ( i = 0; i < size; i++ ) btree[i] = -1;
      btree[1] = array[1];     // 建立根節點
      // 使用迴圈新增二元樹的其它節點
      for ( i = 2; i < array.length; i++ ) {
         level = 1;                     // 從階層1開始
         while ( btree[level] != -1 ) { // 是否有子樹
            if (array[i] > btree[level])// 是左或右子樹
               level = level * 2 + 1;   // 右子樹
            else
               level = level * 2;       // 左子樹
         }
         btree[level] = array[i];       // 存入節點資料
      }
   }
   // 方法: 顯示二元樹
   public void printBTree() {
      // 使用迴圈顯示二元樹的節點資料
      for ( int i = 1; i < btree.length; i++ )
         if ( btree[i] != -1 )
            System.out.print("["+i+":"+btree[i]+"]");
      System.out.println();
   }   
}
// 主類別
public class Ch6_3_1 {
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 0, 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // 建立二元樹物件
      BTree_Array bt = new BTree_Array(16, data);
      bt.printBTree();  // 顯示二元樹的節點資料
   }
}