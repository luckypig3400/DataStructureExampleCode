/* 程式範例: Ch2_4_2.java */ 
// 稀疏矩陣類別
class sMatrix_Transpose extends sMatrix {
   // 建構子: 建立稀疏矩陣
   public sMatrix_Transpose(int maxSize,
                 int maxRow, int maxCol, int[][] array) {
      super(maxSize, maxRow, maxCol, array);
   }
   // 方法: 轉置稀疏矩陣
   public sMatrix transposeMatrix() {
      sMatrix temp = new sMatrix(20, cols, rows);
      temp.numOfTerms = numOfTerms;   // 元素數
      if ( numOfTerms > 0 ) { // 稀疏矩陣不是空的
         int pos = 0;
         for ( int c = 0; c < cols; c++ ) // 以欄轉置
            for ( int i = 0; i < numOfTerms; i++ )
               if ( smArr[i].col == c ) { // 依序找尋各欄
                  temp.smArr[pos].row = c;
                  temp.smArr[pos].col = smArr[i].row;
                  temp.smArr[pos].value = smArr[i].value;
                  pos++;
               }
      }
      return temp;
   }
}
// 主類別
public class Ch2_4_2 {
   // 主程式
   public static void main(String[] args) {
      // 稀疏矩陣
      int[][] sparse = { {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 9, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                         {0, 0, 0, 0, 3, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 6, 0, 0} };
      // 建立稀疏矩陣物件
      sMatrix_Transpose a =
              new sMatrix_Transpose(20, 5, 10, sparse);
      a.printMatrix();  // 顯示稀疏矩陣
      // 轉置稀疏矩陣
      sMatrix b = a.transposeMatrix();
      b.printMatrix();
   }
}