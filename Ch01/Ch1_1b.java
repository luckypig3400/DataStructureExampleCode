/* �{���d��: Ch1_1b.java */
public class Ch1_1b { 
   // �D�{��
   public static void main(String[] args) {
      // �x�s�U�����Z���}�C
      int[] t = { 81,93,77,59,69,85,90,83,100,75 };
      int sum = 0;                    // �`��
      float average;                  // ����
      for ( int i = 0; i < t.length; i++ )
         sum += t[i];                 // �p���`��
      average = sum / 10;             // �p�⥭��
      System.out.println("�`��: "+sum);    // ����`��
      System.out.println("����: "+average);// ��ܥ���
   }
}