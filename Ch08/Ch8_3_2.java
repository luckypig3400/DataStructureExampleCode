/* �{���d��: Ch8_3_2.java */ 
import java.io.*;
public class Ch8_3_2 {
   // ���j��k: �ֳt�ƧǪk�����j���
   static void q_sort(char[] data, int left, int right) {
      char partition;             // ���Ϊ��r��
      char temp;
      int i, j, k;
      if ( left < right ) {// ���j�������, �O�_�~�����
         i = left;                // ���Ϊ��̥�����
         j = right + 1;           // ���Ϊ��̥k����
         partition = data[left];  // ���Ĥ@�Ӥ���
         do { // �D�j����O�q��Ӥ�V��M�洫����
            do {                  // �q�����k��
               i++;
            } while( i <= right && data[i] < partition );
            do {                  // �q�k������
               j--;
            } while( j >= 0 && data[j] > partition );
            if ( i < j ) {
               temp = data[i];    // �洫���
               data[i] = data[j];
               data[j] = temp;
            }
         } while( i < j );
         temp = data[left];       // �洫���
         data[left] = data[j];
         data[j] = temp;
         // ��ܳB�z�����r��
         System.out.print("��X���G: ");
         for ( k = left; k <= right; k++)
            System.out.print(data[k]);
         System.out.println();    // ����
         q_sort(data, left, j-1); // �ֳt�Ƨǻ��j�I�s
         q_sort(data, j+1, right);// �ֳt�Ƨǻ��j�I�s
      }
   }
   // ��k: �ֳt�ƧǪk
   static void quickSort(char[] data) {
      q_sort(data, 0, data.length-1);
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
      quickSort(data);              // ����ֳt�ƧǪk
      // ��ܱƧǫ�r��
      System.out.println("�Ƨǫ�r��:"+new String(data));
   }
}