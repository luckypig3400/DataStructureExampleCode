/* �{���d��: Ch7_6.java */ 
// �ݾ�ƧǪ��ϧ����O
class TopoSort extends AdjacencyList {
   // �غc�l: �إ߾F����C�ϧ�
   public TopoSort(int size, int[][] edge) {
      super(size, edge);
   }
   // ��k: �ϧΪ��ݾ�Ƨ�
   public boolean topoSort() {
      Vertex_List ptr;
      int i, vertex;
      Queue q = new Queue();       // �إߦ�C
      // �N������׬��s�������I�s�J��C���j��
      for ( i = 1; i < head.length; i++ )
         if ( head[i].data == 0 )  // �p�G����׬O�s
            q.enqueue(i);          // �N���I�s�J��C
      while ( !q.isQueueEmpty() ) {// ��C�O�_�w��
         vertex = q.dequeue();     // �N���I�q��C���X
         // ��ܩݾ�ƧǪ����I
         System.out.print(" " + vertex + " ");
         ptr = head[vertex].next;  // ���I����
         while ( ptr != null ) {   // ���X�ܦ�C��
            vertex = ptr.data;     // ���o���I��
            head[vertex].data--;   // ���I������״�@
            // �p�G������׬O�s
            if ( head[vertex].data == 0  )
               q.enqueue(vertex);  // �N���I�s�J��C
            ptr = ptr.next;        // �U�@�ӳ��I
         }
      }
      System.out.println();
      for ( i = 1; i<head.length; i++ )// �ˬd�O�_���j��
         if ( head[i].data != 0 )    // ������פ��O�s
            return true;             // ���j��
      return false;                  // �S���j��
   }
}
// �D���O
public class Ch7_6 {
   // �D�{��
   public static void main(String[] args) {
      int edge1[][] = { {3, 2, 1},     // ��u�}�C1
                        {2, 1, 1},
                        {2, 5, 1},
                        {2, 6, 1},
                        {1, 4, 1},
                        {5, 4, 1},
                        {7, 4, 1},
                        {6, 7, 1} };
      int edge2[][] = { {3, 2, 1},     // ��u�}�C2
                        {2, 1, 1},
                        {2, 5, 1},
                        {2, 6, 1},
                        {1, 4, 1},
                        {5, 4, 1},
                        {7, 4, 1},
                        {6, 7, 1},
                        {5, 6, 1},
                        {7, 5, 1} };
      TopoSort ts1 = new TopoSort(8, edge1);  // �إ߹ϧ�
      System.out.println("�ϧ�1���F����C���e=========");
      ts1.printGraph();             // ��ܹϧ�1
      System.out.println("�ϧ�1�ݾ�ƧǪ����e:");
      if ( ts1.topoSort() )         // �ݾ�Ƨ�
         System.out.println("�ϧ�1���j��");
      else
         System.out.println("�ϧ�1�S���j��");
      TopoSort ts2 = new TopoSort(8, edge2);  // �إ߹ϧ�
      System.out.println("�ϧ�2���F����C���e=========");
      ts2.printGraph();             // ��ܹϧ�2
      System.out.println("�ϧ�2�ݾ�ƧǪ����e:");
      if ( ts2.topoSort() )         // �ݾ�Ƨ�
         System.out.println("�ϧ�2���j��");
      else
         System.out.println("�ϧ�2�S���j��");
   }
}