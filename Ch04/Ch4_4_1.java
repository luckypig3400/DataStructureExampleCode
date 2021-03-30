/* 程式範例: Ch4_4_1.java */
public class Ch4_4_1 { 
   // 主程式
   public static void main(String[] args) {
      int[][] maze = { // 迷宮陣列,數字0可走, 1不可走
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
      Stack st = new Stack();  // 建立堆疊物件
      int x = 5;               // 迷宮入口座標
      int y = 8;
      while ( x != 1 || y != 1 ) { // 主迴圈
         maze[x][y] = 2;           // 標示為已走過的路
         if ( maze[x-1][y] <= 0 ) {// 往上方走
            x = x - 1;             // 座標x減1
            st.push(x);            // 存入路徑
            st.push(y);
         }
         else if ( maze[x+1][y] <= 0 ) {// 往下方走
              x = x + 1;            // 座標x加1
              st.push(x);           // 存入路徑
              st.push(y);
            }
            else if ( maze[x][y-1] <= 0 ) { // 往左方走
                 y = y - 1;            // 座標y減1
                 st.push(x);           // 存入路徑
                 st.push(y);
              }
              else if ( maze[x][y+1] <= 0 ) {// 往右方走
                   y = y + 1;          // 座標y加1
                   st.push(x);         // 存入路徑
                   st.push(y);
                }
                else {  // 沒有路可走:迴溯
                     maze[x][y] = 3;   // 表示是迴溯的路
                     y = st.pop();     // 退回一步
                     x = st.pop();
                }
      }
      maze[x][y] = 2;                  // 標示最後位置
      System.out.println("迷宮路徑圖(從右下到左上角):");
      for ( int i = 0; i <= 6; i++) {  // 顯示迷宮圖形
         for ( int j = 0; j <= 9; j++) // 顯示座標值
            System.out.print(maze[i][j]+" ");
         System.out.println();
      }
      System.out.println("數字 1: 牆壁");
      System.out.println("數字 2: 走過的路徑");
      System.out.println("數字 3: 回溯路徑");
   }
}