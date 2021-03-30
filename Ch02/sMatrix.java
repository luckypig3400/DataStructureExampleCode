/* �{���d��: sMatrix.java */ 
public class sMatrix {     // �}���x�}���_�����O
   public int rows;        // �C��
   public int cols;        // ���
   public int numOfTerms;  // ���ؼ�
   public nTerm[] smArr;   // �}���x�}������}�C
   class nTerm {           // ���ت����h���O
      public int row;      // �C��
      public int col;      // �渹
      public int value;    // ��
   }
   // �غc�l(1): �إߵ}���x�}����
   public sMatrix(int maxSize, int maxRow, int maxCol) {
      rows = maxRow;  cols = maxCol;      // ��l�����ܼ�
      numOfTerms = 0;
      smArr = new nTerm[maxSize];// �إߵ}���x�}����}�C
      for ( int i = 0; i < smArr.length; i++ )
         smArr[i] = new nTerm();
   }
   // �غc�l(2): �إߵ}���x�}����
   public sMatrix(int maxSize,
                 int maxRow, int maxCol, int[][] array) {
      smArr = new nTerm[maxSize];// �إߵ}���x�}����}�C
      for ( int i = 0; i < smArr.length; i++ )
         smArr[i] = new nTerm();
      rows = maxRow; cols = maxCol;       // ��l�����ܼ�
      numOfTerms = 0;
      for ( int i = 0; i < maxRow; i++ )// �G���}�C�����X
         for ( int j = 0; j < maxCol; j++ )
            if ( array[i][j] != 0 ) {     // ��������
               smArr[numOfTerms].row = i; // �C��
               smArr[numOfTerms].col = j; // ���
               // ������
               smArr[numOfTerms].value = array[i][j];
               numOfTerms++;
            }
   }
   // ��k: ��ܵ}���x�}
   public void printMatrix() {
      // ��ܵ}���x�}�ؤo�M���ؼ�
      System.out.print(" Size: " + rows + " X " + cols);
      System.out.println(" Items: " + numOfTerms);
      System.out.println("\trow\tcol\tvalue");
      // ��ܵ}���x�}���U���خy�лP��
      for (int i = 0; i < numOfTerms; i++) {
        System.out.print("\t" + smArr[i].row);
        System.out.print("\t" + smArr[i].col);
        System.out.println("\t" + smArr[i].value);
      }
   }
}