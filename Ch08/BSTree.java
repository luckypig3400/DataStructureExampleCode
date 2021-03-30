/* �{���d��: BSTree.java */ 
class TreeNode {    // ��`�I���O
   char data;        // �`�I���
   TreeNode left;   // �Ѧҥ��l��
   TreeNode right;  // �Ѧҥk�l��
   // �غc�l
   public TreeNode(char data) {
      this.data = data;
      this.left = null;
      this.right = null;
   }
}
// �G���j�M�����O
public class BSTree {
   public TreeNode head;   // �ѦҾ𪺮ڸ`�I
   // �غc�l(1): �إߪŪ��G���j�M��
   public BSTree() { head = null; }
   // �غc�l(2): �ϥΰ}�C�إߤG���j�M��
   public BSTree(char[] array) {
      int i;
      // �ϥΰj��H���J�覡�إ߾𪬵��c
      for ( i = 0; i < array.length; i++ )
         insertBSTreeNode(array[i]);
   }
   // ��k: �ˬd�G���j�M��O�_�O�Ū�
   boolean isBSTreeEmpty() {
      if ( head == null ) return true;
      else                return false;
   }
   // ��k: �b�G���j�M�𴡤J�`�I
   public void insertBSTreeNode(char data) {
      if ( head == null ) {  // �إ߮ڸ`�I
         head = new TreeNode(data);
         return;
      }
      // �إߤG���j�M��
      TreeNode current = head;
      while (true) {
         if ( data < current.data ) {  // �b���l��
            if ( current.left == null ) {
               current.left = new TreeNode(data);
               return;
            }
            else  current = current.left;
         }
         else {  // �b�k�l��
            if ( current.right == null ) {
               current.right = new TreeNode(data);
               return;
            }
            else  current = current.right;
         }
      }
   }
   // ��k: ��ܤG���j�M�𪺸`�I���
   public void printBSTree() {
      inOrder(this.head);
   }
   // ��k: ���Ǩ��X�����j��k
   public void inOrder(TreeNode node) {
      if ( node != null ) {  // ���X���l��
         inOrder(node.left);
         // ��ܸ`�I���
         System.out.print("["+node.data+"]");
         // ���X�k�l��
         inOrder(node.right);
      }
   }
}