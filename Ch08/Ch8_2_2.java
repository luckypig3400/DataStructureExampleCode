/* �{���d��: Ch8_2_2.java */ 
import java.io.*;
public class Ch8_2_2 {
   // ��k: ��ܱƧǪk
   static void selectSort(char[] data) {
      int i, j, pos;                  // pos�̤p�r������
      int count = data.length;        // ���o�}�C�ؤo
      char temp;
      for ( i = 0; i < count - 1; i++ ) { // �Ĥ@�h�j��
         pos = i;
         temp = data[pos];
         // ��M�̤p�r�����j��
         for ( j = i + 1; j < count; j++ )// �ĤG�h�j��
            if ( data[j] < temp ) {       // �O�_��p
               pos = j;                   // ���̤p�r��
               temp = data[j];
            }
         data[pos] = data[i];             // �洫��Ӧr��
         data[i] = temp;
         // ��ܲĤ@�h�j������洫���r��
         System.out.println(i+1 + ": "+new String(data));
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
      selectSort(data);             // �����ܱƧǪk
      // ��ܱƧǫ�r��
      System.out.println("�Ƨǫ�r��:"+new String(data));
   }
}