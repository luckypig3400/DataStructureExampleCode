/* �{���d��: Ch3_5_3.java */
import java.io.*;  
// ���V�쵲��C���O
class DoublyLinked_Delete extends DoublyLinked {
   // �غc�l: �إ����V��C
   public DoublyLinked_Delete(int[] data) {super(data);}
   // ��k: �R���`�I
   public void deleteDNode(DNode ptr) {
      if ( ptr.previous == null ) { // �O�_���e�@�Ӹ`�I
         // ���p1: �R���Ĥ@�Ӹ`�I
         first = first.next;        // ���V�U�@�Ӹ`�I
         first.previous = null;     // �]�w���V�e�`�I����
      }
      else {
         if ( ptr.next == null ) {  // �O�_���U�@�Ӹ`�I
            // ���p2: �R���̫�@�Ӹ`�I
            ptr.previous.next = null;// �e�`�I���Vnull
         }
         else {
            // ���p3: �R���������`�I
            // �e�`�I���V�U�@�`�I
            ptr.previous.next = ptr.next;
            // �U�@�`�I���V�e�`�I
            ptr.next.previous = ptr.previous;
         }
      }
   }
}
// �D���O
public class Ch3_5_3 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp = 0;  // �ŧi�ܼ�
      int[] d = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      DoublyLinked_Delete dl=new DoublyLinked_Delete(d);
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( temp != 4 ) {
         System.out.print("�ثe����C: ");
         dl.printDList();              // ��ܥثe����C
         System.out.print("[1]���U���� [2]���e���� ");
         System.out.print("[3]�R���`�I [4]���} ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         switch ( temp ) {
            case 1: dl.nextNode();     // ���U����
               break;
            case 2: dl.previousNode(); // ���e����
               break;
            case 3: // �R���`�I
               dl.deleteDNode(dl.readNode());
               dl.resetNode();         // ���]�ثe����
               break;
         }
      }
      input.close();                   // ������y
   }
}