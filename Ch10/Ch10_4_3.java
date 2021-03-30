/* 程式範例: Ch10_4_3.java */ 
import java.util.*;
public class Ch10_4_3 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件HashMap宣告
      HashMap<String,String> hmap = new HashMap<>();
      String key1 = "Joe";
      String key2 = "Tom";
      hmap.put("Joe", "陳會安");    // 新增元素
      hmap.put("Jane", "江小魚");
      hmap.put("Tom", "陳小安");
      // 集合物件TreeMap宣告
      TreeMap<String,String> tmap = new TreeMap<>(hmap);
      // 顯示集合物件內容
      System.out.println("TreeMap內容: " + tmap);
      tmap.put("Marry", "楊過" );
      tmap.put("Tony", "小龍女" );
      // 顯示集合物件內容
      System.out.println("新增二元素: " + tmap);
      System.out.println("第一個: "+tmap.firstKey());
      System.out.println("最後一個: "+tmap.lastKey());
      // 集合物件的部分內容
      System.out.print("在[" + key1 + "]鍵值前: ");
      System.out.println(tmap.headMap(key1));
      System.out.print("在[" + key2 + "]鍵值後: ");
      System.out.println(tmap.tailMap(key2));
      System.out.print("在[" + key1 + "]和[" + key2 +
                       "]之間: " );
      System.out.println(tmap.subMap(key1, key2));
   }
}