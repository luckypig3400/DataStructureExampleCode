/* �{���d��: Ch3_5_2.java */ 
import java.io.*;
// ���V�쵲��C���O
class DoublyLinked_Insert extends DoublyLinked {
   // �غc�l: �إ����V��C
   public DoublyLinked_Insert(int[] data) {super(data);}
   // ��k: ���J�`�I
   public void insertDNode(DNode ptr, int d) {
      DNode newnode = new DNode(d);// �إ߸`�I����
      if ( first == null )         // �p�G��C�O�Ū�
         first = newnode;          // �Ǧ^�s�`�I����
      if ( ptr == null ) {
         // ���p1: ���b�Ĥ@�Ӹ`�I���e, ������C�}�l
         newnode.previous = null;  // �e���Ь�null
         newnode.next = first;     // �s�`�I���V��C�}�l
         first.previous = newnode; // ��`�I���V�s�`�I
         first = newnode;          // �s�`�I������C�}�l
      }
      else {
         if ( ptr.next == null ) { // �O�_�O�̫�@�Ӹ`�I
            // ���p2: ���b��C���̫�
            ptr.next = newnode;    // �̫�`�I���V�s�`�I
            newnode.previous = ptr;// �s�`�I���^�̫�`�I
            newnode.next = null;   // ��^���Ь�null
         }
         else {
            // ���p3: ���J�`�I�ܦ�C�������`�I
            ptr.next.previous = newnode; // ���^�s�`�I
            newnode.next = ptr.next;     // ���V�U�@�`�I
            newnode.previous = ptr; // �s�`�I���^���J�`�I
            ptr.next = newnode;     // ���J�`�I���V�s�`�I
         }
      }
   }
}
// �D���O
public class Ch3_5_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp = 0;  // �ŧi�ܼ�
      int[] d = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      DoublyLinked_Insert dl=new DoublyLinked_Insert(d);
      System.out.print("��Ӫ���C: ");
      dl.printDList();  // ��ܦ�C
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      // �`�I���J
      dl.insertDNode(null, 50); // ���J�Ĥ@�Ӹ`�I
      while ( temp != 4 ) {
         System.out.print("���J���C: ");
         dl.printDList();          // ��ܴ��J���C
         System.out.print("[1]���U���� [2]���e���� ");
         System.out.print("[3]�s�W�`�I [4]���} ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         switch ( temp ) {
            case 1: dl.nextNode();     // ���U����
               break;
            case 2: dl.previousNode(); // ���e����
               break;
            case 3: // �s�W�`�I
               System.out.print("��J�s���X(7~100)==> ");
               System.out.flush();     // �M���w�İ�
               temp = Integer.parseInt(input.readLine());
               dl.insertDNode(dl.readNode(), temp);
               dl.resetNode();         // ���]�ثe����
               break;
         }
      }
      input.close();                   // ������y
   }
}