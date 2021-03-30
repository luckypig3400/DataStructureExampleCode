/* �{���d��: Ch8_2_4.java */ 
import java.io.*;
public class Ch8_2_4 {
   static final int H_LEN = 3;       // h��C���̤j��
   // ��k: �¦ձƧǪk
   static void shellSort(char[] data) {
      int[] incs = { 4, 2, 1 };      // �]�wh�ǦC���W�q
      int pos;                       // �B�z���ثe����
      int h;                         // h�ǦC���첾�q
      int count = data.length;       // ���o�}�C�ؤo
      int i, j;
      char temp;
      for ( i = 0; i < H_LEN ; i++ ) {// �B�zh�ǦC���j��
         h = incs[i];                 // ���oh�첾�q
         for ( j = h; j < count; j++ ) { // �洫�j��
            temp = data[j];          // �O�d��
            pos = j - h;             // �p�����
            while ( pos >= 0  &&     // ���
                    temp < data[pos] && j <= count) {
               data[pos + h] = data[pos];  // �洫
               pos = pos - h;        // �U�@�ӳB�z����
            }
            data[pos + h] = temp;    // �P�̫ᤸ���洫
         }
         // ��ܳB�z�᪺�r��
         System.out.print("h�ǦC" + h);
         System.out.println(": " + new String(data));
      }
   }
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // �ܼƫŧi
      int len;
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("�п�J�ƧǦr��:");
      System.out.flush();           // �M���w�İ�
      str = input.readLine();       // Ū���@�C
      input.close();                // ������y
      len = str.length();           // ���o�r�����
      char[] data = new char[len];  // �r���}�C�ŧi
      data = str.toCharArray();     // �ഫ���}�C
      shellSort(data);              // �����¦ձƧǪk
      // ��ܱƧǫ�r��
      System.out.println("�Ƨǫ�r��:"+new String(data));
   }
}