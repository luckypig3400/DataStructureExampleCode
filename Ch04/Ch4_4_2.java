/* �{���d��: Ch4_4_2.java */
public class Ch4_4_2 { 
   static int[][] maze = { // �g�c�}�C,�Ʀr0�i��, 1���i��
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
   // ��k: ���g�c�����j��k
   static boolean findPath(int x, int y) {
      if ( x == 1 && y == 1 ) {      // �O�_�O�g�c�X�f
         maze[x][y] = 2;             // �O���̫ᨫ�L����
         return true;
      }
      else if ( maze[x][y] == 0 ) {  // �O���O�i�H������
             maze[x][y] = 2;         // �O���v�g���L����
             if ( findPath(x - 1, y) ||     // ���W
                  findPath(x + 1, y) ||     // ���U
                  findPath(x, y - 1) ||     // ����
                  findPath(x, y + 1) )      // ���k
                 return true;
             else {
                 maze[x][y] = 0;     // �������q�����O��
                 return false;
             }
           }
           else return false;
   }
   // �D�{��
   public static void main(String[] args) {
      findPath(5, 8);                  // �I�s���j��k
      System.out.println("�g�c���|��(�q�k�U�쥪�W��):");
      for ( int i = 0; i <= 6; i++) {  // ��ܰg�c�ϧ�
         for ( int j = 0; j <= 9; j++) // ��ܮy�Э�
            System.out.print(maze[i][j]+" ");
         System.out.println();
      }
      System.out.println("�Ʀr 1: ���");
      System.out.println("�Ʀr 2: ���L�����|");
   }
}