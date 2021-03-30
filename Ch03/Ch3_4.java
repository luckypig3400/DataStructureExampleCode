/* �{���d��: Ch3_4.java */
import java.io.*;
public class Ch3_4 { 
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp;  // �ŧi�ܼ�
      int[] data = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      // �إ�, ���X�P�j�M��C
      CircularList cl = new CircularList(data); // �إߦ�C
      System.out.print("��Ӫ���C: ");
      cl.printList();  // ��ܦ�C
      System.out.println("��C�O�_�Ū�: " + cl.isListEmpty());
      System.out.println("��C����: " + cl.length());
      System.out.println("��3�Ӹ`�I���: " + cl.getNode(3).data);
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("�п�J�j�M���l�H�s��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 )    // �j�M�`�I���
            if ( cl.searchNode(temp) != null )
               System.out.println("��C�]�t�`�I[" + temp + "]");
            else
               System.out.println("��C���t�`�I[" + temp + "]");
      }
      // �`�I���J
      cl.insertNode(null, 50); // ���J�Ĥ@�Ӹ`�I
      System.out.print("���J���C: ");
      cl.printList();          // ��ܴ��J���C
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("�п�J���J��᪺�l�H�s��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = cl.searchNode(temp);  // ��M�`�I
            if ( ptr != null ) {
               System.out.print("�п�J�s���l�H�s��(0~100) ==> ");
               System.out.flush();           // �M���w�İ�
               temp = Integer.parseInt(input.readLine()); // Ū���s���l�H�s��
               cl.insertNode(ptr, temp);
               System.out.print("���J���C: ");
               cl.printList();          // ��ܧR�����C
            }
         }
      }
      // �R���`�I
      temp = 0;
      while ( temp != -1 ) {
         System.out.print("�п�J�R�����l�H�s��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         temp = Integer.parseInt(input.readLine());
         if ( temp != -1 ) {
            Node ptr = cl.searchNode(temp);  // ��M�`�I
            if ( ptr != null ) {
               temp = cl.deleteNode(ptr); // �R���`�I
               System.out.println("�R���`�I: " + temp);
               System.out.print("�R�����C: ");
               cl.printList();          // ��ܧR�����C
            }
         }
      }
      input.close();                // ������y
   }
}