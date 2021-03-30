/* 程式範例: Ch3_6.java */
public class Ch3_6 { 
   // 主程式
   public static void main(String[] args) {
      // 建立多項式物件所需的陣列
      float[] list1 = { 4.0f,0.0f,3.0f,0.0f,7.0f,0.0f };
      float[] list2 = { 9.0f,7.0f,1.0f,0.0f,5.0f,6.0f };
      Polynomial a=new Polynomial(list1); // 多項式串列1
      Polynomial b=new Polynomial(list2); // 多項式串列2
      a.printPoly();     // 顯示多項式1
      b.printPoly();     // 顯示多項式2
   }
}