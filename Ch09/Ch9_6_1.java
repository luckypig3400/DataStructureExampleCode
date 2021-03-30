/* 程式範例: Ch9_6_1.java */ 
import java.io.*;
class HashTable {  // 雜湊表類別
   private int[] hashTable = new int[10];  // 雜湊表陣列
   // 建構子: 建立雜湊表
   public HashTable(int[] array) {
      int pos;                 // 索引位置變數
      int temp, i;
      for ( i = 0; i < hashTable.length; i++ )
         hashTable[i] = -1;    // 清除雜湊表
      // 使用迴圈建立雜湊表
      for ( i = 0; i < array.length; i++ ) {
         // 呼叫雜湊函數計算索引位置
         pos = hashFunc(array[i]);
         temp = pos;           // 保留開始的索引位置
         while ( hashTable[temp] != -1 ) { // 找尋位置
            // 找尋下一個位置
            temp = ( temp + 1 ) % hashTable.length;
            if ( pos == temp ) {       // 雜湊表是否己滿
               System.out.println("雜湊表己滿!");
               return;
            }
         }
         hashTable[temp] = array[i];   // 存入雜湊表
      }
   }
   // 方法: 雜湊函數
   private int hashFunc(int key) { return key % 10; }
   // 方法: 線性探測法的雜湊搜尋
   public boolean lineHashSearch(int key) {
      int pos;                 // 位置變數
      int temp;
      // 呼叫雜湊函數計算位置
      pos = hashFunc(key);
      temp = pos;              // 保留開始的索引位置
      while ( hashTable[temp] != key && // 線性探測迴圈
         hashTable[temp] != -1 ) {
         // 使用餘數將陣列變為環狀來計算下一個位置
         temp = ( temp + 1 ) % hashTable.length;
         if ( pos == temp )            // 查詢結束
            return false;              // 已滿沒有找到
      }
      if ( hashTable[temp] == -1 )     // 是否是空白
         return false;                 // 沒有找到
      else
         return true;                  // 找到了
   }
   // 方法: 顯示雜湊表的內容
   public void printHashTable() {
      for ( int i = 0; i < hashTable.length; i++ )
         System.out.print("[" + hashTable[i] + "]");
      System.out.println();
   }
}
// 主類別
public class Ch9_6_1 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 搜尋的鍵值資料
      int[] data = {37, 25, 11, 29, 34, 46, 44, 35};
      int key = 0;              // 搜尋鍵值
      HashTable ht = new HashTable(data); // 建立雜湊表
      System.out.print("雜湊表內容: ");
      ht.printHashTable();                // 顯示雜湊表
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("請輸入搜尋值(-1結束) ==> ");
         System.out.flush();           // 清除緩衝區
         // 讀取一列, 轉換成整數
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // 呼叫線性探測法的雜湊搜尋方法
            if ( ht.lineHashSearch(key) )
               System.out.println("搜尋到鍵值:" + key);
            else
               System.out.println("沒有搜尋到鍵值:"+key);
      }
      input.close();                // 關閉串流
   }
}