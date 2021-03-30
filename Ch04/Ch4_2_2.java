/* 程式範例: Ch4_2_2.java */ 
import java.io.*;
class Node {     // 節點類別
   int data;     // 節點資料
   Node next;    // 參考下一個節點
   // 建構子: 建立節點資料
   public Node(int data) { this.data = data; }
}
class Stack_List implements StackInterface { // 堆疊類別
   private Node top;           // 堆疊頂端
   // 建構子: 建立堆疊
   public Stack_List() { top = null; }
   // 方法: 檢查堆疊是否是空的
   public boolean isStackEmpty() {
      if ( top == null ) return true;
      else               return false;
   }
   // 方法: 將資料存入堆疊
   public boolean push(int d) {
      Node new_node;           // 新節點指標
      // 建立節點物件
      new_node = new Node(d);
      new_node.next = top;     // 新節點指向原開始
      top = new_node;          // 新節點成為堆疊開始
      return true;             // 成功將節點存入堆疊
   }
   // 方法: 從堆疊取出資料
   public int pop() {
      Node ptr;                // 指向堆疊頂端
      int temp;
      if ( !isStackEmpty() ) { // 堆疊是否是空的
         ptr = top;            // 指向堆疊頂端
         top = top.next;       // 堆疊指標指向下節點
         return ptr.data;      // 取出資料
      }
      else return -1;
   }
}
// 主類別
public class Ch4_2_2 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      Stack_List st = new Stack_List(); // 建立堆疊物件
      int[] input = new int[100]; // 儲存輸入元素
      int[] output = new int[100];// 儲存取出元素
      int select = 1;             // 選項
      int numOfInput  = 0;        // 陣列的元素數
      int numOfOutput = 0;
      int i, temp;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("鏈結串列的堆疊處理......");
      while ( select != 3 ) {   // 主迴圈
         System.out.print("[1]存入 [2]取出 ");
         System.out.print("[3]顯示全部內容 ==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1: // 將輸入值存入堆疊
               System.out.print("請輸入存入值(");
               System.out.print(numOfInput + ")==> ");
               System.out.flush();    // 清除緩衝區
               // 讀取一列, 轉換成整數值
               temp = Integer.parseInt(in.readLine());
               st.push(temp);         // 存入堆疊
               input[numOfInput++] = temp;
               break;
            case 2: // 取出佇列的內容
               if ( !st.isStackEmpty() ) {
                  temp = st.pop();
                  System.out.println("取出元素: "+temp);
                  output[numOfOutput++] = temp;
               }
               break;
         }
      }
      System.out.print("輸入堆疊的元素: ");  // 輸入元素
      for ( i = 0; i < numOfInput; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n取出堆疊的元素: ");// 輸出元素
      for ( i = 0; i < numOfOutput; i++ )
         System.out.print("[" + output[i] + "]");
      System.out.print("\n堆疊剩下的元素: ");// 剩下元素
      while ( !st.isStackEmpty() )
         System.out.print("[" + st.pop() + "]");
      System.out.println();
      in.close();                // 關閉串流
   }
}