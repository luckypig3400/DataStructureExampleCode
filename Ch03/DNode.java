/* �{���d��: DNode.java */ 
public class DNode {      // ���V��C���`�I���O
   int data;       // �`�I���
   DNode next;     // ���U�@�Ӹ`�I������
   DNode previous; // ���V�e�@�Ӹ`�I
   // �غc�l
   public DNode(int data) {
      this.data = data;
      next = previous = null;
   }
};