/* �{���d��: Ch5_5.java */ 
class PriorityQueue {           // �u����C���O
   private Comparable[] queue;  // �u����C���}�C�ŧi
   private int pos;             // �ثe�s�J���}�C���ޭ�
   // �غc�l: �إ��u����C
   public PriorityQueue(int size) {
      queue = new Comparable[size]; // �إ߰}�C
      pos = 0;                      // ��l���ޭ�
   }
   // ��k: �ˬd�u����C�O�_�O�Ū�
   public boolean isPriorityQueueEmpty() {
      return pos == 0;    // �O�_�O�Ū�
   }
   // ��k: �N�����s�J�u����C
   public boolean enqueue(Comparable item) {
      if ( pos == queue.length )    // �ˬd�O�_�w��
         return false;              // �w��, �L�k�s�J
      else
         queue[pos++] = item;       // �s�J��C
      return true;
   }
   // ��k: �q�u����C���X����
   public Comparable dequeue() {
      int maxPriority = 0;          // �̰��u���v�����ޭ�
      Comparable item;
      if ( isPriorityQueueEmpty() ) // �ˬd��C�O�_�O��
         return null;               // �L�k���X
      // ��X�̰��u���v����C����
      for (int i = 1 ; i < pos; i++) {
         // ��X�̤j�����ޭ�, �̰��u���v
         if (queue[i].compareTo(queue[maxPriority]) > 0)
             maxPriority = i;   // ����U�@�ӯ���
      }
      item = queue[maxPriority];// ���X�̰��u���v������
      // �h���C�Ū��}�C����
      pos--;                    // �R���@�Ӥ���
      queue[maxPriority] = queue[pos]; // ���N���X����
      return item;
   }
}
// �D���O
public class Ch5_5 {
   // �D�{��
   public static void main(String[] args) {
      int[] data = {3, 2, 1, 6, 5, 4};    // �ŧi�}�C
      // �إ��u����C����
      PriorityQueue pq = new PriorityQueue(10);
      System.out.print("�s�J��C��ƪ�����: ");
      // �ϥΰj��N��Ʀs�J��C
      for ( int i = 0; i < 6; i++) {
         pq.enqueue(new Integer(data[i]));// �s�J��C
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n���X��C��ƪ�����: ");
      while ( !pq.isPriorityQueueEmpty() )// ���X��C���
         System.out.print("["+(Integer)pq.dequeue()+"]");
      System.out.println();
   }
}