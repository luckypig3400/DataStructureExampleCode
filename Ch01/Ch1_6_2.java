/* �{���d��: Ch1_6_2.java */
import java.io.*;
public class Ch1_6_2 {
   // ��k: ��ܶO��ƦC
   static void fibonacci(int n) {
      int fn;                        // F(n)�ܼ�
      int fn2;                       // F(n-2)�ܼ�
      int fn1;                       // F(n-1)�ܼ�
      int i;
      if ( n <= 1 )                  // ���ƬO�_�p��1
         System.out.println("["+n+"]"); // ��ܶO��ƦC
      else {
         fn2 = 0;                    // �]�w F(n-2)
         fn1 = 1;                    // �]�w F(n-1)
         System.out.print("[0][1]"); // ��ܫe�G��
         for ( i = 2; i <= n; i++ ) {// ��ܼƦC���j��
            fn = fn2 + fn1;          // �p��U�@�붵
            System.out.print("["+fn+"]");  // ��ܼƦC
            fn2 = fn1;               // ���] F(n-2)
            fn1 = fn;                // ���] F(n-1)
         }
         System.out.println();
      }
   }
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �ܼƫŧi
      int n = 0;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while( n != -1 ) {
         System.out.print("�п�J�ƦC����(-1����)==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         n = Integer.parseInt(in.readLine());
         if ( n > 0 ) {
            // �I�s��k
            fibonacci(n);        // �I�s�O��ƦC��k
         }
      }
      in.close();                // ������y
   }
}