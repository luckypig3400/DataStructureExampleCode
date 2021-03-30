/* 程式範例: Ch10_5.java */ 
import java.util.*;
class Stack {  // 堆疊類別的宣告
   // 建立LinkedList物件
   private LinkedList<Integer> llist = new LinkedList<>();
   // 新增堆疊元素
   public void push(Integer obj) {
      llist.addFirst(obj);
   }
   // 取出堆疊元素
   public Integer pop() {
      Integer obj = llist.getFirst();
      llist.removeFirst();
      return obj;
   }
   public boolean isStackEmpty() {
      return (llist.size()>0 ? false : true);
   }
}
// 主類別
public class Ch10_5 {
   // 主程式
   public static void main(String[] args) {
      // 堆疊元素的String陣列
      Integer[] data = new Integer[6];
      data[0] = new Integer(1);    // 指定陣列初值
      data[1] = new Integer(2);
      data[2] = new Integer(3);
      data[3] = new Integer(4);
      data[4] = new Integer(5);
      data[5] = new Integer(6);
      Stack stack = new Stack();   // 建立堆疊物件
      System.out.print("存入堆疊資料的順序: ");
      // 使用迴圈將資料存入堆疊
      for (int i=0; i< data.length; i++) {
         stack.push(data[i]);
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n取出堆疊資料的順序: ");
      while ( !stack.isStackEmpty() ) // 取出堆疊資料
          System.out.print("[" + stack.pop() + "]");
      System.out.println();
   }
}