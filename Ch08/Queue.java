/* �{���d��: Queue.java */ 
class Node {      // �`�I���O
   int data;      // �`�I���
   Node next;     // �U�@�Ӹ`�I
   // �غc�l
   public Node(int data) {
      this.data = data;
      next = null;
   }
}
public class Queue {    // ��C���O
   private Node front;  // ��C���e��
   private Node rear;   // ��C������
   // �غc�l
   public Queue() {
      front = null;     // ��l��C����
      rear = null;
   }
   // ��k: �s�J��C���
   public void enqueue(int data) {
      Node new_node = new Node(data);   // �إ߸`�I
      // �ˬd��C�O�_�O�Ū�
      if ( isQueueEmpty() )
         front = new_node;        // ���J������1�Ӹ`�I
      else rear.next = new_node;  // �s�W�b����
      rear = new_node;            // ��s���ݫ���
   }
   // ��k: ���X��C���
   public int dequeue() {
      int data;
      // �ˬd��C�O�_�O�Ū�
      if ( !isQueueEmpty() ) {    // ���O�Ū�
         if ( front == rear )     // �̫�`�I���S���p
            rear = null;          // ��s���ݫ���
         data = front.data;       // ���o��C���
         front = front.next;      // �R����1�Ӹ`�I
         return data;             // �Ǧ^�`�I���
      }
      else return -1;             // ��C�O�Ū�
   }
   // ��k: �ˬd��C�O�_�O�Ū�
   public boolean isQueueEmpty() {
       return front == null;
   }
}