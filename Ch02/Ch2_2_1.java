/* 程式範例: Ch2_2_1.java */
public class Ch2_2_1 { 
   // 主程式
   public static void main(String[] args) {
      final int ROW = 6;     // 定義列數
      final int COLUMN = 5;  // 定義欄數
      // 學生功課表
      int[] classes = { 0, 2, 0, 2, 0,
                        1, 4, 1, 4, 1,
                        5, 0, 5, 0, 5,
                        0, 0, 0, 0, 0,
                        3, 0, 3, 0, 3,
                        0, 0, 0, 0, 0 };
      int sum = 0;   // 上課總節數
      // 一維陣列的走訪
      for ( int i = 0; i < classes.length; i++ )
         System.out.print(i + ": " + classes[i] + " ");
      System.out.println();
      for ( int i = 0; i < ROW; i++ ) // 二維陣列的走訪
         for ( int j = 0; j < COLUMN; j++ )
            if ( classes[i*COLUMN+j]  != 0 )// 是否有課
               sum++;
      // 顯示上課總節數
      System.out.println("上課總節數: "  + sum);
   }
}