/* �{���d��: Ch9_4_1.java */ 
import java.io.*;
class BSTree_Search extends BSTree {  // �~��BSTree���O
   // �غc�l
   public BSTree_Search(int[] data) {
      super(data);
   }
   // ��k: �G���j�M��ƧǪk
   public void BSTreeSort() {
      inOrder(head);     // �I�s���Ǩ��X��k
   }
   // ��k: �G���j�M��j�M�k���j�M��k
   public boolean BSTreeSearch(int data) {
      return findTree(this.head, data);
   }
   // ���j��k: ��M�`�I��ƪ����j��k
   private boolean findTree(TreeNode node, int data) {
      if ( node == null ) return false;
      else if ( node.data == data )    // ����ڸ`�I
              return true;
           else if ( data < node.data )// ���j�I�s���l��
                   return findTree(node.left, data);
           else    // ���j�I�s�k�l��
                   return findTree(node.right, data);
   }
}
public class Ch9_4_1 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �G����`�I���
      int[] data = {55,61,41,87,24,35,79,11,99};
      int key = 0;              // �j�M���
      // �إߤG���j�M��
      BSTree_Search bst = new BSTree_Search(data);
      bst.BSTreeSort();           // ����G���j�M��ƧǪk
      System.out.println();
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("�п�J�j�M��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // �I�s�G���j�M��j�M�k���j�M��k
            if ( bst.BSTreeSearch(key) )
               System.out.println("�j�M�����:" + key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}