/* 程式範例: Ch6_3_2.java */ 
class Node {        // 樹節點類別
   int data;        // 節點資料
   int left;        // 參考左子樹
   int right;       // 參考右子樹
}
class BTree_Node {  // 二元樹類別
   private Node[] btree;        // 二元樹陣列宣告
   // 建構子: 建立二元樹
   public BTree_Node(int size, int[] data) {
      int level;               // 樹的階層
      int i, pos;              // -1是左樹,1是右樹
      btree = new Node[size];  // 建立陣列
      for ( i = 0; i < btree.length; i++ )
          btree[i] = new Node();  // 建立物件陣列元素
      for ( i = 0; i < size; i++ ) {
         // 清除物件陣列
         btree[i].data = 0;
         btree[i].left = btree[i].right = -1;
      }
      btree[0].data = data[0];      // 建立樹根節點
      // 建立節點的迴圈
      for ( i = 1; i < data.length; i++ ) {
         btree[i].data = data[i];   // 建立節點內容
         level = 0; pos = 0;
         while ( pos == 0 ) {// 使用迴圈比較是左或右子樹
            if ( data[i] > btree[level].data )
               // 右樹是否有下一階層
               if ( btree[level].right != -1 )
                  level = btree[level].right;
               else pos = -1;        // 是右樹
            else // 左樹是否有下一階層
               if ( btree[level].left != -1 )
                  level = btree[level].left;
               else pos = 1;         // 是左樹
         }
         if (pos==1) btree[level].left = i;// 鏈結左子樹
         else        btree[level].right= i;// 鏈結右子樹
      }
   }
   // 方法: 顯示二元樹
   public void printBTree() {
      // 使用迴圈顯示二元樹的節點資料
      System.out.println("  左  資料  右");
      for ( int i = 0; i < btree.length; i++ )
         if ( btree[i].data != 0 ) {  // 是否是樹的節點
            System.out.print(i+":["+btree[i].left+"] ");
            System.out.print("["+btree[i].data+"] ");
            System.out.println("["+btree[i].right+"] ");
         }
   }
}
// 主類別
public class Ch6_3_2 {
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // 建立二元樹物件
      BTree_Node bt = new BTree_Node(16, data);
      bt.printBTree();  // 顯示二元樹的節點資料
   }
}