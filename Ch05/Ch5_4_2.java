/* 程式範例: Ch5_4_2.java */ 
import java.io.*;
// 輸出限制性雙佇列類別, 繼承佇列Queue類別
class Deque_Output extends Queue {
   // 建構子: 建立雙佇列
   public Deque_Output() { super(); }
   // 方法: 檢查雙佇列是否是空的
   public boolean isDequeEmpty() {
      return isQueueEmpty();
   }
   // 方法: 將資料存入(前端)雙佇列
   public void endeque_front(int d) {
      Node new_node = new Node(d);   // 建立節點
      if ( isQueueEmpty() )    // 是否是第一次存入
         rear = new_node;      // rear指向new_node
      else
         new_node.next = front;// 插入front之前
      front = new_node;        // front指向new_node
   }
   // 方法: 將資料存入(尾端)雙佇列
   public void endeque_rear(int d) {
      enqueue(d);
   }
   // 方法: 從雙佇列取出資料
   public int dedeque() {
      return dequeue();
   }
}
// 主類別
public class Ch5_4_2 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 建立雙佇列物件
      Deque_Output dq = new Deque_Output();
      int[] input = { 1, 2, 3, 4, 5, 6 };   // 輸入元素
      int select;                 // 選項
      int i;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("輸出限制性雙佇列處理......");
      for ( i = 0; i < 6; i++ ) { // 將陣列元素存入雙佇列
         System.out.print("[1]從尾存入 [2]從前存入==> ");
         System.out.flush();      // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1:  // 從尾端存入佇列內容
               dq.endeque_rear(input[i]);
               break;
            case 2:  // 從前端存入佇列內容
               dq.endeque_front(input[i]);
               break;
         }
      }
      System.out.print("存入雙佇列順序: ");// 存入元素
      for ( i = 0; i < 6; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n取出雙佇列順序: ");// 取出元素
      while ( !dq.isDequeEmpty() )
         System.out.print("[" + dq.dedeque() + "]");
      System.out.println();
      in.close();                // 關閉串流
   }
}