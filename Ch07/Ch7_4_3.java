/* �{���d��: Ch7_4_3.java */ 
class Edge {                // �ϧ���u���O
   int from;                // �}�l���I
   int to;                  // ���I���I
   int weight;              // �v��
   Edge next;               // ���U�@����u
   // �غc�l
   public Edge(int from, int to, int weight) {
      this.from = from;       this.to = to;
      this.weight = weight;   next = null;
   }
};
class EdgeList { // ��u��C���O
   public int[] vertex;     // �ˬd�j�骺���I�}�C
   private Edge first;      // ��u��C�}�l����
   // �غc�l: �إ߹ϧΪ���u��C
   public EdgeList(int size, int[][] edge) {
      Edge newnode;           // �s��u�`�I����
      Edge last = null;       // �̫���u�`�I����
      vertex = new int[size]; // �إ߰}�C�B��l���I�}�C
      for ( int i = 0; i < size; i++) vertex[i] = -1;
      // �إ���u��C�D�j��
      for ( int i = 0; i < edge.length; i++) {
         newnode = new Edge(edge[i][0],  // �إ���u����
                   edge[i][1],edge[i][2]);
         if ( first == null ) {  // ��C���Ĥ@�Ӹ`�I
           first = newnode;      // �إߦ�C�}�l����
           last = first;         // �O�d�̫�`�I����
         } else {
           last.next = newnode;  // �쵲�̫ܳ�`�I
           last = newnode;       // �O�d�̫�`�I����
         }
      }
   }
   // ��k: �s�W��P�@�Ӷ��X
   private void addSet(int from, int to) {
      int to_root = to;             // �q���I���I��
      while ( vertex[to_root] > 0 )
         to_root = vertex[to_root];
      vertex[to_root] = from;       // ���X��ӳ��I
   }
   // ��k: ��ӳ��I�O�_�O�P�@�Ӷ��X, �֦��P�@�Ӯڳ��I
   private boolean isSameSet(int from, int to) {
      int from_root = from;          // �q�}�l���I��
      int to_root = to;              // �q���I���I��
      while ( vertex[from_root] > 0 )// ��M�ڳ��I
         from_root = vertex[from_root];
      while ( vertex[to_root] > 0 )  // ��M�ڳ��I
         to_root = vertex[to_root];
      if ( from_root == to_root )   // �O�_�O�P�@�ڳ��I
            return true;            // �P�@���X
      else  return false;           // ���P���X
   }
   // ��k: �̧C�����X�i��
   public void minSpanTree() {
      Edge ptr = first;             // ���V��C���}�l
      int i, total = 0;
      while ( ptr != null ) {
         // �O�_�O�P�@�Ӷ��X, �ۦP�|���Ͱj��
         if ( !isSameSet(ptr.from,ptr.to) ) {
            // �[�J�̧C�����X�i����u
            System.out.println("���I V"+ptr.from +
                   " -> V"+ptr.to+"����: "+ptr.weight);
            total += ptr.weight;          // �p�⦨��
            addSet(ptr.from,ptr.to);      // �s�W�ܶ��X
         }
         ptr = ptr.next;             // �U�@����u
      }
      System.out.println("�̧C�����X�i�𪺦���: "+total);
   }
}
// �D���O
public class Ch7_4_3 {
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = { { 1, 2, 2 }, // ������u�}�C
                       { 2, 4, 3 },
                       { 1, 4, 4 },
                       { 3, 5, 5 },
                       { 2, 5, 6 },
                       { 2, 3, 8 },
                       { 3, 4, 10 },
                       { 4, 5, 15 } };
      EdgeList el= new EdgeList(6, edge);// �إ���u��C
      System.out.println("�ϧΪ��̧C�����X�i��:");
      el.minSpanTree();            // �إ̤߳p�����X�i��
      System.out.print("���I�}�C���e: "); // ��ܳ��I�}�C
      for ( int i = 1; i < el.vertex.length; i++ )
         System.out.print("[" + el.vertex[i] + "]");
      System.out.println();
   }
}