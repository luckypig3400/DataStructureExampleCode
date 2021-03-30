/* �{���d��: Ch2_4_2.java */ 
// �}���x�}���O
class sMatrix_Transpose extends sMatrix {
   // �غc�l: �إߵ}���x�}
   public sMatrix_Transpose(int maxSize,
                 int maxRow, int maxCol, int[][] array) {
      super(maxSize, maxRow, maxCol, array);
   }
   // ��k: ��m�}���x�}
   public sMatrix transposeMatrix() {
      sMatrix temp = new sMatrix(20, cols, rows);
      temp.numOfTerms = numOfTerms;   // ������
      if ( numOfTerms > 0 ) { // �}���x�}���O�Ū�
         int pos = 0;
         for ( int c = 0; c < cols; c++ ) // �H����m
            for ( int i = 0; i < numOfTerms; i++ )
               if ( smArr[i].col == c ) { // �̧ǧ�M�U��
                  temp.smArr[pos].row = c;
                  temp.smArr[pos].col = smArr[i].row;
                  temp.smArr[pos].value = smArr[i].value;
                  pos++;
               }
      }
      return temp;
   }
}
// �D���O
public class Ch2_4_2 {
   // �D�{��
   public static void main(String[] args) {
      // �}���x�}
      int[][] sparse = { {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 9, 0, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                         {0, 0, 0, 0, 3, 0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0, 0, 0, 6, 0, 0} };
      // �إߵ}���x�}����
      sMatrix_Transpose a =
              new sMatrix_Transpose(20, 5, 10, sparse);
      a.printMatrix();  // ��ܵ}���x�}
      // ��m�}���x�}
      sMatrix b = a.transposeMatrix();
      b.printMatrix();
   }
}