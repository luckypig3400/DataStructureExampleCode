/* �{���d��: Ch7_2_1.java */ 
class Graph_Matrix { // �F���x�}���O
   private int[][] graph;        // �ϧΰ}�C�ŧi
   // �غc�l: �ϥ���u�}�C�إ߹ϧ�
   public Graph_Matrix(int size, int[][] edge) {
      int i, j;
      int from, to;            // ��u���_�I�M���I
      graph = new int[size][]; // �إߤG���}�C
      for ( i = 0; i < graph.length; i++ )
         graph[i] = new int[size];
      for ( i = 1; i < size; i++ )
         for ( j = 1; j < size; j++ )
            graph[i][j] = 0;   // �M���F���x�}
      for ( i=0; i<edge.length; i++ ) {// Ū����u���j��
         from = edge[i][0];      // ��u���_�I
         to = edge[i][1];        // ��u�����I
         graph[from][to] = 1;    // �s�J�ϧΪ���u
      }
   }
   // ��k: ��ܹϧ�
   public void printGraph() {
      // �ϥΰj����ܹϧ�
      for ( int i = 1; i < graph.length; i++ ) {
         for ( int j = 1; j < graph[i].length; j++ )
            System.out.print(" " + graph[i][j] + " ");
         System.out.println();
      }
   }
}
// �D���O
public class Ch7_2_1 {
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = { {1, 2}, {2, 1},  // ��u�}�C
                       {1, 3}, {3, 1},
                       {2, 3}, {3, 2},
                       {2, 4}, {4, 2},
                       {3, 5}, {5, 3},
                       {4, 5}, {5, 4} };
      Graph_Matrix g=new Graph_Matrix(6,edge);// �إ߹ϧ�
      System.out.println("�ϧ�G���F���x�}���e: ");
      g.printGraph();  // ��ܹϧ�
   }
}