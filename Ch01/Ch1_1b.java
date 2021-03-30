/* 程式範例: Ch1_1b.java */
public class Ch1_1b { 
   // 主程式
   public static void main(String[] args) {
      // 儲存各次成績的陣列
      int[] t = { 81,93,77,59,69,85,90,83,100,75 };
      int sum = 0;                    // 總分
      float average;                  // 平均
      for ( int i = 0; i < t.length; i++ )
         sum += t[i];                 // 計算總分
      average = sum / 10;             // 計算平均
      System.out.println("總分: "+sum);    // 顯示總分
      System.out.println("平均: "+average);// 顯示平均
   }
}