/* �{���d��: SinglyLinked.java */
// ��V�쵲��C���O
public class SinglyLinked extends List { 
   // �غc�l: �إ߳�V�쵲��C
   public SinglyLinked(int[] array) {
      Node newnode;
      first = null;         // ��l�}�Y����
      for ( int i = 0; i < array.length; i++ ) {
         // �إ߸`�I����
         newnode = new Node(array[i]);// �إ߸`�I
         newnode.next = first;     // �s�`�I���Ĥ@�Ӹ`�I
         first = newnode;          // ���]�}�Y����
      }
   }
   // ��k: �ˬd��C�O�_�O�Ū�
   public boolean isListEmpty() {
      if ( first == null ) return true;
      else                 return false;
   }
   // ��k: ��ܦ�C���
   public void printList() {
      Node current = first;       // �ثe����C����
      while ( current != null ) { // ��ܥD�j��
         System.out.print("[" + current.data + "]");
         current = current.next;  // �U�@�Ӹ`�I
      }
      System.out.println();
   }
   // ��k: �j�M�`�I���
   public Node searchNode(int d) {
      Node current = first;       // �ثe����C����
      while ( current != null ) { // �j�M�D�j��
         if ( current.data == d ) // �O�_�����
            return current;       // ���
         current = current.next;  // �U�@�Ӹ`�I
      }
      return null;                // �S�����
   }
}