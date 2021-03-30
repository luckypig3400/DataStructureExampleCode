/* 程式範例: Ch3_5_3.java */
import java.io.*;  
// 雙向鏈結串列類別
class DoublyLinked_Delete extends DoublyLinked {
   // 建構子: 建立雙向串列
   public DoublyLinked_Delete(int[] data) {super(data);}
   // 方法: 刪除節點
   public void deleteDNode(DNode ptr) {
      if ( ptr.previous == null ) { // 是否有前一個節點
         // 情況1: 刪除第一個節點
         first = first.next;        // 指向下一個節點
         first.previous = null;     // 設定指向前節點指標
      }
      else {
         if ( ptr.next == null ) {  // 是否有下一個節點
            // 情況2: 刪除最後一個節點
            ptr.previous.next = null;// 前節點指向null
         }
         else {
            // 情況3: 刪除中間的節點
            // 前節點指向下一節點
            ptr.previous.next = ptr.next;
            // 下一節點指向前節點
            ptr.next.previous = ptr.previous;
         }
      }
   }
}
// 主類別
public class Ch3_5_3 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      int temp = 0;  // 宣告變數
      int[] d = { 1, 2, 3, 4, 5, 6 };// 建立串列的陣列
      DoublyLinked_Delete dl=new DoublyLinked_Delete(d);
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( temp != 4 ) {
         System.out.print("目前的串列: ");
         dl.printDList();              // 顯示目前的串列
         System.out.print("[1]往下移動 [2]往前移動 ");
         System.out.print("[3]刪除節點 [4]離開 ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         temp = Integer.parseInt(input.readLine());
         switch ( temp ) {
            case 1: dl.nextNode();     // 往下移動
               break;
            case 2: dl.previousNode(); // 往前移動
               break;
            case 3: // 刪除節點
               dl.deleteDNode(dl.readNode());
               dl.resetNode();         // 重設目前指標
               break;
         }
      }
      input.close();                   // 關閉串流
   }
}