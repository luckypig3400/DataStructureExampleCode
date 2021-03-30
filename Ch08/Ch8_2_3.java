/* �{���d��: Ch8_2_3.java */ 
import java.io.*;
public class Ch8_2_3 {
   // ��k: ���J�ƧǪk
   static void insertSort(char[] data) {
      int i,j;                        // �ŧi�ܼ�
      int count = data.length;        // ���o�}�C�ؤo
      char temp;
      for ( i = 1; i < count; i++ ) { // �Ĥ@�h�j��
         temp = data[i];              // �إߪ��
         j = i - 1;                   // �}�l����
         // �ťX�@�Ӵ��J��m
         while ( j >= 0 && temp < data[j] ) {
            data[j+1] = data[j];
            j--;
         }
         data[j+1] = temp;            // ���J�r��
         // ��ܲĤ@�h�j������洫���r��
         System.out.println(i + ": " + new String(data));
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
      insertSort(data);             // ���洡�J�ƧǪk
      // ��ܱƧǫ�r��
      System.out.println("�Ƨǫ�r��:"+new String(data));
   }
}