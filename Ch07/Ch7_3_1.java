/* �{���d��: Ch7_3_1.java */ 
class Graph_DFS extends Graph_List { // DFS�ϧ����O
   private int[] visited;        // ���X�O���}�C
   // �غc�l: �ϥ���u�}�C�إ߹ϧ�
   public Graph_DFS(int size, int[][] edge) {
      super(size, edge);    // �I�s�����O���غc�l
      visited = new int[size];
      for ( int i = 1; i < size; i++ )
         visited[i] = 0; // �]�w���X���
   }
   // ��k: �ϧΪ��`���u���j�M�k
   public void dfs(int vertex) {
      Vertex ptr;
      visited[vertex] = 1;           // �O���w���X�L
      // ��ܨ��X�����I��
      System.out.print("[V"+ vertex + "] ");
      ptr = head[vertex].next;       // ���I����
      while ( ptr != null ) {        // ���X�ܦ�C��
         if ( visited[ptr.data] == 0 ) // �O�_���X�L
            dfs(ptr.data);           // ���j���X�I�s
         ptr = ptr.next;             // �U�@�ӳ��I
      }
   }
}
// �D���O
public class Ch7_3_1 {
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = { {1, 2}, {2, 1},  // ��u�}�C
                       {1, 3}, {3, 1},
                       {2, 4}, {4, 2},
                       {2, 5}, {5, 2},
                       {3, 6}, {6, 3},
                       {3, 7}, {7, 3},
                       {4, 8}, {8, 4},
                       {5, 8}, {8, 5},
                       {6, 8}, {8, 6},
                       {7, 8}, {8, 7} };
      Graph_DFS g = new Graph_DFS(10, edge);  // �إ߹ϧ�
      System.out.println("�ϧ�G���F���x�}���e: ");
      g.printGraph();  // ��ܹϧ�
      System.out.println("�ϧΪ��`���u�����X: ");
      g.dfs(1);        // ��ܨ��X�L�{
      System.out.println();
   }
}