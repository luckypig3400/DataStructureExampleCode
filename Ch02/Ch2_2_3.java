/* �{���d��: Ch2_2_3.java */
public class Ch2_2_3 { 
   // �D�{��
   public static void main(String[] args) {
      final int ROW = 6;     // �w�q�C��
      final int COLUMN = 5;  // �w�q���
      // �ǥͥ\�Ҫ�
      int[] data = { 0, 2, 0, 2, 0,
                     5, 0, 5, 0, 5,
                     1, 4, 1, 4, 1,
                     3, 0, 3, 0, 3,
                     0, 0, 0, 0, 0 };
      // ���а}�C 
      int[] pointer = { 0, 10, 5, 20, 15, 20 };
      int sum = 0;   // �W���`�`��
      // �@���}�C�����X
      for ( int i = 0; i < data.length; i++ )
         System.out.print(i + ": " + data[i] + " ");
      System.out.println();
      for ( int i = 0; i < ROW; i++ ) // �G���}�C�����X
         for ( int j = 0; j < COLUMN; j++ )
            if ( data[pointer[i]+j] != 0 ) // �O�_����
               sum++;
      // ��ܤW���`�`��
      System.out.println("�W���`�`��: "  + sum);
   }
}