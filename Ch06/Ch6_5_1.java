/* �{���d��: Ch6_5_1.java */ 
import java.io.*;
class BSTree_Search extends BSTree {// �~�ӤG���j�M�����O
   // �غc�l: �إߤG���j�M��
   public BSTree_Search(int[] data) { super(data); }
   // ��k: �G���j�M�𪺷j�M
   public boolean searchBSTreeNode(int d) {
      TreeNode ptr = head;
      while ( ptr != null ) {    // �D�j��
         if ( ptr.data == d )    // ���F
            return true;         // �Ǧ^�`�I����
         else
            if ( ptr.data > d )  // ������
               ptr = ptr.left;   // ���l��
            else
               ptr = ptr.right;  // �k�l��
      }
      return false;              // �S�����
   }
}
// �D���O
public class Ch6_5_1 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �G���j�M�𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      int key = 0;              // �j�M���
      // �إߤG���j�M�𪫥�
      BSTree_Search bst = new BSTree_Search(data);
      System.out.println("�G���j�M�𪺸`�I���e: ");
      bst.printBSTree();
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("�п�J�j�M��1~9(-1����)==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // �I�s�G���j�M��j�M�k���j�M��k
            if ( bst.searchBSTreeNode(key) )
               System.out.println("�j�M�����:" + key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}