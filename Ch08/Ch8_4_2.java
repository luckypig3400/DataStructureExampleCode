/* �{���d��: Ch8_4_2.java */ 
import java.io.*;
class BSTree_Sort extends BSTree {     // �~��BSTree���O
   // �غc�l
   public BSTree_Sort(char[] data) {
      super(data);
   }
   // ��k: �G���j�M��ƧǪk
   public void BSTreeSort() {
      inOrder(head);     // �I�s���Ǩ��X��k
   }
}
public class Ch8_4_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // �ܼƫŧi
      int len;
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("�п�J�ƧǦr��:");
      System.out.flush();           // �M���w�İ�
      str = input.readLine();       // Ū���@�C
      input.close();                // ������y
      len = str.length();           // ���o�r�����
      char[] data = new char[len];  // �r���}�C�ŧi
      data = str.toCharArray();     // �ഫ���}�C
      // �إߤG���j�M��
      BSTree_Sort bst = new BSTree_Sort(data);
      bst.BSTreeSort();           // ����G���j�M��ƧǪk
   }
}