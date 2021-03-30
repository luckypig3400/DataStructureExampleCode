/* �{���d��: Ch4_2_2.java */ 
import java.io.*;
class Node {     // �`�I���O
   int data;     // �`�I���
   Node next;    // �ѦҤU�@�Ӹ`�I
   // �غc�l: �إ߸`�I���
   public Node(int data) { this.data = data; }
}
class Stack_List implements StackInterface { // ���|���O
   private Node top;           // ���|����
   // �غc�l: �إ߰��|
   public Stack_List() { top = null; }
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
      int temp;
      if ( !isStackEmpty() ) { // ���|�O�_�O�Ū�
         ptr = top;            // ���V���|����
         top = top.next;       // ���|���Ы��V�U�`�I
         return ptr.data;      // ���X���
      }
      else return -1;
   }
}
// �D���O
public class Ch4_2_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      Stack_List st = new Stack_List(); // �إ߰��|����
      int[] input = new int[100]; // �x�s��J����
      int[] output = new int[100];// �x�s���X����
      int select = 1;             // �ﶵ
      int numOfInput  = 0;        // �}�C��������
      int numOfOutput = 0;
      int i, temp;
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.println("�쵲��C�����|�B�z......");
      while ( select != 3 ) {   // �D�j��
         System.out.print("[1]�s�J [2]���X ");
         System.out.print("[3]��ܥ������e ==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         select = Integer.parseInt(in.readLine());
         switch ( select ) {
            case 1: // �N��J�Ȧs�J���|
               System.out.print("�п�J�s�J��(");
               System.out.print(numOfInput + ")==> ");
               System.out.flush();    // �M���w�İ�
               // Ū���@�C, �ഫ����ƭ�
               temp = Integer.parseInt(in.readLine());
               st.push(temp);         // �s�J���|
               input[numOfInput++] = temp;
               break;
            case 2: // ���X��C�����e
               if ( !st.isStackEmpty() ) {
                  temp = st.pop();
                  System.out.println("���X����: "+temp);
                  output[numOfOutput++] = temp;
               }
               break;
         }
      }
      System.out.print("��J���|������: ");  // ��J����
      for ( i = 0; i < numOfInput; i++ )
         System.out.print("[" + input[i] + "]");
      System.out.print("\n���X���|������: ");// ��X����
      for ( i = 0; i < numOfOutput; i++ )
         System.out.print("[" + output[i] + "]");
      System.out.print("\n���|�ѤU������: ");// �ѤU����
      while ( !st.isStackEmpty() )
         System.out.print("[" + st.pop() + "]");
      System.out.println();
      in.close();                // ������y
   }
}