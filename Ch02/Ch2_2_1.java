/* �{���d��: Ch2_2_1.java */
public class Ch2_2_1 { 
   // �D�{��
   public static void main(String[] args) {
      final int ROW = 6;     // �w�q�C��
      final int COLUMN = 5;  // �w�q���
      // �ǥͥ\�Ҫ�
      int[] classes = { 0, 2, 0, 2, 0,
                        1, 4, 1, 4, 1,
                        5, 0, 5, 0, 5,
                        0, 0, 0, 0, 0,
                        3, 0, 3, 0, 3,
                        0, 0, 0, 0, 0 };
      int sum = 0;   // �W���`�`��
      // �@���}�C�����X
      for ( int i = 0; i < classes.length; i++ )
         System.out.print(i + ": " + classes[i] + " ");
      System.out.println();
      for ( int i = 0; i < ROW; i++ ) // �G���}�C�����X
         for ( int j = 0; j < COLUMN; j++ )
            if ( classes[i*COLUMN+j]  != 0 )// �O�_����
               sum++;
      // ��ܤW���`�`��
      System.out.println("�W���`�`��: "  + sum);
   }
}