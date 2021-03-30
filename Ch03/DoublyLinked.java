/* �{���d��: DoublyLinked.java */
// ���V�쵲��C���O 
public class DoublyLinked extends DList {
   // �غc�l: �إ߳�V�쵲��C
   public DoublyLinked(int[] array) {
      DNode newnode, before;
      first = new DNode(array[0]); // �إ߲�1�Ӹ`�I����
      before = first;              // ���V�Ĥ@�Ӹ`�I
      now = first;                 // ���]�ثe�`�I����
      for ( int i = 1; i < array.length; i++ ) {
         // �إ߸`�I����
         newnode = new DNode(array[i]);
         newnode.previous = before;// �N�s�`�I���V�e�`�I
         before.next = newnode;    // �N�e�`�I���V�s�`�I
         before = newnode;         // �s�`�I�����e�`�I
      }
   }
   // ��k: ������V��C���`�I���
   public void printDList() {
      DNode current = first;       // �ثe���`�I����
      while ( current != null ) {  // ��ܥD�j��
         if ( current == now )
            System.out.print("#" + current.data + "#");
         else
            System.out.print("[" + current.data + "]");
         current = current.next;   // �U�@�Ӹ`�I
      }
      System.out.println();
   }
   // ��k: ���ʸ`�I���Ш�U�@�Ӹ`�I
   public void nextNode() {
      if ( now.next != null )
         now = now.next;            // �U�@�Ӹ`�I
   }
   // ��k: ���ʸ`�I���Ш�W�@�Ӹ`�I
   public void previousNode() {
      if ( now.previous != null )
         now = now.previous;        // �e�@�Ӹ`�I
   }
   // ��k: ���]�`�I����
   public void resetNode() { now = first; }
   // ��k: ���o�`�I����
   public DNode readNode() { return now; }
}