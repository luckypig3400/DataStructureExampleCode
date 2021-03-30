/* 程式範例: Ch3_5_1.java */
import java.io.*; 
public class Ch3_5_1 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp = 1;  // 宣告變數
      int[] data = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      // 建立與走訪雙向串列
      DoublyLinked dl = new DoublyLinked(data);
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( temp != 5 ) {   // 主迴圈
         System.out.print("原來的串列: ");
         dl.printDList();     // 顯示雙向串列
         System.out.print("[1]往下移動 [2]往前移動 [3]");
         System.out.print("重設 [4]節點值 [5]離開 ==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         temp = Integer.parseInt(in.readLine());
         switch ( temp ) {
            case 1: dl.nextNode();     // 往下移動
               break;
            case 2: dl.previousNode(); // 往前移動
               break;
            case 3: dl.resetNode();    // 重設指標
               break;
            case 4: // 讀取節點值
               System.out.println("節點值: "
                                   + dl.readNode().data);
               break;
         }
      }
      in.close();                // 關閉串流
   }
}