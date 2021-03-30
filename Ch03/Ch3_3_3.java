/* �{���d��: Ch3_3_3.java */ 
import java.io.*;
// ��V�쵲��C���O
class SinglyLinked_Insert extends SinglyLinked {
   // �غc�l: �إ߳�V��C
   public SinglyLinked_Insert(int[] data) {super(data);}
   // ��k: ���J�`�I
   public void insertNode(Node ptr, int d) {
      Node newnode;
      // �إ߸`�I����
      newnode = new Node(d);
      if ( ptr == null ) {
         // ���p1: ���J�Ĥ@�Ӹ`�I
         newnode.next = first;   // �s�`�I������C�}�l
         first = newnode;
      }
      else {
         if ( ptr.next == null ) { // ��C�̫�@�Ӹ`�I
           // ���p2: ���J�̫�@�Ӹ`�I
           ptr.next = newnode;     // �̫���V�s�`�I
           newnode.next = null;    // �s�`�I���Vnull
         }
         else {
           // ���p3: ���J���������`�I
           newnode.next = ptr.next;// �s�`�I���V�U�@�`�I
           ptr.next = newnode;     // �`�Iptr���V�s�`�I
         }
      }
   }
}
// �D���O
public class Ch3_3_3 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp = 0;  // �ŧi�ܼ�
      int[] dt = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      SinglyLinked_Insert s=new SinglyLinked_Insert(dt);
      System.out.print("��Ӫ���C: ");
      s.printList();  // ��ܦ�C
      // �`�I���J
      s.insertNode(null, 50); // ���J�Ĥ@�Ӹ`�I
      System.out.print("���J���C: ");
      s.printList();          // ��ܴ��J���C
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("��J���J�s��(-1����)==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = s.searchNode(temp); // ��M�`�I
            if ( ptr != null ) {
               System.out.print("��J�s�s��(0~100)==> ");
               System.out.flush();         // �M���w�İ�
               // Ū���s���l�H�s��
               temp = Integer.parseInt(input.readLine());
               s.insertNode(ptr, temp);
               System.out.print("���J���C: ");
               s.printList();          // ��ܴ��J���C
            }
         }
      }
      input.close();                // ������y
   }
}