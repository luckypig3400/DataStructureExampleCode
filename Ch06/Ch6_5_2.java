/* �{���d��: Ch6_5_2.java */ 
import java.io.*;
class BSTree_Delete extends BSTree {// �~�ӤG���j�M�����O
   // �غc�l: �إߤG���j�M��
   public BSTree_Delete(int[] data) { super(data); }
   // ��k: �G���j�M�𪺸`�I�R��
   public void deleteBSTreeNode(int d) {
      TreeNode parent;      // ���`�I����
      TreeNode ptr;         // �R���`�I����
      TreeNode child;       // �l�`�I����
      boolean isfound = false; // �O�_���R���`�I
      // ��M�R���`�I�M����`�I����
      parent = ptr = head;
      while ( ptr != null && !isfound ) { // �D�j��
         if ( ptr.data == d )
            isfound = true;      // ���R���`�I
         else {
            parent = ptr;        // �O�d���`�I����
            if ( ptr.data > d )  // ������
               ptr = ptr.left;   // ���l��
            else
               ptr = ptr.right;  // �k�l��
         }
      }
      if ( ptr == null ) return; // �S�����R���`�I
      // �R���G���j�M�𪺸`�I, ���p1: ���`�I
      if ( ptr.left == null && ptr.right == null ) {
         if ( ptr == head ) head = null;  // �ڸ`�I
         else if ( parent.left == ptr )
              parent.left = null;  // ���l�`�I
            else
              parent.right = null; // �k�l�`�I
         return;
      }
      // ���p2: �S�����l��
      if ( ptr.left == null ) {
         if ( parent != ptr )    // �۵��O�ڸ`�I
            if ( parent.left == ptr )
               parent.left = ptr.right;    // ���l�`�I
            else parent.right = ptr.right; // �k�l�`�I
         else head = head.right;  // �ڸ`�I���V�k�l�`�I
         return;
      } // ���p3: �S���k�l��
      if ( ptr.right == null ) {
         if ( parent != ptr )     // �۵��O�ڸ`�I
            if ( parent.right == ptr )
                parent.right = ptr.left; // �k�l�`�I
            else parent.left = ptr.left; // ���l�`�I
         else head = head.left;   // �ڸ`�I���V���l�`�I
         return;
      } // ���p4: �����l��M�k�l��
      parent = ptr;               // ���`�I���V�R���`�I
      child = ptr.left;           // �]�w�����l�`�I
      while ( child.right != null ) { // ���̥k�����`�I
         parent = child;              // �O�d���`�I����
         child = child.right;         // ���k�l��
      }
      ptr.data = child.data;        // �]�w�����`�I���
      if ( parent.left == child )   // �l�`�I�S���k�l��
         parent.left = null;
      else parent.right = child.left; // �s�����中�`�I
      return;
   }
}
// �D���O
public class Ch6_5_2 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �G���j�M�𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      int key = 0;              // �R�����`�I��
      // �إߤG���j�M�𪫥�
      BSTree_Delete bst = new BSTree_Delete(data);
      System.out.println("�R���e���`�I���e: ");
      bst.printBSTree();
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("��J�R���`�I1~9(-1����)==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         key = Integer.parseInt(input.readLine());
         if ( key != -1 ) {  // �R���`�I���
            bst.deleteBSTreeNode(key); // �R���`�I
            System.out.print("�R���᪺�`�I���e: ");
            bst.printBSTree();          // ��ܤG���j�M��
         }
      }
      input.close();                // ������y
   }
}