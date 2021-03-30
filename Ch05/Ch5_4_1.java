/* 程式範例: Ch5_4_1.java */ 
import java.io.*;
// 輸入限制性雙佇列類別, 繼承環狀佇列CircularQueue類別
class Deque_Input extends CircularQueue {
   // 建構子: 建立雙佇列
   public Deque_Input(int size) { super(size); }
   // 方法: 檢查雙佇列是否是空的
   public boolean isDequeEmpty() {
      return isCQueueEmpty();
   }
   // 方法: 檢查雙佇列是否已滿
   public boolean isDequeFull() {
      return isCQueueFull();
   }
   // 方法: 將資料存入雙佇列
   public boolean endeque(int d) {
      return enqueue(d);
   }
   // 方法: 從雙佇列(前端)取出資料
   public int dedeque_front() {
      return dequeue();
   }
   // 方法: 從雙佇列(尾端)取出資料
   public int dedeque_rear() {
      int temp;
      if ( isDequeEmpty() )         // 檢查佇列是否是空
         return -1;                 // 無法取出
      temp = queue[rear];
      rear--;                       // 尾端指標往前移
      // 是否超過陣列邊界, 且從未從前端取出
      if ( rear < 0 && front != -1 )
         rear = queue.length - 1;   // 從最大值開始
      return temp;                  // 傳回佇列取出元素
   }
}
// 主類別
public class Ch5_4_1 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 建立雙佇列物件
      Deque_Input dq = new Deque_Input(10);
      int[] input = { 1, 2, 3, 4, 5, 6 }; // 輸入元素
      int[] output = new int[6];  // 儲存取出元素
      int select;                 // 選項
      int i, temp, pos = 0;
      for ( i = 0; i < 6; i++ )   // 將陣列元素存入雙佇列
         dq.endeque(input[i]);
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("輸入限制性雙佇列處理......");
      while ( !dq.isDequeEmpty() ) {   // 主迴圈
         System.out.print("[1]從尾取出 [2]從前取出==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1:  // 從尾端取出佇列內容
               temp = dq.dedeque_rear();
               output[pos++] = temp;
               break;
            case 2:  // 從前端取出佇列內容
               temp = dq.dedeque_front();
               output[pos++] = temp;
               break;
         }
      }
      System.out.print("存入雙佇列順序: "); // 存入元素
      for ( i = 0; i < 6; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n取出雙佇列順序: ");// 取出元素
      for ( i = 0; i < 6; i++ )
         System.out.print("[" + output[i] + "]");
      System.out.println();
      in.close();                // 關閉串流
   }
}