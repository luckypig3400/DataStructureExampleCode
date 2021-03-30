/* 程式範例: Ch6_4_2.java */ 
class BTree_PreOrder extends BTree {  // 繼承二元樹類別
   // 建構子: 建立二元樹
   public BTree_PreOrder(int[] data) { super(data); }
   // 方法: 二元樹的前序走訪
   public void preOrder(TreeNode ptr) {
      if ( ptr != null ) {     // 終止條件
         // 顯示節點內容
         System.out.print("[" + ptr.data + "]"); 
         preOrder(ptr.left);   // 左子樹
         preOrder(ptr.right);  // 右子樹
      }
   }
   // 方法: 前序走訪顯示二元樹
   public void printPreOrder() {
      preOrder(head);  // 呼叫前序走訪方法
      System.out.println();
   } 
}
// 主類別
public class Ch6_4_2 {
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // 建立二元樹物件
      BTree_PreOrder bt = new BTree_PreOrder(data);
      System.out.println("前序走訪的節點內容: ");
      bt.printPreOrder();   
   }
}