/* 程式範例: Polynomial.java */ 
class PNode {     // 多項式串列節點類別
   float coef;    // 係數
   int exp;       // 指數
   PNode next;    // 指下一個節點的指標
   // 建構子
   public PNode(float coef, int exp) {
      this.coef = coef;
      this.exp = exp;
      next = null;
   }
};
public class Polynomial {   // 多項式鏈結串列類別
   public PNode first;      // 串列的開頭指標
   // 建構子: 建立多項式鏈結串列
   public Polynomial(float[] array) {
      PNode ptr, newnode;
      first = new PNode(0.0f, -1); // 建立開頭節點
      ptr = first;                 // 前一個節點指標
      for ( int i = array.length-1; i >= 0; i-- ) {
         if ( array[i] != 0.0f ) {  // 建立節點物件
            newnode = new PNode(array[i], i);
            ptr.next = newnode;    // 連結新節點
            ptr = newnode;         // 成為前一個節點
         }
      }
      ptr.next = first;  // 連結第1個節點, 建立環狀串列
   }
   // 方法: 顯示多項式串列
   public void printPoly() {
      PNode ptr = first.next;  // 串列真正的開頭
      float c;
      int e;
      while ( ptr != first ) { // 顯示主迴圈
         c = ptr.coef;
         e = ptr.exp;
         System.out.print(c + "X^" + e);
         ptr = ptr.next;       // 下一個節點
         if ( ptr != first ) System.out.print(" + ");
      }
      System.out.println();
   }
}