/* 程式範例: Ch2_1_4.java */
public class Ch2_1_4 { 
   // 主程式
   public static void main(String[] args) {
      // 學生功課表
      int[][] courses={ {0, 2, 0, 2, 0},
                        {1, 4, 1, 4, 1},
                        {5, 0, 5, 0, 5},
                        {0, 0, 0, 0, 0},
                        {3, 0, 3, 0, 3},
                        {0, 0, 0, 0, 0} };
      int sum = 0;   // 上課總節數
      // 二維陣列的走訪
      for ( int i = 0; i < courses.length; i++ )
         for ( int j = 0; j < courses[i].length; j++ )
            if ( courses[i][j] != 0 ) // 是否有課
               sum++;
      // 顯示上課總節數
      System.out.println("上課總節數: " + sum);
   }
}