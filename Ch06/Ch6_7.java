/* 程式範例: Ch6_7.java */ 
class BSTree_Exp extends BSTree {  // 繼承二元搜尋樹類別
   // 建構子: 建立二元搜尋樹
   public BSTree_Exp(char[] data, int pos) {
      // 轉換成二元搜尋樹
      head = transformBSTree(data, pos);
   }
   // 方法: 二元樹的陣列表示法轉換成鏈結表示法
   public TreeNode transformBSTree(char[] arr,int pos) {
      TreeNode newnode;            // 新節點指標
      if ( pos >= arr.length )   // 終止條件
         return null;
      else  { // 建立新節點物件
         newnode = new TreeNode((int)arr[pos]);
         // 建立左子樹的遞迴呼叫
         newnode.left = transformBSTree(arr, 2*pos);
         // 建立右子樹的遞迴呼叫
         newnode.right = transformBSTree(arr, 2*pos+1);
         return newnode;
      }
   }
   // 方法: 計算二元運算式的結果
   public int cal(char op, int operand1, int operand2) {
      switch ( op ) {
         case '*': return ( operand2 * operand1 ); // 乘
         case '/': return ( operand2 / operand1 ); // 除
         case '+': return ( operand2 + operand1 ); // 加
         case '-': return ( operand2 - operand1 ); // 減
      }
      return -1;
   }
   // 方法: 計算二元樹運算式的值
   public int eval(TreeNode ptr) {
      int operand1 = 0;       // 第1個運算元變數
      int operand2 = 0;       // 第2個運算元變數
      // 終止條件
      if ( ptr.left == null && ptr.right == null )
        // 傳回葉節點的值
        return Character.getNumericValue((char)ptr.data);
      else {
        operand1 = eval(ptr.left);  // 左子樹
        operand2 = eval(ptr.right); // 右子樹
        return cal((char)ptr.data, operand1, operand2);
      }
   }
   // 方法: 前序走訪的遞迴方法
   public void preOrder(TreeNode node) {
      if ( node != null ) {
         // 顯示節點資料
         System.out.print((char)node.data);
         preOrder(node.left);  // 走訪左子樹
         preOrder(node.right); // 走訪右子樹
      }
   }
   // 方法: 中序走訪的遞迴方法
   public void inOrder(TreeNode node) {
      if ( node != null ) {
         inOrder(node.left);  // 走訪左子樹
         // 顯示節點資料
         System.out.print((char)node.data);
         inOrder(node.right); // 走訪右子樹
      }
   }
   // 方法: 後序走訪的遞迴方法
   public void postOrder(TreeNode node) {
      if ( node != null ) {
         postOrder(node.left);  // 走訪左子樹
         postOrder(node.right); // 走訪右子樹
         // 顯示節點資料
         System.out.print((char)node.data);
      }
   }
}
// 主類別
public class Ch6_7 {
   // 主程式
   public static void main(String[] args) {
      // 運算式二元樹節點資料
      char[] data = {' ','+','*','*','5','6','4','3' };
      // 建立二元搜尋樹物件
      BSTree_Exp exp = new BSTree_Exp(data, 1);
      System.out.print("中序運算式(中序走訪): ");
      exp.inOrder(exp.head);     // 中序顯示二元樹運算式
      System.out.print("\n前序運算式(前序走訪): ");
      exp.preOrder(exp.head);    // 前序顯示二元樹運算式
      System.out.print("\n後序運算式(後序走訪): ");
      exp.postOrder(exp.head);   // 後序顯示二元樹運算式
      // 計算二元樹運算式的運算結果
      System.out.print("\n運算式值= ");
      System.out.println(exp.eval(exp.head));
   }
}