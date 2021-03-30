/* 程式範例: Ch6_4_1.java */ 
class BTree_InOrder extends BTree {  // 繼承二元樹類別
   // 建構子: 建立二元樹
   public BTree_InOrder(int[] data) { super(data); }
   // 方法: 二元樹的中序走訪
   public void inOrder(TreeNode ptr) {
      if ( ptr != null ) {     // 終止條件
         inOrder(ptr.left);    // 左子樹
         // 顯示節點內容
         System.out.print("[" + ptr.data + "]"); 
         inOrder(ptr.right);   // 右子樹
      }
   }
   // 方法: 中序走訪顯示二元樹
   public void printInOrder() {
      inOrder(head);  // 呼叫中序走訪方法
      System.out.println();
   } 
}
// 主類別
public class Ch6_4_1 {
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // 建立二元樹物件
      BTree_InOrder bt = new BTree_InOrder(data);
      System.out.println("中序走訪的節點內容: ");
      bt.printInOrder();   
   }
}