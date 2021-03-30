/* �{���d��: AdjacencyList.java */
public class AdjacencyList { // �F����C���O
   public Vertex_List[] head;    // �ϧγ��I������}�C
   // �غc�l: �ϥ���u�}�C�إ߹ϧ�
   public AdjacencyList(int size, int[][] edge) {
      int i, from, to;         // ��u���_�I�M���I
      Vertex_List newnode, ptr;
      head = new Vertex_List[size]; // �إߪ���}�C
      for ( i = 0; i < head.length; i++ )
         head[i] = new Vertex_List(0, 0); 
      for ( i = 0; i < edge.length; i++ ) { // Ū����u���j��
         from = edge[i][0];      // ��u���_�I
         to = edge[i][1];        // ��u�����I
         head[to].data += 1;     // ������ץ[�@
         // �إ߳��I����
         newnode = new Vertex_List(to, edge[i][2]);
         ptr = head[from];       // ���а}�C�����I����
         while ( ptr.next != null ) // ���X�ܦ�C��
            ptr = ptr.next;         // �U�@�ӳ��I
         ptr.next = newnode;        // ���J����
      }
   }
   // ��k: ��ܹϧ�
   public void printGraph() {
      Vertex_List ptr;
      // �ϥΰj����ܹϧ�
      for ( int i = 1; i < head.length; i++ ) {
         ptr = head[i].next;     // ���I����
         if ( ptr != null ) {    // ���ϥΪ��`�I
            System.out.print("���IV" + i + "(" + head[i].data + ") =>");// ���I��, �������
            while ( ptr != null ) {  // ���X���
               System.out.print("V" + ptr.data + 
                                "(" + ptr.weight + ") ");  // ���I���e
               ptr = ptr.next;       // �U�@�ӳ��I
            }
            System.out.println();
         }   
      }
   }
}