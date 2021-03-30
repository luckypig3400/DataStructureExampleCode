/* �{���d��: Ch9_3_1.java */ 
import java.io.*;
public class Ch9_3_1 {
   // ��k: �G���j�M�k
   static boolean binary(int[] data,int l,int h,int k) {
      int m;                     // �ŧi������������
      if ( l > h )               // ���j���פ����
         return false;           // �S�����
      else {
         m = (l + h) / 2;        // �p�⤤�����ޭ�
         if ( k == data[m] ) return true;    // ���
         else if ( k < data[m] )// �e�b����
                 return binary(data, l, m-1, k);
              else              // ��b����
                 return binary(data, m+1, h, k);
      }
   }
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int[] data =              // �j�M���}�C
            {1, 8, 9, 15, 25, 33, 42, 66, 74, 81, 90};
      int key = 0;              // �j�M���
      int len = data.length;    // ���o�}�C�ؤo
      System.out.print("��l�}�C: ");
      for ( int i = 0; i < len; i++ )
         System.out.print("["+data[i]+"]");// ��ܰ}�C
      System.out.println();
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("�п�J�j�M��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // �I�s�G���j�M�k���j�M��k
            if ( binary(data, 0, len, key) )
               System.out.println("�j�M�����:" + key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}