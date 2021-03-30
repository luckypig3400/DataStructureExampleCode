/* 程式範例: Ch10_3_3.java */ 
import java.util.*;
public class Ch10_3_3 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件LinkedList宣告
      LinkedList<String> llist = new LinkedList<>();
      llist.addFirst("陳會安");  // 新增元素
      System.out.println("addFirst(): " + llist);
      llist.addFirst("江小魚");
      System.out.println("addFirst(): " + llist);
      llist.addLast("陳小安");
      System.out.println("addLast(): " + llist);
      llist.addLast("張無忌");
      System.out.println("addLast(): " + llist); 
      // 顯示集合物件內容
      System.out.print("集合元素:" );
      for ( int i = 0; i < llist.size(); i++ ) 
         System.out.print(" "+ i +":"+ llist.get(i));
      System.out.println();        
      System.out.println("第一個:"+llist.getFirst());
      System.out.println("最後一個:"+llist.getLast());
      llist.removeFirst();   // 刪除元素
      System.out.println("removeFirst(): " + llist);
      llist.removeLast();
      System.out.println("removeLast(): " + llist);       
   }
}