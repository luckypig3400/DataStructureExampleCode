/* �{���d��: Ch2_1_4.java */
public class Ch2_1_4 { 
   // �D�{��
   public static void main(String[] args) {
      // �ǥͥ\�Ҫ�
      int[][] courses={ {0, 2, 0, 2, 0},
                        {1, 4, 1, 4, 1},
                        {5, 0, 5, 0, 5},
                        {0, 0, 0, 0, 0},
                        {3, 0, 3, 0, 3},
                        {0, 0, 0, 0, 0} };
      int sum = 0;   // �W���`�`��
      // �G���}�C�����X
      for ( int i = 0; i < courses.length; i++ )
         for ( int j = 0; j < courses[i].length; j++ )
            if ( courses[i][j] != 0 ) // �O�_����
               sum++;
      // ��ܤW���`�`��
      System.out.println("�W���`�`��: " + sum);
   }
}