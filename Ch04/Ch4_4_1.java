/* �{���d��: Ch4_4_1.java */
public class Ch4_4_1 { 
   // �D�{��
   public static void main(String[] args) {
      int[][] maze = { // �g�c�}�C,�Ʀr0�i��, 1���i��
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
      Stack st = new Stack();  // �إ߰��|����
      int x = 5;               // �g�c�J�f�y��
      int y = 8;
      while ( x != 1 || y != 1 ) { // �D�j��
         maze[x][y] = 2;           // �Хܬ��w���L����
         if ( maze[x-1][y] <= 0 ) {// ���W�訫
            x = x - 1;             // �y��x��1
            st.push(x);            // �s�J���|
            st.push(y);
         }
         else if ( maze[x+1][y] <= 0 ) {// ���U�訫
              x = x + 1;            // �y��x�[1
              st.push(x);           // �s�J���|
              st.push(y);
            }
            else if ( maze[x][y-1] <= 0 ) { // �����訫
                 y = y - 1;            // �y��y��1
                 st.push(x);           // �s�J���|
                 st.push(y);
              }
              else if ( maze[x][y+1] <= 0 ) {// ���k�訫
                   y = y + 1;          // �y��y�[1
                   st.push(x);         // �s�J���|
                   st.push(y);
                }
                else {  // �S�����i��:�j��
                     maze[x][y] = 3;   // ��ܬO�j������
                     y = st.pop();     // �h�^�@�B
                     x = st.pop();
                }
      }
      maze[x][y] = 2;                  // �Х̫ܳ��m
      System.out.println("�g�c���|��(�q�k�U�쥪�W��):");
      for ( int i = 0; i <= 6; i++) {  // ��ܰg�c�ϧ�
         for ( int j = 0; j <= 9; j++) // ��ܮy�Э�
            System.out.print(maze[i][j]+" ");
         System.out.println();
      }
      System.out.println("�Ʀr 1: ���");
      System.out.println("�Ʀr 2: ���L�����|");
      System.out.println("�Ʀr 3: �^�����|");
   }
}