/* �{���d��: Ch5_4_1.java */ 
import java.io.*;
// ��J���������C���O, �~��������CCircularQueue���O
class Deque_Input extends CircularQueue {
   // �غc�l: �إ�����C
   public Deque_Input(int size) { super(size); }
   // ��k: �ˬd����C�O�_�O�Ū�
   public boolean isDequeEmpty() {
      return isCQueueEmpty();
   }
   // ��k: �ˬd����C�O�_�w��
   public boolean isDequeFull() {
      return isCQueueFull();
   }
   // ��k: �N��Ʀs�J����C
   public boolean endeque(int d) {
      return enqueue(d);
   }
   // ��k: �q����C(�e��)���X���
   public int dedeque_front() {
      return dequeue();
   }
   // ��k: �q����C(����)���X���
   public int dedeque_rear() {
      int temp;
      if ( isDequeEmpty() )         // �ˬd��C�O�_�O��
         return -1;                 // �L�k���X
      temp = queue[rear];
      rear--;                       // ���ݫ��Щ��e��
      // �O�_�W�L�}�C���, �B�q���q�e�ݨ��X
      if ( rear < 0 && front != -1 )
         rear = queue.length - 1;   // �q�̤j�ȶ}�l
      return temp;                  // �Ǧ^��C���X����
   }
}
// �D���O
public class Ch5_4_1 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �إ�����C����
      Deque_Input dq = new Deque_Input(10);
      int[] input = { 1, 2, 3, 4, 5, 6 }; // ��J����
      int[] output = new int[6];  // �x�s���X����
      int select;                 // �ﶵ
      int i, temp, pos = 0;
      for ( i = 0; i < 6; i++ )   // �N�}�C�����s�J����C
         dq.endeque(input[i]);
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("��J���������C�B�z......");
      while ( !dq.isDequeEmpty() ) {   // �D�j��
         System.out.print("[1]�q�����X [2]�q�e���X==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1:  // �q���ݨ��X��C���e
               temp = dq.dedeque_rear();
               output[pos++] = temp;
               break;
            case 2:  // �q�e�ݨ��X��C���e
               temp = dq.dedeque_front();
               output[pos++] = temp;
               break;
         }
      }
      System.out.print("�s�J����C����: "); // �s�J����
      for ( i = 0; i < 6; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n���X����C����: ");// ���X����
      for ( i = 0; i < 6; i++ )
         System.out.print("[" + output[i] + "]");
      System.out.println();
      in.close();                // ������y
   }
}