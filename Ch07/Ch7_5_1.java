/* �{���d��: Ch7_5_1.java */ 
// Dijkstra�t��k���O
class Dijkstra extends AdjacencyMatrix {
   private int[] dist;       // ���|���װ}�C
   private int[] pi;         // �e�@���I�}�C
   private int[] selected;   // ��ܪ����I�}�C
   // �غc�l: �إ߾F���x�}�ϧ�
   public Dijkstra(int size, int[][] edge) {
      super(size, edge);
      dist = new int[size];          // �إ߰}�C
      pi = new int[size];
      selected = new int[size];
      for ( int i = 1; i < size; i++ ) { // ��l�}�C�j��
         selected[i] = 0;            // �M���}�C���e
         pi[i] = 0;                  // �M���}�C���e
      }
   }
   // ��k: ��M�Y�@���I�ܦU���I���̵u�Z��
   public void shortestPath(int source) {
      int min_len;                   // �̵u�Z��
      int min_v = 1;                 // �̵u�Z�������I
      int i,j;
      for ( i = 1; i < graph.length; i++ )// ��l�}�C�j��
         dist[i] = graph[source][i]; // ��l�Z��
      selected[source] = 1;          // �}�l���I�[�J���X
      dist[source] = 0;              // �]�w�}�l���I�Z��
      System.out.println("V   1   2   3   4   5   6");
      // ���dist[]�}�C���e
      for ( j = 1; j < graph.length; j++ ) { // ��ܳ��I
         if ( j == 1 ) System.out.print(source);
         if ( dist[j] == MAX ) System.out.print("  ��");
         else {  // �վ���ܦ�m
            if ( dist[j] < 10 )  System.out.print(" ");
            if ( dist[j] < 100 ) System.out.print(" ");
            System.out.print(" " + dist[j]); // ��ܶZ��
         }
      }
      System.out.println();
      // �@�@���泻�I��-1�����j��
      for ( i = 1; i < graph.length-1; i++ ) {
         min_len = MAX;              // ���]���L�a�j
         // ��X�̵u�Z�����I���j��
         for ( j = 1; j < graph.length; j++ )
            // �q���ݩ󶰦X�����I�}�C��M�̪�Z�����I s
            if ( min_len>dist[j] && selected[j]==0 ) {
               min_v = j;            // �ثe�̵u�����I
               min_len = dist[j];    // �O���̵u�Z��
            }
         selected[min_v] = 1;        // �N���I�[�J���X
         System.out.print(min_v);    // ��ܿ�ܳ��I
         if ( i == 1 ) pi[min_v] = 1;// �e���I
         // �p��}�l���I��U���I�̵u�Z���}�C���j��
         for ( j = 1; j < graph.length; j++ ) {
           if ( selected[j] == 0 &&  // �O�_�Z������u
               dist[min_v]+graph[min_v][j] < dist[j]) {
             // ���w�����u���Z��
             dist[j] = dist[min_v] + graph[min_v][j];
             pi[j] = min_v;          // �O���e�@�ӳ��I
           }
           if ( dist[j]==MAX ) System.out.print("  ��");
           else {  // �վ���ܪ���m, ��̵ܳu�Z��
              if ( dist[j] < 10 )  System.out.print(" ");
              if ( dist[j] < 100 ) System.out.print(" ");
              System.out.print(" " + dist[j]);
           }
         }
         System.out.println();
      }
      System.out.println("�e�@���I�}�C: ");
      System.out.println("V  1   2   3   4   5   6");
      for ( j = 1; j < graph.length; j++ ) {
         System.out.print("   "+pi[j]);// ��ܫe�@�ӳ��I
      }
      System.out.println();
   }
}
// �D���O
public class Ch7_5_1 {
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = { {1, 2, 35},  // �[�v��u�}�C
                       {1, 3, 90},
                       {2, 3, 45},
                       {2, 4, 30},
                       {3, 5, 25},
                       {4, 5, 45},
                       {5, 6, 200} };
      Dijkstra di = new Dijkstra(7, edge);  // �إ߹ϧ�
      System.out.println("�ϧ�G���F���x�}���e: ");
      di.printGraph();             // ��ܹϧ�
      System.out.println(
           "�q���I1��U���I�̪�Z����Dijkstra�p��L�{:");
      di.shortestPath(1);          // ��M�̵u���|
      System.out.println();
   }
}