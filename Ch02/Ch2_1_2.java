/* �{���d��: Ch2_1_2.java */
import java.io.*;
public class Ch2_1_2 { 
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �ǥͦ��Z�}�C
      int[] scores = {76,85,90,67,59,79,82,95,91,65};
      int num = 0;      // �Ǹ�
      int grade;        // ���Z
      int i, choice;    // �ﶵ
      boolean doit = true;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( doit ) {   // �D�j��
         System.out.println("----------���----------");
         System.out.print("1: �d�ߦ��Z  ");
         System.out.println("2: �ק令�Z");
         System.out.print("3: ��ܦ��Z  ");
         System.out.println("4: ���}�@�~");
         System.out.print("�п�J�ﶵ( 1 �� 4 )==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         choice = Integer.parseInt(in.readLine());
         if (choice < 3 ) {
            System.out.print("�п�J�ǥ;Ǹ�(0��9)==> ");
            System.out.flush();    // �M���w�İ�
            num = Integer.parseInt(in.readLine());
         }
         switch( choice ) {
            case 1:  // �d�ߦ��Z
               grade = scores[num]; // ���o���Z
               System.out.println("�ǥͦ��Z: " + grade);
               break;
            case 2:  // �ק令�Z
               grade = scores[num];
               System.out.println("��ǥͦ��Z: "+grade);
               // Ū���s���Z
               System.out.print("�п�J�s���Z==> ");
               System.out.flush();    // �M���w�İ�
               grade = Integer.parseInt(in.readLine());
               scores[num] = grade;  // ��s���Z
               break;
            case 3:  // ��ܦ��Z
               System.out.println("�ǥͦ��Z: ");
               for ( i = 0; i < scores.length; i++ )
                  System.out.print(i+":"+scores[i]+" ");
               System.out.println();
               break;
            case 4:  // �����@�~
               doit = false;
               break;
         }
      }
      in.close();                // ������y
   }
}