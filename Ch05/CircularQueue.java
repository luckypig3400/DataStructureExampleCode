/* �{���d��: CircularQueue.java */ 
public class CircularQueue { // ������C���O
   public int[] queue;       // ������C�}�C�ŧi
   public int front;         // ������C���e��
   public int rear;          // ������C������
   // �غc�l: �إ�������C
   public CircularQueue(int size) { 
      queue = new int[size]; // �إ߰}�C
      front = -1;
      rear = -1;
   }
   // ��k: �ˬd������C�O�_�O�Ū�
   public boolean isCQueueEmpty() {
      if ( front == rear ) return true;
      else                 return false;
   }
   // ��k: �ˬd������C�O�_�w��
   public boolean isCQueueFull() {
      int pos;
      pos = (rear+1) % queue.length;
      if ( front == pos ) return true;
      else                return false;
   }
   // ��k: �N��Ʀs�J������C
   public boolean enqueue(int d) {
      if ( isCQueueFull() )      // �ˬd�O�_�w��
         return false;           // �w��, �L�k�s�J
      else {               // �O�_�W�L,���s�w��
         rear = (rear+1) % queue.length;
         queue[rear] = d;
      }   
      return true;
   }
   // ��k: �q������C���X���
   public int dequeue() {
      if ( isCQueueEmpty() )     // �ˬd��C�O�_�O��
         return -1;              // �L�k���X
      front = (front+1) % queue.length; // ���s�w��
      return queue[front];          // �Ǧ^��C���X����
   }
}