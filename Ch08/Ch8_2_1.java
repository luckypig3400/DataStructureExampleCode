/* �{���d��: Ch8_2_1.java */ 
import java.io.*;
public class Ch8_2_1 {
   // ��k: �w�j�ƧǪk
   static void bubbleSort(char[] data) {
      int i,j;                        // �ܼƫŧi
      int count = data.length;        // ���o�}�C�ؤo
      char temp;
      for ( j = count; j > 1; j-- ) { // �Ĥ@�h�j��
         for ( i = 0; i < j - 1; i++ )// �ĤG�h�j��
            // ����۾F���}�C����
            if ( data[i+1] < data[i] ) {
               temp = data[i+1];      // �洫�}�C����
               data[i+1] = data[i];
               data[i] = temp;
            }
         // ��ܲĤ@�h�j������洫���r��
         System.out.print(count-j+1);
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
      bubbleSort(data);             // ����w�j�ƧǪk
      // ��ܱƧǫ�r��
      System.out.println("�Ƨǫ�r��:"+new String(data));
   }
}