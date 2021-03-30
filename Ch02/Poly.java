/* 程式範例: Poly.java */
class Term {       // 項類別 
   float coef;     // 係數
   int exp;        // 指數
};
public class Poly {         // 多項式類別
   public final int MAX_TERMS = 100;  // 最大項目數
   public static Term[] termArr;   // 多項式的物件陣列
   public static int freePos = 0;  // 可用索引位置
   public int begin, end;   // 多項式索引開始與結束
   // 建構子: 建立多項式物件
   public Poly(float[] array) {
      if ( termArr == null ) { // 是否已經建立物件陣列
         // 建立多項式物件陣列
         termArr = new Term[MAX_TERMS];
         for ( int i = 0; i < termArr.length; i++ )
            termArr[i] = new Term();  // 建立陣列元素
      }
      begin = freePos;    // 多項式開始索引
      end = freePos - 1;  // 多項式結束索引
      for (int i = array.length - 1; i >= 0; i-- )
         if ( array[i] != 0 ) {
            newTerm(array[i], i);   // 新增項物件
            end++;
      }
   }
   // 方法: 新增多項式項目
   public void newTerm(float c, int e) {
      if ( freePos > termArr.length ) {
          System.out.println("多項式的項目超過範圍！");
          return;
      }
      termArr[freePos].coef = c;  // 係數
      termArr[freePos].exp = e;   // 指數
      freePos++;
   }
   // 方法: 顯示多項式
   public void printPoly() {
      float c; int e;
      for (int i = begin; i <= end; i++) {
         c = termArr[i].coef;
         e = termArr[i].exp;
         System.out.print(c + "X^" + e);
         if ( i != end ) System.out.print("+");
      }
      System.out.println();
   }
}