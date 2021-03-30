/* �{���d��: Ch9_3_2.java */ 
import java.io.*;
public class Ch9_3_2 {
   // ��k: ���ɷj�M�k�����j��k
   static boolean interSearch(int[] data, int key,
                              int left, int right) {
      int nextGuess;          // �U�@�ӥi�����
      int offset;             // ���ަ첾
      int range;              // ��Ƚd��
      int index_range;        // ���޽d��
      int temp;
      if ( data[left] == key )// ���F
         return true;
      else if ( left == right ||    // �S�����
                data[left] == data[right] )
              return false;
      else {
         index_range = right - left;// �p����޽d��
         // �p����Ƚd��
         range = data[right] - data[left];
         offset = key - data[left]; // �p����Ȧ첾
         temp = ( offset * index_range ) / range;
         nextGuess = left + temp;   // �U�@�ӥi�����
         if ( nextGuess == left )   // �ˬd�O�_�v�չL
            nextGuess++;
         if ( key < data[nextGuess] )// ���䳡�����j�I�s
           return interSearch(data,key,left,nextGuess-1);
         else // �k�䳡�����j�I�s
           return interSearch(data,key,nextGuess,right);
      }
   }
   // ��k: ���ɷj�M�k
   static boolean interpolation(int[] data,int n,int k) {
      if ( k < data[0] || k > data[n-1] )
         return false;              // �S�����
      else   // �I�s���j��k
         return interSearch(data, k, 0, n-1);
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
            // �I�s���ɷj�M�k���j�M��k
            if ( interpolation(data, len, key) )
               System.out.println("�j�M�����:" + key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}