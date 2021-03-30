/* 程式範例: BSTree.java */ 
// 二元搜尋樹類別
public class BSTree {
   public TreeNode head;   // 參考樹的根節點
   // 建構子(1): 建立空的二元搜尋樹
   public BSTree() { head = null; }
   // 建構子(2): 使用陣列建立二元搜尋樹
   public BSTree(int[] array) {
      int i;
      // 使用迴圈以插入方式建立樹狀結構
      for ( i = 0; i < array.length; i++ )
         insertBSTreeNode(array[i]);
   }
   // 方法: 檢查二元搜尋樹是否是空的
   boolean isBSTreeEmpty() {
      if ( head == null ) return true;
      else                return false;
   }
   // 方法: 在二元搜尋樹插入節點
   public void insertBSTreeNode(int data) {
      if ( head == null ) {  // 建立根節點
         head = new TreeNode(data);
         return;
      }
      // 建立二元搜尋樹
      TreeNode current = head;
      while (true) {
         if ( data < current.data ) {  // 在左子樹
            if ( current.left == null ) {
               current.left = new TreeNode(data);
               return;
            }
            else  current = current.left;
         }
         else {  // 在右子樹
            if ( current.right == null ) {
               current.right = new TreeNode(data);
               return;
            }
            else  current = current.right;
         }
      }
   }
   // 方法: 顯示二元搜尋樹的節點資料
   public void printBSTree() {
      inOrder(this.head);
   }
   // 方法: 中序走訪的遞迴方法
   public void inOrder(TreeNode node) {
      if ( node != null ) {  // 走訪左子樹
         inOrder(node.left);
         // 顯示節點資料
         System.out.print("["+node.data+"]");
         // 走訪右子樹
         inOrder(node.right);
      }
   }
}