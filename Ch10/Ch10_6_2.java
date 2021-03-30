/* 程式範例: Ch10_6_2.java */ 
import java.util.*;
public class Ch10_6_2 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件ArrayList宣告
      ArrayList<String> alist = new ArrayList<>(4);
      alist.add("陳會安");      // 新增元素
      alist.add("江小魚");
      alist.add("陳小安");
      alist.add("張無忌");
      System.out.println("ArrayList元素: " + alist);
      // 使用ListIterator介面顯示List元素
      System.out.print("List元素(ListIterator):");
      ListIterator<String> iterator=alist.listIterator(0);
      while (iterator.hasNext() )
         System.out.print(" " + iterator.next());
      System.out.println();
      // 使用ListIterator介面反向顯示List元素
      System.out.print("反向顯示元素(ListIterator):");
      ListIterator<String> iterator1 =
                    alist.listIterator(alist.size());
      while (iterator1.hasPrevious() )
         System.out.print(" "+iterator1.previous());
      System.out.println();
   }
}