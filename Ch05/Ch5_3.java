/* 程式範例: Ch5_3.java */ 
import java.io.*;
class CQueue { // 環狀佇列類別
   private int[] queue;      // 環狀佇列陣列宣告
   private int front;        // 環狀佇列的前端
   private int rear;         // 環狀佇列的尾端
   // 建構子: 建立環狀佇列
   public CQueue(int size) {
      queue = new int[size]; // 建立陣列
      front = -1;
      rear = -1;
   }
   // 方法: 檢查環狀佇列是否是空的
   public boolean isCQueueEmpty() {
      if ( front == rear ) return true;
      else                 return false;
   }
   // 方法: 檢查環狀佇列是否已滿
   public boolean isCQueueFull() {
      int pos;
      pos = (rear+1) % queue.length;
      if ( front == pos ) return true;
      else                return false;
   }
   // 方法: 將資料存入環狀佇列
   public boolean enqueue(int d) {
      if ( isCQueueFull() )      // 檢查是否已滿
         return false;           // 已滿, 無法存入
      else {                  // 是否超過,重新定位
         rear = (rear+1) % queue.length;
         queue[rear] = d;
      }
      return true;
   }
   // 方法: 從環狀佇列取出資料
   public int dequeue() {
      if ( isCQueueEmpty() )     // 檢查佇列是否是空
         return -1;              // 無法取出
      front = (front+1) % queue.length; // 重新定位
      return queue[front];          // 傳回佇列取出元素
   }
}
// 主類別
public class Ch5_3 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      CQueue cq = new CQueue(4);  // 建立佇列物件
      int[] input = new int[100]; // 儲存輸入元素
      int[] output = new int[100];// 儲存取出元素
      int select = 1;             // 選項
      int numOfInput  = 0;        // 陣列的元素數
      int numOfOutput = 0;
      int i, temp;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("環狀佇列處理......");
      while ( select != 3 ) {   // 主迴圈
         System.out.print("[1]存入 [2]取出 ");
         System.out.print("[3]顯示全部內容 ==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1: // 將輸入值存入佇列
               System.out.print("請輸入存入值(");
               System.out.print(numOfInput + ")==> ");
               System.out.flush();    // 清除緩衝區
               // 讀取一列, 轉換成整數值
               temp = Integer.parseInt(in.readLine());
               cq.enqueue(temp);   // 存入環狀佇列
               input[numOfInput++] = temp;
               break;
            case 2: // 取出佇列的內容
               if ( !cq.isCQueueEmpty() ) {
                  temp = cq.dequeue();
                  System.out.println("取出元素: "+temp);
                  output[numOfOutput++] = temp;
               }
               break;
         }
      }
      System.out.print("輸入佇列的元素: ");  // 輸入元素
      for ( i = 0; i < numOfInput; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n取出佇列的元素: ");// 輸出元素
      for ( i = 0; i < numOfOutput; i++ )
         System.out.print("[" + output[i] + "]");
      System.out.print("\n佇列剩下的元素: ");// 剩下元素
      while ( !cq.isCQueueEmpty() )
         System.out.print("[" + cq.dequeue() + "]");
      System.out.println();
      in.close();                // 關閉串流
   }
}