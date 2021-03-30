/* 程式範例: Ch2_5.java */
public class Ch2_5 { 
   // 主程式
   public static void main(String[] args) {
      // 建立多項式物件所需的陣列 
      float[] list1={4.0f, 0.0f, 3.0f, 0.0f, 7.0f, 0.0f};
      float[] list2={9.0f, 7.0f, 1.0f, 0.0f, 5.0f, 6.0f};
      Poly a = new Poly(list1);   // 建立多項式物件
      Poly b = new Poly(list2);
      a.printPoly();  // 顯示多項式 
      b.printPoly();
   }
}