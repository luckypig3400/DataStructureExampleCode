/* 程式範例: sMatrix.java */ 
public class sMatrix {     // 稀疏矩陣的巢狀類別
   public int rows;        // 列數
   public int cols;        // 欄數
   public int numOfTerms;  // 項目數
   public nTerm[] smArr;   // 稀疏矩陣的物件陣列
   class nTerm {           // 項目的內層類別
      public int row;      // 列號
      public int col;      // 欄號
      public int value;    // 值
   }
   // 建構子(1): 建立稀疏矩陣物件
   public sMatrix(int maxSize, int maxRow, int maxCol) {
      rows = maxRow;  cols = maxCol;      // 初始成員變數
      numOfTerms = 0;
      smArr = new nTerm[maxSize];// 建立稀疏矩陣物件陣列
      for ( int i = 0; i < smArr.length; i++ )
         smArr[i] = new nTerm();
   }
   // 建構子(2): 建立稀疏矩陣物件
   public sMatrix(int maxSize,
                 int maxRow, int maxCol, int[][] array) {
      smArr = new nTerm[maxSize];// 建立稀疏矩陣物件陣列
      for ( int i = 0; i < smArr.length; i++ )
         smArr[i] = new nTerm();
      rows = maxRow; cols = maxCol;       // 初始成員變數
      numOfTerms = 0;
      for ( int i = 0; i < maxRow; i++ )// 二維陣列的走訪
         for ( int j = 0; j < maxCol; j++ )
            if ( array[i][j] != 0 ) {     // 元素有值
               smArr[numOfTerms].row = i; // 列數
               smArr[numOfTerms].col = j; // 欄數
               // 元素值
               smArr[numOfTerms].value = array[i][j];
               numOfTerms++;
            }
   }
   // 方法: 顯示稀疏矩陣
   public void printMatrix() {
      // 顯示稀疏矩陣尺寸和項目數
      System.out.print(" Size: " + rows + " X " + cols);
      System.out.println(" Items: " + numOfTerms);
      System.out.println("\trow\tcol\tvalue");
      // 顯示稀疏矩陣的各項目座標與值
      for (int i = 0; i < numOfTerms; i++) {
        System.out.print("\t" + smArr[i].row);
        System.out.print("\t" + smArr[i].col);
        System.out.println("\t" + smArr[i].value);
      }
   }
}