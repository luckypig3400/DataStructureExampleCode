/* �{���d��: Ch5_3.java */ 
import java.io.*;
class CQueue { // ������C���O
   private int[] queue;      // ������C�}�C�ŧi
   private int front;        // ������C���e��
   private int rear;         // ������C������
   // �غc�l: �إ�������C
   public CQueue(int size) {
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
      else {                  // �O�_�W�L,���s�w��
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
// �D���O
public class Ch5_3 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      CQueue cq = new CQueue(4);  // �إߦ�C����
      int[] input = new int[100]; // �x�s��J����
      int[] output = new int[100];// �x�s���X����
      int select = 1;             // �ﶵ
      int numOfInput  = 0;        // �}�C��������
      int numOfOutput = 0;
      int i, temp;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("������C�B�z......");
      while ( select != 3 ) {   // �D�j��
         System.out.print("[1]�s�J [2]���X ");
         System.out.print("[3]��ܥ������e ==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1: // �N��J�Ȧs�J��C
               System.out.print("�п�J�s�J��(");
               System.out.print(numOfInput + ")==> ");
               System.out.flush();    // �M���w�İ�
               // Ū���@�C, �ഫ����ƭ�
               temp = Integer.parseInt(in.readLine());
               cq.enqueue(temp);   // �s�J������C
               input[numOfInput++] = temp;
               break;
            case 2: // ���X��C�����e
               if ( !cq.isCQueueEmpty() ) {
                  temp = cq.dequeue();
                  System.out.println("���X����: "+temp);
                  output[numOfOutput++] = temp;
               }
               break;
         }
      }
      System.out.print("��J��C������: ");  // ��J����
      for ( i = 0; i < numOfInput; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n���X��C������: ");// ��X����
      for ( i = 0; i < numOfOutput; i++ )
         System.out.print("[" + output[i] + "]");
      System.out.print("\n��C�ѤU������: ");// �ѤU����
      while ( !cq.isCQueueEmpty() )
         System.out.print("[" + cq.dequeue() + "]");
      System.out.println();
      in.close();                // ������y
   }
}