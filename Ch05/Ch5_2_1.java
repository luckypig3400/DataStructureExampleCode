/* �{���d��: Ch5_2_1.java */ 
class Queue_Array implements QueueInterface{ // ��C���O
   private int[] queue;        // ��C�}�C�ŧi
   private int front;          // ��C���e��
   private int rear;           // ��C������
   // �غc�l: �إߦ�C
   public Queue_Array(int size) {
      queue = new int[size];   // �إ߰}�C
      front = -1;
      rear = -1;
   }
   // ��k: �ˬd��C�O�_�O�Ū�
   public boolean isQueueEmpty() {
      if ( front == rear ) return true;
      else                 return false;
   }
   // ��k: �N��Ʀs�J��C
   public boolean enqueue(int d) {
      if ( rear >= queue.length )  // �O�_�W�L��C�e�q
         return false;
      else {
         queue[++rear] = d;    // �s�J��C
         return true;
      }
   }
   // ��k: �q��C���X���
   public int dequeue() {
      if ( isQueueEmpty() )    // ��C�O�_�O�Ū�
         return -1;
      else
         return queue[++front];// ���X���
   }
}
// �D���O
public class Ch5_2_1 {
   // �D�{��
   public static void main(String[] args) {
      int[] data = {1, 2, 3, 4, 5, 6};    // �ŧi�}�C
      Queue_Array q = new Queue_Array(10);// �إߦ�C����
      int i;
      System.out.print("�s�J��C��ƪ�����: ");
      // �ϥΰj��N��Ʀs�J��C
      for ( i = 0; i < 6; i++) {
         q.enqueue(data[i]);
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n���X��C��ƪ�����: ");
      while ( !q.isQueueEmpty() )   // ���X��C���
         System.out.print("[" + q.dequeue() + "]");
      System.out.println();
   }
}