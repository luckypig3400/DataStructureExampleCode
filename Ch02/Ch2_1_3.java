/* �{���d��: Ch2_1_3.java */
import java.io.*;
public class Ch2_1_3 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �ǥͥ\�Ҫ�
      int[][] courses={ {0, 2, 0, 2, 0},
                        {1, 4, 1, 4, 1},
                        {5, 0, 5, 0, 5},
                        {0, 0, 0, 0, 0},
                        {3, 0, 3, 0, 3},
                        {0, 0, 0, 0, 0} };
      int week_no;    // �P���X 
      int num;        // �ĴX�`��
      int code;       // �ҵ{�N�X
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("�п�J�P��(1 �� 5)==> ");
      System.out.flush();    // �M���w�İ�
      // Ū���P���X 
      week_no = Integer.parseInt(in.readLine());
      System.out.print("�п�J�ĴX�`��(1 �� 6)==> ");
      System.out.flush();    // �M���w�İ�
      // Ū���ĴX�`��
      num = Integer.parseInt(in.readLine());
      // ���o�ҵ{�N�X 
      code = courses[num-1][week_no-1];
      System.out.println("�ҵ{�N�X: " + code); 
      // ��ܽҵ{�W�� 
      switch ( code ) {
         case 0: System.out.println("�S�ҡI");
                 break;
         case 1: System.out.println("�p�������");
                 break;
         case 2: System.out.println("�����ƾ�");
                 break;
         case 3: System.out.println("��Ƶ��c");
                 break;
         case 4: System.out.println("��Ʈw�z��");
                 break;
         case 5: System.out.println("�W�����");
                 break;
      }
      in.close();                // ������y
   }
}