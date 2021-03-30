/* 程式範例: Ch8_4_1.java */ 
public class Ch8_4_1 {
   // 方法: 顯示排序陣列的內容
   static void showList(int[] data) {
      for ( int i = 0; i < data.length; i++ )
         // 顯示陣列元素
         System.out.print("[" + data[i] + "]");
      System.out.println();
   }
   // 方法: 取出佇列內容回存到排序陣列
   static void refillList(int[] data, Queue[] head) {
      int i, j = 0;
      // 走訪佇列的物件陣列
      for ( i = 0; i < head.length; i++ )
         // 取出佇列資料存回陣列
         while ( !head[i].isQueueEmpty() ) {
            data[j] = head[i].dequeue();
            j++;
         }
   }
   // 方法: 基數排序法
   static void radixSort(int[] data, Queue[] head) {
      int i, j, max, nth_d;
      int exp = 0;           
      int max_d = 0;
      max = data[0];     // 找出陣列中的最大值
      for ( i = 0; i < data.length; i++ )
         if ( data[i] > max ) max = data[i];
      while ( max > 0 ) {// 找出最大值的位數
         max_d++;
         max = max / 10;
      }
      for ( i = 0; i < max_d; i++ ) {// 執行各位數的排序
        exp++;                       // 目前的位數
        for ( j = 0; j < data.length; j++) {// 走訪陣列
          // 計算排序值指定位數的值
          nth_d=data[j]%(int)Math.pow(10.00,(double)exp);
          nth_d=nth_d/(int)Math.pow(10.00,(double)exp-1);
          // 存入各位數的佇列
          head[nth_d].enqueue(data[j]);
        }
        refillList(data, head);
        int temp = (int)Math.pow(10.00,(double)exp-1);
        System.out.print(temp + "位數: ");
        showList(data);
      }
   }   
   // 主程式
   public static void main(String[] args) {
      // 排序的整數陣列
      int[] data = {13,219,532,55,422,164,98,422,334};
      Queue[] head = new Queue[10];     // 佇列物件陣列
      for ( int i = 0; i < head.length; i++ )
          head[i] = new Queue();      // 建立物件陣列元素
      System.out.print("排序前內容: "); // 排序前陣列內容
      showList(data);
      radixSort(data, head);            // 執行基數排序法
      System.out.print("排序後結果: "); // 排序後陣列內容
      showList(data);      
   }
}