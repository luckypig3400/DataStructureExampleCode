/* �{���d��: Ch1_5_2.java */
import java.io.*;
public class Ch1_5_2 {
   // ��k: �p��n!����
   static long factorial(int n) {
      if ( n == 1 )   // �פ����
         return 1;
      else  
         return n * factorial(n-1);
   }
   // �D�{��
   public static void main(String[] args) 
                                    throws Exception {
      // �ܼƫŧi
      int no = 0;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while( no != -1 ) {
         System.out.print("�п�J���h��(-1����)==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         no = Integer.parseInt(in.readLine());
         if ( no > 0 ) {
            // ��ƪ��I�s
            System.out.print(no+"!��ƭ�: ");
            System.out.println(factorial(no));
         }
      }
      in.close();                // ������y
   }
}