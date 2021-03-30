/* �{���d��: Ch5_2_2.java */ 
import java.io.*;
class Node {      // �`�I���O
   int data;      // �`�I���
   Node next;     // �U�@�Ӹ`�I
   // �غc�l
   public Node(int data) {
      this.data = data;
      next = null;
   }
}
class Queue_List implements QueueInterface{ // ��C���O
   private Node front;  // ��C���e��
   private Node rear;   // ��C������
   // �غc�l
   public Queue_List() { front = null;   rear = null; }
   // ��k: �s�J��C���
   public boolean enqueue(int d) {
      Node new_node = new Node(d);// �إ߸`�I
      // �ˬd��C�O�_�O�Ū�
      if ( rear == null )
         front = new_node;        // ���J������1�Ӹ`�I
      else rear.next = new_node;  // �s�W�b����
      rear = new_node;            // ��s���ݫ���
      return true;
   }
   // ��k: ���X��C���
   public int dequeue() {
      int d; // �ˬd��C�O�_�O�Ū�
      if ( !isQueueEmpty() ) {    // ���O�Ū�
         if ( front == rear )     // �̫�`�I���S���p
            rear = null;          // ��s���ݫ���
         d = front.data;          // ���o��C���
         front = front.next;      // �R����1�Ӹ`�I
         return d;                // �Ǧ^�`�I���
      }
      else return -1;             // ��C�O�Ū�
   }
   // ��k: �ˬd��C�O�_�O�Ū�
   public boolean isQueueEmpty() {return front == null;}
}
// �D���O
public class Ch5_2_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      Queue_List q = new Queue_List(); // �إߦ�C����
      int[] input = new int[100]; // �x�s��J����
      int[] output = new int[100];// �x�s���X����
      int select = 1;             // �ﶵ
      int numOfInput  = 0;        // �}�C��������
      int numOfOutput = 0;
      int i, temp;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("�쵲��C����C�B�z......");
      while ( select != 3 ) {   // �D�j��
         System.out.print("[1]�s�J [2]���X");
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
               q.enqueue(temp);    // �s�J��C
               input[numOfInput++] = temp;
               break;
            case 2: // ���X��C�����e
               if ( !q.isQueueEmpty() ) {
                  temp = q.dequeue();
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
      while ( !q.isQueueEmpty() )
         System.out.print("[" + q.dequeue() + "]");
      System.out.println();
      in.close();                // ������y
   }
}