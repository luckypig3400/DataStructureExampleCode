/* �{���d��: Ch9_2.java */
import java.io.*; 
public class Ch9_2 {
   // ��k: �`�Ƿj�M�k
   static boolean sequential(int[] data,int len,int k) {
      for ( int i = 0; i < len; i++ ) // �j�M�j��
         // ����O�_�O���
         if ( data[i] == k ) return true;
      return false;
   }
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int[] data =              // �j�M���}�C
         {9, 25, 33, 74, 90, 15, 1, 8, 42, 66, 81};
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
            // �I�s�`�Ƿj�M�k���j�M��k
            if ( sequential(data, len, key) )
               System.out.println("�j�M�����:" + key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}