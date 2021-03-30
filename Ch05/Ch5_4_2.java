/* �{���d��: Ch5_4_2.java */ 
import java.io.*;
// ��X���������C���O, �~�Ӧ�CQueue���O
class Deque_Output extends Queue {
   // �غc�l: �إ�����C
   public Deque_Output() { super(); }
   // ��k: �ˬd����C�O�_�O�Ū�
   public boolean isDequeEmpty() {
      return isQueueEmpty();
   }
   // ��k: �N��Ʀs�J(�e��)����C
   public void endeque_front(int d) {
      Node new_node = new Node(d);   // �إ߸`�I
      if ( isQueueEmpty() )    // �O�_�O�Ĥ@���s�J
         rear = new_node;      // rear���Vnew_node
      else
         new_node.next = front;// ���Jfront���e
      front = new_node;        // front���Vnew_node
   }
   // ��k: �N��Ʀs�J(����)����C
   public void endeque_rear(int d) {
      enqueue(d);
   }
   // ��k: �q����C���X���
   public int dedeque() {
      return dequeue();
   }
}
// �D���O
public class Ch5_4_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �إ�����C����
      Deque_Output dq = new Deque_Output();
      int[] input = { 1, 2, 3, 4, 5, 6 };   // ��J����
      int select;                 // �ﶵ
      int i;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("��X���������C�B�z......");
      for ( i = 0; i < 6; i++ ) { // �N�}�C�����s�J����C
         System.out.print("[1]�q���s�J [2]�q�e�s�J==> ");
         System.out.flush();      // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1:  // �q���ݦs�J��C���e
               dq.endeque_rear(input[i]);
               break;
            case 2:  // �q�e�ݦs�J��C���e
               dq.endeque_front(input[i]);
               break;
         }
      }
      System.out.print("�s�J����C����: ");// �s�J����
      for ( i = 0; i < 6; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n���X����C����: ");// ���X����
      while ( !dq.isDequeEmpty() )
         System.out.print("[" + dq.dedeque() + "]");
      System.out.println();
      in.close();                // ������y
   }
}