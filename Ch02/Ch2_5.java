/* �{���d��: Ch2_5.java */
public class Ch2_5 { 
   // �D�{��
   public static void main(String[] args) {
      // �إߦh��������һݪ��}�C 
      float[] list1={4.0f, 0.0f, 3.0f, 0.0f, 7.0f, 0.0f};
      float[] list2={9.0f, 7.0f, 1.0f, 0.0f, 5.0f, 6.0f};
      Poly a = new Poly(list1);   // �إߦh��������
      Poly b = new Poly(list2);
      a.printPoly();  // ��ܦh���� 
      b.printPoly();
   }
}