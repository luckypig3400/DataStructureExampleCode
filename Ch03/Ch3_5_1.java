/* �{���d��: Ch3_5_1.java */
import java.io.*; 
public class Ch3_5_1 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp = 1;  // �ŧi�ܼ�
      int[] data = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      // �إ߻P���X���V��C
      DoublyLinked dl = new DoublyLinked(data);
      // �إ�BufferedReader����J��y����
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( temp != 5 ) {   // �D�j��
         System.out.print("��Ӫ���C: ");
         dl.printDList();     // ������V��C
         System.out.print("[1]���U���� [2]���e���� [3]");
         System.out.print("���] [4]�`�I�� [5]���} ==> ");
         System.out.flush();    // �M���w�İ�
         // Ū���@�C, �ഫ����ƿﶵ
         temp = Integer.parseInt(in.readLine());
         switch ( temp ) {
            case 1: dl.nextNode();     // ���U����
               break;
            case 2: dl.previousNode(); // ���e����
               break;
            case 3: dl.resetNode();    // ���]����
               break;
            case 4: // Ū���`�I��
               System.out.println("�`�I��: "
                                   + dl.readNode().data);
               break;
         }
      }
      in.close();                // ������y
   }
}