/* �{���d��: Ch8_3_1.java */ 
import java.io.*;
public class Ch8_3_1 {
   // ��k: �X�ְ}�C
   static void merge(char[] data,
                     int start, int mid, int end) {
      int left = start;            // ���b��������
      int right = mid + 1;         // �k�b��������
      int i;
      // �t�m�X�ְϬq�һݪ��}�C
      char[] finalData = new char[end-start+1];
      // �X�֥��k��b�����Ϭq���j��
      for (i = 0; i < (end-start+1); i++) {
         if ( left > mid ) {
            finalData[i] = data[right];
            right++;
         } else if ( right > end ) {
            finalData[i] = data[left];
            left++;
         } else if (data[left] < data[right]) {
            finalData[i] = data[left];
            left++;
         } else {
            finalData[i] = data[right];
            right++;
         }
      }
      // �ƻs���l�}�C���Ϭq
      for (i = 0; i < (end - start + 1); i++) {
          data[start + i] = finalData[i];
      } // ��ܦX�᪺֫�r��
      System.out.print(start + "-" + mid + "-" + end);
      System.out.println(":["+new String(finalData)+"]");
   }
   // ���j��k: �X�ֱƧǪk
   static void mergeSort(char[] data,int start,int end) {
      int mid;
      if ( end <= start ) return;    // �פ����
      mid = (start + end) / 2;       // ��������
      mergeSort(data, start, mid);   // ���j�Ƨǥ��b��
      mergeSort(data, mid+1, end);   // ���j�Ƨǥk�b��
      merge(data, start, mid, end);  // �X�ְ}�C
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
      mergeSort(data, 0, len-1);    // ����X�ֱƧǪk
      // ��ܱƧǫ�r��
      System.out.println("�Ƨǫ�r��:"+new String(data));
   }
}