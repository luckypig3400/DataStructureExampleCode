/* 程式範例: Ch4_2_1.java */ 
class Stack_Array implements StackInterface {// 堆疊類別
   private int[] stack;      // 宣告陣列
   private int top;          // 堆疊頂端索引
   // 建構子: 建立堆疊
   public Stack_Array(int size) {
      stack = new int[size]; // 建立陣列物件
      top = -1;
   }
   // 方法: 檢查堆疊是否是空的
   public boolean isStackEmpty() {
      if ( top == -1 ) return true;
      else             return false;
   }
   // 方法: 將資料存入堆疊
   public boolean push(int d) {
      if ( top >= stack.length ) { // 是否超過堆疊容量
         System.out.println("堆疊內容全滿!!!");
         return false;
      }
      else {
         stack[++top] = d;     // 存入堆疊
         return true;
      }
   }
   // 方法: 從堆疊取出資料
   public int pop() {
      if ( isStackEmpty() )   // 堆疊是否是空的
         return -1;
      else
         return stack[top--]; // 取出資料
   }
}
// 主類別
public class Ch4_2_1 {
   // 主程式
   public static void main(String[] args) {
      int[] data = {1, 2, 3, 4, 5, 6};   // 宣告陣列
      Stack_Array st = new Stack_Array(9);// 建立堆疊物件
      int i;
      System.out.print("存入堆疊資料的順序: ");
      // 使用迴圈將資料存入堆疊
      for ( i = 0; i < 6; i++) {
         st.push(data[i]);
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n取出堆疊資料的順序: ");
      while ( !st.isStackEmpty() )   // 取出堆疊資料
         System.out.print("[" + st.pop() + "]");
      System.out.println();
   }
}