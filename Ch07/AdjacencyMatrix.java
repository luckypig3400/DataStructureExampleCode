/* �{���d��: AdjacencyMatrix.java */ 
class AdjacencyMatrix { // �F���x�}���ϧ����O
   final int MAX = 10000;        // �L�a�j
   public int[][] graph;         // �ϧΰ}�C�ŧi
   // �غc�l: �ϥ���u�}�C�إ߹ϧ�
   public AdjacencyMatrix(int size, int[][] edge) {
      int i, j;      
      int from, to;            // ��u���_�I�M���I
      graph = new int[size][]; // �إߤG���}�C
      for ( i = 0; i < graph.length; i++ )
         graph[i] = new int[size];
      for ( i = 1; i < size; i++ )
         for ( j = 1; j < size; j++ )
            if ( i != j )
               graph[i][j] = MAX;     // �x�}�]���L�a�j
            else
               graph[i][j] = 0;       // �﨤�u�]��0
      for ( i = 0; i < edge.length; i++ ) { // Ū����u���j��
         from = edge[i][0];           // ��u���_�I
         to = edge[i][1];             // ��u�����I
         graph[from][to] = edge[i][2];// �s�J�ϧΪ��v��
      }
   }
   // ��k: ��ܹϧ�
   public void printGraph() {
      // �ϥΰj����ܹϧ�
      for ( int i = 1; i < graph.length; i++ ) {
         for ( int j = 1; j < graph[i].length; j++ )
            if ( graph[i][j] == MAX )
               System.out.print(" �� ");
            else {  // �վ��X���r����
               if ( graph[i][j] < 10 ) System.out.print(" ");
               if ( graph[i][j] < 100 ) System.out.print(" ");
               System.out.print(graph[i][j] + " ");
            } 
            System.out.println();
      }
   }
}