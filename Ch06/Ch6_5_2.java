/* 程式範例: Ch6_5_2.java */ 
import java.io.*;
class BSTree_Delete extends BSTree {// 繼承二元搜尋樹類別
   // 建構子: 建立二元搜尋樹
   public BSTree_Delete(int[] data) { super(data); }
   // 方法: 二元搜尋樹的節點刪除
   public void deleteBSTreeNode(int d) {
      TreeNode parent;      // 父節點指標
      TreeNode ptr;         // 刪除節點指標
      TreeNode child;       // 子節點指標
      boolean isfound = false; // 是否找到刪除節點
      // 找尋刪除節點和其父節點指標
      parent = ptr = head;
      while ( ptr != null && !isfound ) { // 主迴圈
         if ( ptr.data == d )
            isfound = true;      // 找到刪除節點
         else {
            parent = ptr;        // 保留父節點指標
            if ( ptr.data > d )  // 比較資料
               ptr = ptr.left;   // 左子樹
            else
               ptr = ptr.right;  // 右子樹
         }
      }
      if ( ptr == null ) return; // 沒有找到刪除節點
      // 刪除二元搜尋樹的節點, 情況1: 葉節點
      if ( ptr.left == null && ptr.right == null ) {
         if ( ptr == head ) head = null;  // 根節點
         else if ( parent.left == ptr )
              parent.left = null;  // 左子節點
            else
              parent.right = null; // 右子節點
         return;
      }
      // 情況2: 沒有左子樹
      if ( ptr.left == null ) {
         if ( parent != ptr )    // 相等是根節點
            if ( parent.left == ptr )
               parent.left = ptr.right;    // 左子節點
            else parent.right = ptr.right; // 右子節點
         else head = head.right;  // 根節點指向右子節點
         return;
      } // 情況3: 沒有右子樹
      if ( ptr.right == null ) {
         if ( parent != ptr )     // 相等是根節點
            if ( parent.right == ptr )
                parent.right = ptr.left; // 右子節點
            else parent.left = ptr.left; // 左子節點
         else head = head.left;   // 根節點指向左子節點
         return;
      } // 情況4: 有左子樹和右子樹
      parent = ptr;               // 父節點指向刪除節點
      child = ptr.left;           // 設定成左子節點
      while ( child.right != null ) { // 找到最右的葉節點
         parent = child;              // 保留父節點指標
         child = child.right;         // 往右子樹走
      }
      ptr.data = child.data;        // 設定成葉節點資料
      if ( parent.left == child )   // 子節點沒有右子樹
         parent.left = null;
      else parent.right = child.left; // 連結左邊葉節點
      return;
   }
}
// 主類別
public class Ch6_5_2 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 二元搜尋樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      int key = 0;              // 刪除的節點值
      // 建立二元搜尋樹物件
      BSTree_Delete bst = new BSTree_Delete(data);
      System.out.println("刪除前的節點內容: ");
      bst.printBSTree();
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("輸入刪除節點1~9(-1結束)==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         key = Integer.parseInt(input.readLine());
         if ( key != -1 ) {  // 刪除節點資料
            bst.deleteBSTreeNode(key); // 刪除節點
            System.out.print("刪除後的節點內容: ");
            bst.printBSTree();          // 顯示二元搜尋樹
         }
      }
      input.close();                // 關閉串流
   }
}