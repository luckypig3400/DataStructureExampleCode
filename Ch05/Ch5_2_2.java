/* 程式範例: Ch5_2_2.java */ 
import java.io.*;
class Node {      // 節點類別
   int data;      // 節點資料
   Node next;     // 下一個節點
   // 建構子
   public Node(int data) {
      this.data = data;
      next = null;
   }
}
class Queue_List implements QueueInterface{ // 佇列類別
   private Node front;  // 佇列的前端
   private Node rear;   // 佇列的尾端
   // 建構子
   public Queue_List() { front = null;   rear = null; }
   // 方法: 存入佇列資料
   public boolean enqueue(int d) {
      Node new_node = new Node(d);// 建立節點
      // 檢查佇列是否是空的
      if ( rear == null )
         front = new_node;        // 插入成為第1個節點
      else rear.next = new_node;  // 新增在結尾
      rear = new_node;            // 更新尾端指標
      return true;
   }
   // 方法: 取出佇列資料
   public int dequeue() {
      int d; // 檢查佇列是否是空的
      if ( !isQueueEmpty() ) {    // 不是空的
         if ( front == rear )     // 最後節點的特殊情況
            rear = null;          // 更新尾端指標
         d = front.data;          // 取得佇列資料
         front = front.next;      // 刪除第1個節點
         return d;                // 傳回節點資料
      }
      else return -1;             // 佇列是空的
   }
   // 方法: 檢查佇列是否是空的
   public boolean isQueueEmpty() {return front == null;}
}
// 主類別
public class Ch5_2_2 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      Queue_List q = new Queue_List(); // 建立佇列物件
      int[] input = new int[100]; // 儲存輸入元素
      int[] output = new int[100];// 儲存取出元素
      int select = 1;             // 選項
      int numOfInput  = 0;        // 陣列的元素數
      int numOfOutput = 0;
      int i, temp;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("鏈結串列的佇列處理......");
      while ( select != 3 ) {   // 主迴圈
         System.out.print("[1]存入 [2]取出");
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
               q.enqueue(temp);    // 存入佇列
               input[numOfInput++] = temp;
               break;
            case 2: // 取出佇列的內容
               if ( !q.isQueueEmpty() ) {
                  temp = q.dequeue();
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
      while ( !q.isQueueEmpty() )
         System.out.print("[" + q.dequeue() + "]");
      System.out.println();
      in.close();                // 關閉串流
   }
}