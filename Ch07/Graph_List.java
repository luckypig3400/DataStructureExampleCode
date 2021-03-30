/* �{���d��: Graph_List.java */ 
public class Graph_List { // �F����C���O
   public Vertex[] head;    // �ϧγ��I������}�C
   // �غc�l: �ϥ���u�}�C�إ߹ϧ�
   public Graph_List(int size, int[][] edge) {
      int i, from, to;         // ��u���_�I�M���I
      Vertex newnode, ptr;
      head = new Vertex[size]; // �إߪ���}�C
      for ( i = 0; i < head.length; i++ )
         head[i] = new Vertex(i);
      for (i=0; i < edge.length; i++) {// Ū����u���j��
         from = edge[i][0];      // ��u���_�I
         to = edge[i][1];        // ��u�����I
         // �إ߳��I����
         newnode = new Vertex(to);
         ptr = head[from];       // ���а}�C�����I����
         while ( ptr.next != null ) // ���X�ܦ�C��
            ptr = ptr.next;         // �U�@�ӳ��I
         ptr.next = newnode;        // ���J����
      }
   }
   // ��k: ��ܹϧ�
   public void printGraph() {
      Vertex ptr;
      // �ϥΰj����ܹϧ�
      for ( int i = 1; i < head.length; i++ ) {
         ptr = head[i].next;     // ���I����
         if ( ptr != null ) {    // ���ϥΪ��`�I
            System.out.print("���IV" + head[i].data);
            System.out.print(" =>");
            while ( ptr != null ) {  // ���X��ܳ��I���e
               System.out.print("V" + ptr.data + " ");
               ptr = ptr.next;       // �U�@�ӳ��I
            }
            System.out.println();
         }
      }
   }
}