/* �{���d��: Ch3_6.java */
public class Ch3_6 { 
   // �D�{��
   public static void main(String[] args) {
      // �إߦh��������һݪ��}�C
      float[] list1 = { 4.0f,0.0f,3.0f,0.0f,7.0f,0.0f };
      float[] list2 = { 9.0f,7.0f,1.0f,0.0f,5.0f,6.0f };
      Polynomial a=new Polynomial(list1); // �h������C1
      Polynomial b=new Polynomial(list2); // �h������C2
      a.printPoly();     // ��ܦh����1
      b.printPoly();     // ��ܦh����2
   }
}