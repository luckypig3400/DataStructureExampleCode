/* �{���d��: Queue.java */ 
public class Queue {    // ��C���O
   public Node front;   // ��C���e��
   public Node rear;    // ��C������
   // �غc�l
   public Queue() {
      front = null;     // ��l��C����
      rear = null;
   }
   // ��k: �s�J��C���
   public void enqueue(int d) {
      Node new_node = new Node(d); // �إ߸`�I
      // �ˬd��C�O�_�O�Ū�
      if ( isQueueEmpty() )
         front = new_node;         // ���J������1�Ӹ`�I
      else rear.next = new_node;   // �s�W�b����
      rear = new_node;             // ��s���ݫ���
   }
   // ��k: ���X��C���
   public int dequeue() {
      int d;
      // �ˬd��C�O�_�O�Ū�
      if ( !isQueueEmpty() ) {  // ���O�Ū�
         if ( front == rear )     // �̫�`�I���S���p
            rear = null;          // ��s���ݫ���
         d = front.data;          // ���o��C���
         front = front.next;      // �R����1�Ӹ`�I
         return d;                // �Ǧ^�`�I���
      }
      else return -1;             // ��C�O�Ū�
   }
   // ��k: �ˬd��C�O�_�O�Ū�
   public boolean isQueueEmpty() {
       return front == null;
   }
}