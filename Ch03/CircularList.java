/* �{���d��: CircularList.java */ 
// �����쵲��C���O, �~�ө�H���OList, ��@ListInterface
public class CircularList extends List
                          implements ListInterface {
   // �غc�l: �إ������쵲��C
   public CircularList(int[] array) {
      Node last = first;   // �̫�@�Ӹ`�I������
      Node newnode;
      for ( int i = 0; i < array.length; i++ ) {
         // �إ߸`�I����
         newnode = new Node(array[i]);
         if ( i==0 ) last = newnode; // ���V�̫�@�Ӹ`�I
         newnode.next = first;
         first = newnode;
      }
      last.next = first;   // �s����1�Ӹ`�I, �إ�������C
   }
   // ��k: �ˬd��C�O�_�O�Ū�
   public boolean isListEmpty() {
      if ( first == null ) return true;
      else                 return false;
   }
   // ��k: ��ܦ�C���
   public void printList() {
      Node current = first;  // �ثe����C����
      do {  // ��ܥD�j��
         System.out.print("[" + current.data + "]");
         current = current.next;  // �U�@�Ӹ`�I
      } while ( current != first );
      System.out.println();
   }
   // ��k: ���o��C����
   public int length() {
      Node current = first;  // �ثe����C����
      int count = 0;
      if ( !isListEmpty() )
         do {  // �p�ƥD�j��
            count++;
            current = current.next;  // �U�@�Ӹ`�I
         } while ( current != first );
      return count;
   }
   // ��k: ���o�u�ʦ�C����i�Ӥ���
   public Node getNode(int i) {
      Node current = first;  // �ثe����C����
      int count = 1;         // �ѼƱq1�}�l
      while ( count < i ) {
         current = current.next;  // �U�@�Ӹ`�I
         count++;            // �p�ƥ[1
      }
      return current;
   }
   // ��k: �j�M�`�I���
   public Node searchNode(int d) {
      Node current = first;       // �ثe����C����
      do {  // �j�M�D�j��
         if ( current.data == d ) // �O�_�����
            return current;       // ���
         current = current.next;  // �U�@�Ӹ`�I
      } while (current != first && first != first.next);
      return null;                // �S�����
   }
   // ��k: ���J�`�I
   public void insertNode(Node ptr, int d) {
      Node previous, newnode;
      // �إ߸`�I����
      newnode = new Node(d);
      if ( isListEmpty() ) {       // ��C�O�Ū�
          first = newnode;         // �Ĥ@�Ӹ`�I
          first.next = newnode;    // �U�@�ӫ��V�ۤv
      }
      if ( ptr == null ) {
         // ���p1: ���J�Ĥ@�Ӹ`�I�B������C�}�l
         newnode.next = first;     // �s�`�I������C�}�l
         previous = first;
         // ��X�̫�@�Ӹ`�I
         while ( previous.next != first )
            previous=previous.next;// �U�@�Ӹ`�I
         previous.next = newnode;  // ���V�s���Ĥ@�Ӹ`�I
         first = newnode;          // �s����C�}�l
      }
      else {
         // ���p2: ���b�`�I����
         newnode.next = ptr.next;  // �s�`�I���V�U�@�`�I
         ptr.next = newnode;       // �`�Iptr���V�s�`�I
      }
   }
   // ��k: �R���`�I
   public int deleteNode(Node ptr) {
      Node previous;               // �e�@�`�I����
      int value = ptr.data;        // �`�I��
      if ( isListEmpty() ) return -1;// ��C�O�Ū�
      previous = first;
      if ( first != first.next )     // ��C�W�L�@�Ӹ`�I
         while ( previous.next != ptr ) // ��ptr�e�@�Ӹ`�I
           previous = previous.next; // �U�@�Ӹ`�I
      if ( ptr == first ) {          // �p�G�O�Ĥ@�`�I
         // ���p1: �R����1�Ӹ`�I
         first = first.next;         // �U�@�Ӹ`�I
         previous.next = ptr.next;   // �e�`�I���V�U�@�`�I
      }
      else
         // ���p2: �R�������`�I
         previous.next = ptr.next;   // �e�`�I���V�U�@�`�I
      return value;                  // �Ǧ^�R�����`�I��
   }
}