/* 程式範例: Ch2_4_1.java */ 
public class Ch2_4_1 {
   // 主程式
   public static void main(String[] args) {
      // 稀疏矩陣
      int[][] sparse = {{0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 9, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 6, 0, 0} };
      // 建立稀疏矩陣物件
      sMatrix a = new sMatrix(20, 5, 10, sparse);
      a.printMatrix();  // 顯示稀疏矩陣
   }
}