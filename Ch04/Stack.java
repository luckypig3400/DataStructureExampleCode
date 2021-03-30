/* �{���d��: Stack.java */ 
public class Stack implements StackInterface{ // ���|���O
   private Node top;           // ���|����
   // �غc�l: �إ߰��|
   public Stack() { top = null; }
   // ��k: �ˬd���|�O�_�O�Ū�
   public boolean isStackEmpty() {
      if ( top == null ) return true;
      else               return false;
   }
   // ��k: �N��Ʀs�J���|
   public boolean push(int d) {
      Node new_node;           // �s�`�I����
      // �إ߸`�I����
      new_node = new Node(d);
      new_node.next = top;     // �s�`�I���V��}�l
      top = new_node;          // �s�`�I�������|�}�l
      return true;             // ���\�N�`�I�s�J���|
   }
   // ��k: �q���|���X���
   public int pop() {
      Node ptr;                // ���V���|����
      if ( !isStackEmpty() ) { // ���|�O�_�O�Ū�
         ptr = top;            // ���V���|����
         top = top.next;       // ���|���Ы��V�U�`�I
         return ptr.data;      // ���X���
      }
      else return -1;
   }
}