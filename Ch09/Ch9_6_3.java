/* 程式範例: Ch9_6_3.java */ 
import java.io.*;
class Node {     // 節點類別
   int data;     // 節點資料
   Node next;    // 參考下一個節點
   // 建構子
   public Node(int data) {
      this.data = data;
      this.next = null;
   }
}
class HashTable {  // 雜湊表類別
   private Node[] hashTable = new Node[10]; // 雜湊表陣列
   // 建構子: 建立雜湊表
   public HashTable(int[] array) {
      Node ptr;             // 開始指標
      Node newnode;         // 新節點指標
      int pos;              // 索引位置變數
      for ( int i = 0; i < hashTable.length; i++ )
          hashTable[i] = null;    // 初始陣列指標
      // 使用迴圈建立雜湊表
      for ( int i = 0; i < array.length; i++ ) {
         // 建立節點物件
         newnode = new Node(array[i]);
         // 呼叫雜湊函數計算索引位置
         pos = hashFunc(array[i]);
         ptr = hashTable[pos];      // 取得開始指標
         if ( ptr != null ) {       // 是否是第1個節點
            while ( ptr.next != null ) // 找出最後1個節點
               ptr = ptr.next;         // 下一個節點
            ptr.next = newnode;        // 鏈結節點
         } else
            hashTable[pos] = newnode;  // 第1個節點
      }
   }
   // 方法: 雜湊函數
   private int hashFunc(int key) { return key % 10; }
   // 方法: 鏈結法的雜湊搜尋
   public boolean chainHashSearch(int key) {
      Node ptr;             // 開始指標
      int pos;              // 位置變數
      // 呼叫雜湊函數計算位置
      pos = hashFunc(key);
      ptr = hashTable[pos];        // 取得開始指標
      while ( ptr != null )        // 鏈結法的搜尋迴圈
         if ( ptr.data == key )    // 是否找到了
            return true;
         else
            ptr = ptr.next;        // 下一個節點
      return false;
   }
   // 方法: 顯示雜湊表的內容
   public void printHashTable() {
      Node ptr;               // 開始指標
      System.out.print("雜湊表內容: ");
      for ( int i = 0; i < hashTable.length; i++ ) {
         System.out.print("\n" + i + "==> ");
         ptr = hashTable[i];       // 取得開始指標
         while ( ptr != null ) {   // 顯示串列的迴圈
            System.out.print("[" +ptr.data + "]");
            ptr = ptr.next;        // 下一個節點
         }
      }
      System.out.println();
   }
}
// 主類別
public class Ch9_6_3 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 搜尋的鍵值資料
      int[] data = {37, 25, 11, 29, 34, 46, 44, 35};
      int key = 0;              // 搜尋鍵值
      HashTable ht = new HashTable(data); // 建立雜湊表
      ht.printHashTable();                // 顯示雜湊表
      System.out.println();
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("請輸入搜尋值(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // 呼叫鏈結法的雜湊搜尋方法
            if ( ht.chainHashSearch(key) )
               System.out.println("搜尋到鍵值:"+key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}