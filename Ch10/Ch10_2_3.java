/* 程式範例: Ch10_2_3.java */ 
import java.util.*;
public class Ch10_2_3 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件HashSet宣告
      HashSet<String> hset = new HashSet<>();
      String name = "Joe Chen";
      String name1 = "Tom Wang";
      hset.add("Joe Chen");      // 新增元素
      hset.add("Tom Wang");
      hset.add("Jane Chiang");
      // 集合物件TreeSet宣告
      TreeSet<String> tset = new TreeSet<>(hset);
      // 顯示集合物件內容
      System.out.print("TreeSet內容: ");
      System.out.println(tset);
      tset.add("Marry Lee");
      tset.add("Tony Chen");
      // 顯示集合物件內容
      System.out.print("新增二元素: ");
      System.out.println(tset);
      System.out.println("第一個: " + tset.first());
      System.out.println("最後一個: " + tset.last());        
      // 集合物件的部分內容
      System.out.print("在[" + name + "]元素前: ");
      System.out.println(tset.headSet(name));
      System.out.print("在[" + name + "]元素後: ");
      System.out.println(tset.tailSet(name)); 
      System.out.print("在[" + name + "]和[" + name1 +
                       "]之間: " );
      System.out.println(tset.subSet(name, name1));       
   }
}