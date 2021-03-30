/* 程式範例: Ch10_3_2.java */ 
import java.util.*;
public class Ch10_3_2 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件ArrayList宣告
      ArrayList<String> alist = new ArrayList<>(4);
      String name = "陳會安";
      alist.add("陳會安");    // 新增元素
      alist.add("江小魚");
      alist.add("陳小安");
      alist.add("張無忌");
      // 顯示尺寸和元素
      System.out.println("物件尺寸=" + alist.size());
      System.out.println("集合元素: " + alist);
      // 插入指定位置的元素
      alist.add(2, "陳會安");
      // 顯示集合物件內容
      System.out.print("集合元素:" );
      for ( int i = 0; i < alist.size(); i++ ) 
         System.out.print(" "+ i +":"+ alist.get(i));
      System.out.println();
      // 搜尋元素
      System.out.println("搜尋: " + name);
      System.out.println("indexOf():" + 
                          alist.indexOf(name));
      System.out.println("lastIndexOf():" +
                          alist.lastIndexOf(name));
      alist.set(3, "陳大安"); // 取代元素
      System.out.println("取代元素3: " + alist);
      alist.remove(0);     // 刪除元素
      System.out.println("刪除元素0: " + alist);        
   }
}