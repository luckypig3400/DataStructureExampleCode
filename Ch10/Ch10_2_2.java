/* 程式範例: Ch10_2_2.java */ 
import java.util.*;
public class Ch10_2_2 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件HashSet宣告
      HashSet<String> hset = new HashSet<>();
      String name = "江小魚";
      String name1 = "楊過";
      System.out.println("新增元素前是否是空的=" + 
                          hset.isEmpty());
      hset.add("陳會安");    // 新增元素
      hset.add("江小魚");
      hset.add("陳小安");
      // 顯示尺寸和是否是空的
      System.out.println("新增後尺寸=" + hset.size());
      System.out.println("是否是空的="+hset.isEmpty());
      // 顯示集合物件內容
      System.out.print("HashSet內容: ");
      System.out.println(hset);        
      // 是否擁有指定元素
      System.out.println("HashSet是否有[" + name + 
                         "]: " + hset.contains(name));
      System.out.println("HashSet是否有[" + name1 + 
                         "]: " + hset.contains(name1));
      // 刪除元素
      hset.remove(name);
      System.out.print("HashSet刪除[" + name + "]:");
      System.out.println(hset);
      hset.clear();   // 清除集合物件
   }
}