/* �{���d��: Ch7_5_2.java */ 
class Floyd extends AdjacencyMatrix { // Floyd�t��k���O
   private int[][] dist;// ���|���װ}�C
   // �غc�l: �إ߾F���x�}�ϧ�
   public Floyd(int size, int[][] edge) {
      super(size, edge);
      dist = new int[size][]; // �إߤG���}�C
      for ( int i = 0; i < graph.length; i++ )
         dist[i] = new int[size];
   }
   // ��k: ��M�U���I��U���I���̵u�Z��
   public void shortestPath() {
      int i, j, k;
      // ��l�}�C���_���j��
      for ( i = 1; i < graph.length; i++ )
         for ( j = i; j < graph.length; j++ )
            dist[i][j] = dist[j][i] = graph[i][j];
      // ��X�̵u�Z�����_���j��
      for ( k = 1; k < graph.length; k++ )
         // ���X�G���}�C�p��̵u���|
         for ( i = 1; i < graph.length; i++ )
            for ( j = 1; j < graph.length; j++ )
               if ( dist[i][k]+dist[k][j] < dist[i][j] )
                  // ���w�������u���Z��
                  dist[i][j] = dist[i][k] + dist[k][j];
      System.out.print("V    1    2    3");
      System.out.println("    4    5    6");
      for ( i = 1; i < graph.length; i++ ) {
         System.out.print(i + " ");
         for ( j = 1; j < graph.length; j++ ) {
            // �վ���ܪ���m, ��ܶZ���}�C
            if ( dist[i][j] < 10 ) System.out.print(" ");
            if ( dist[i][j] < 100 )System.out.print(" ");
            System.out.print(" " + dist[i][j] + " ");
         }
         System.out.println();
      }
   }
}
// �D���O
public class Ch7_5_2 {
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = { {1, 2, 35},  // �[�v��u�}�C
                       {1, 3, 90},
                       {2, 3, 45},
                       {2, 4, 30},
                       {3, 5, 25},
                       {4, 5, 45},
                       {5, 6, 200} };
      Floyd fl = new Floyd(7, edge);  // �إ߹ϧ�
      System.out.println("�ϧ�G���F���x�}���e: ");
      fl.printGraph();             // ��ܹϧ�
      System.out.println(
             "�q�U���I��U���I�̪�Z����Floyd�p��L�{:");
      fl.shortestPath();          // ��M�̵u���|
      System.out.println();
   }
}