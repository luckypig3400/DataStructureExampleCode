/* �{���d��: Ch3_3_1.java */
import java.io.*;
public class Ch3_3_1 { 
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      int temp;  // �ŧi�ܼ�
      int[] data = { 1, 2, 3, 4, 5, 6 };// �إߦ�C���}�C
      // �إ�, ���X�P�j�M��C
      SinglyLinked sl=new SinglyLinked(data);// �إߦ�C
      System.out.print("��Ӫ���C: ");
      sl.printList();  // ��ܦ�C
      System.out.println("��C�O�Ū�:"+sl.isListEmpty());
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      temp = 0;
      while ( temp != -1 ) {
        System.out.print("��J�j�M�l�H�s��(-1����)==> ");
        System.out.flush();           // �M���w�İ�
        // Ū���@�C, �ഫ�����
        temp = Integer.parseInt(input.readLine());
        if ( temp != -1 )    // �j�M�`�I���
          if ( sl.searchNode(temp) != null )
            System.out.println("��C�]�t�`�I["+temp+"]");
          else
            System.out.println("��C���t�`�I["+temp+"]");
      }
      input.close();                // ������y
   }
}