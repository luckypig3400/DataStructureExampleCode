/* 程式範例: Ch9_4_1.java */ 
import java.io.*;
class BSTree_Search extends BSTree {  // 繼承BSTree類別
   // 建構子
   public BSTree_Search(int[] data) {
      super(data);
   }
   // 方法: 二元搜尋樹排序法
   public void BSTreeSort() {
      inOrder(head);     // 呼叫中序走訪方法
   }
   // 方法: 二元搜尋樹搜尋法的搜尋方法
   public boolean BSTreeSearch(int data) {
      return findTree(this.head, data);
   }
   // 遞迴方法: 找尋節點資料的遞迴方法
   private boolean findTree(TreeNode node, int data) {
      if ( node == null ) return false;
      else if ( node.data == data )    // 等於根節點
              return true;
           else if ( data < node.data )// 遞迴呼叫左子樹
                   return findTree(node.left, data);
           else    // 遞迴呼叫右子樹
                   return findTree(node.right, data);
   }
}
public class Ch9_4_1 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 二元樹節點資料
      int[] data = {55,61,41,87,24,35,79,11,99};
      int key = 0;              // 搜尋鍵值
      // 建立二元搜尋樹
      BSTree_Search bst = new BSTree_Search(data);
      bst.BSTreeSort();           // 執行二元搜尋樹排序法
      System.out.println();
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("請輸入搜尋值(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // 呼叫二元搜尋樹搜尋法的搜尋方法
            if ( bst.BSTreeSearch(key) )
               System.out.println("搜尋到鍵值:" + key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}