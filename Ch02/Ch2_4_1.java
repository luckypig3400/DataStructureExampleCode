/* �{���d��: Ch2_4_1.java */ 
public class Ch2_4_1 {
   // �D�{��
   public static void main(String[] args) {
      // �}���x�}
      int[][] sparse = {{0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 9, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 3, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 6, 0, 0} };
      // �إߵ}���x�}����
      sMatrix a = new sMatrix(20, 5, 10, sparse);
      a.printMatrix();  // ��ܵ}���x�}
   }
}