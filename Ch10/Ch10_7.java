/* 程式範例: Ch10_7.java */ 
import java.util.*;
class Customer {   // Customer類別宣告
   // 成員資料
   public String name; // 姓名
   public int age;     // 年齡
   // 建構子: 使用參數設定成員資料初始值
   public Customer(String n, int v) {
      name = n;        // 設定姓名
      age = v;         // 設定年齡
   }
}
// 實作Comparator介面的類別
class myComparator implements Comparator<Customer> {
   // 比較兩個元素
   public int compare(Customer ele1, Customer ele2) {
      // 比較客戶姓名
      return ele1.name.compareTo(ele2.name);
   }
}
// 主類別
public class Ch10_7 {
   // 主程式
   public static void main(String[] args) {
      Customer temp;      // 建Customer立物件實例
      Customer joe = new Customer("Joe", 35);
      Customer jane = new Customer("Jane", 30);
      Customer tom  = new Customer("Tom", 28);
      Customer mary  = new Customer("Mary", 27);
      // 建立Comparator物件
      myComparator comparator = new myComparator();
      // 集合物件TreeSet宣告
      TreeSet<Customer> tset = new TreeSet<>(comparator);
      tset.add(joe);      // 新增元素
      tset.add(tom);
      tset.add(jane);
      tset.add(mary);
      // 使用Iterator介面顯示TreeSet元素
      Iterator<Customer> iterator = tset.iterator();
      System.out.println("TreeSet集合(iterator):");
      while (iterator.hasNext()) {
         // 取得Customer物件
         temp = iterator.next();
         // 顯示客戶資料
         System.out.println(" " + temp.name +
                       "(" + temp.age + ")");
      }  
   }
}