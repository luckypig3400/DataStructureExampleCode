/* �{���d��: Ch3_3_2.java */
import java.io.*;
// ��V�쵲��C���O 
class SinglyLinked_Delete extends SinglyLinked {
   // �غc�l: �إ߳�V��C
   public SinglyLinked_Delete(int[] data) {super(data);}
   // ��k: �R���`�I
   public int deleteNode(Node ptr) {
      Node current = first;   // ���V�e�@�`�I
      int value = ptr.data;   // ���o�R�����`�I��
      if ( isListEmpty() ) return -1;// �ˬd��C�O�_�Ū�
      if (ptr==first || ptr==null) { // ��C�}�l��null
         // ���p1: �R���Ĥ@�Ӹ`�I
         first = first.next;         // �R����1�Ӹ`�I
      } else {
         while (current.next!=ptr)   // ��`�Iptr���e�`�I
            current = current.next;
         if ( ptr.next == null )     // �O�_�O��C����
            // ���p2: �R���̫�@�Ӹ`�I
            current.next = null;     // �R���̫�@�Ӹ`�I
         else // ���p3: �R�������`�I
            current.next = ptr.next; // �R�������`�I
      }
      return value;                  // �Ǧ^�R�����`�I��
   }
}
// �D���O
public class Ch3_3_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp;  // �ŧi�ܼ�
      int[] dt = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      // �R���`�I
      SinglyLinked_Delete s=new SinglyLinked_Delete(dt);
      System.out.print("��Ӫ���C: ");
      s.printList();  // ��ܦ�C
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("��J�R�����s��(-1����)==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = s.searchNode(temp);  // ��M�`�I
            if ( ptr != null ) {
               temp = s.deleteNode(ptr); // �R���`�I
               System.out.println("�R���`�I: " + temp);
               System.out.print("�R�����C: ");
               s.printList();          // ��ܧR�����C
            }
         }
      }
      input.close();                // ������y
   }
}