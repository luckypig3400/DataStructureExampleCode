/* �{���d��: Vertex_List.java */
public class Vertex_List {     // �ϧγ��I���O
   int data;       // ���I���
   int weight;                  /* �v�� */ 
   Vertex_List next;    // ���U�@�ӳ��I������
   // �غc�l
   public Vertex_List(int data, int weight) {
      this.data = data;
      this.weight = weight;
      next = null;
   }
};