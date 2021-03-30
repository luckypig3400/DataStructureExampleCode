/* 程式範例: Ch6_5_1.java */ 
import java.io.*;
class BSTree_Search extends BSTree {// 繼承二元搜尋樹類別
   // 建構子: 建立二元搜尋樹
   public BSTree_Search(int[] data) { super(data); }
   // 方法: 二元搜尋樹的搜尋
   public boolean searchBSTreeNode(int d) {
      TreeNode ptr = head;
      while ( ptr != null ) {    // 主迴圈
         if ( ptr.data == d )    // 找到了
            return true;         // 傳回節點指標
         else
            if ( ptr.data > d )  // 比較資料
               ptr = ptr.left;   // 左子樹
            else
               ptr = ptr.right;  // 右子樹
      }
      return false;              // 沒有找到
   }
}
// 主類別
public class Ch6_5_1 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 二元搜尋樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      int key = 0;              // 搜尋鍵值
      // 建立二元搜尋樹物件
      BSTree_Search bst = new BSTree_Search(data);
      System.out.println("二元搜尋樹的節點內容: ");
      bst.printBSTree();
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("請輸入搜尋值1~9(-1結束)==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // 呼叫二元搜尋樹搜尋法的搜尋方法
            if ( bst.searchBSTreeNode(key) )
               System.out.println("搜尋到鍵值:" + key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}