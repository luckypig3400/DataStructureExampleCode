/* 程式範例: Ch4_4_2.java */
public class Ch4_4_2 { 
   static int[][] maze = { // 迷宮陣列,數字0可走, 1不可走
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
   // 方法: 走迷宮的遞迴方法
   static boolean findPath(int x, int y) {
      if ( x == 1 && y == 1 ) {      // 是否是迷宮出口
         maze[x][y] = 2;             // 記錄最後走過的路
         return true;
      }
      else if ( maze[x][y] == 0 ) {  // 是不是可以走的路
             maze[x][y] = 2;         // 記錄己經走過的路
             if ( findPath(x - 1, y) ||     // 往上
                  findPath(x + 1, y) ||     // 往下
                  findPath(x, y - 1) ||     // 往左
                  findPath(x, y + 1) )      // 往右
                 return true;
             else {
                 maze[x][y] = 0;     // 此路不通取消記號
                 return false;
             }
           }
           else return false;
   }
   // 主程式
   public static void main(String[] args) {
      findPath(5, 8);                  // 呼叫遞迴方法
      System.out.println("迷宮路徑圖(從右下到左上角):");
      for ( int i = 0; i <= 6; i++) {  // 顯示迷宮圖形
         for ( int j = 0; j <= 9; j++) // 顯示座標值
            System.out.print(maze[i][j]+" ");
         System.out.println();
      }
      System.out.println("數字 1: 牆壁");
      System.out.println("數字 2: 走過的路徑");
   }
}