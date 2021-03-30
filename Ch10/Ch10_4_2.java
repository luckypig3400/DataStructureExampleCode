/* 程式範例: Ch10_4_2.java */ 
import java.util.*;
public class Ch10_4_2 {
   // 主程式
   public static void main(String[] args) {
      // 集合物件HashMap宣告
      HashMap<String,String> hmap = new HashMap<>();
      String key = "Tom";
      String name = "陳會安";
      System.out.println("新增元素前是否是空的=" +
                          hmap.isEmpty());
      hmap.put("Joe", "陳會安");    // 新增元素
      hmap.put("Jane", "江小魚");
      hmap.put("Tom", "陳小安");
      hmap.put("Hueyan", "陳會安");
      // 顯示尺寸和是否是空的
      System.out.println("新增後尺寸=" + hmap.size());
      System.out.println("是否是空的="+hmap.isEmpty());
      // 顯示集合物件內容
      System.out.println("Hashmap內容: " + hmap);
      // 是否擁有指定元素
      System.out.println("Hashmap是否有[" + key +
                     "]: " + hmap.containsKey(key));
      System.out.println("Hashmap是否有[" + name +
                     "]: " + hmap.containsValue(name));
      // 取得指定的值
      System.out.print("鍵值: " + key);
      System.out.println(" --> 值: " + hmap.get(key));
      // 轉換成Set和Collection物件
      Set<String> keys = hmap.keySet();
      System.out.println("Keys內容: " + keys);
      Collection<String> values = hmap.values();
      System.out.println("Values內容: " + values);
      hmap.remove(key);     // 刪除元素
      System.out.println("Hashmap刪除["+key+"]:"+hmap);
      hmap.clear();         // 清除集合物件
   }
}