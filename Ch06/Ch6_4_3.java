/* 程式範例: Ch6_4_3.java */ 
class BTree_PostOrder extends BTree {  // 繼承二元樹類別
   // 建構子: 建立二元樹
   public BTree_PostOrder(int[] data) { super(data); }
   // 方法: 二元樹的後序走訪
   public void postOrder(TreeNode ptr) {
      if ( ptr != null ) {      // 終止條件
         postOrder(ptr.left);   // 左子樹
         postOrder(ptr.right);  // 右子樹
         // 顯示節點內容
         System.out.print("[" + ptr.data + "]"); 
      }
   }
   // 方法: 後序走訪顯示二元樹
   public void printPostOrder() {
      postOrder(head);  // 呼叫後序走訪方法
      System.out.println();
   } 
}
// 主類別
public class Ch6_4_3 {
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // 建立二元樹物件
      BTree_PostOrder bt = new BTree_PostOrder(data);
      System.out.println("後序走訪的節點內容: ");
      bt.printPostOrder();   
   }
}