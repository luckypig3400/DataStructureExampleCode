/* �{���d��: BTree.java */ 
public class BTree {       // �G�������O
   public TreeNode head;   // �ѦҾ𪺮ڸ`�I
   // �غc�l: �ϥΰ}�C�إߤG����
   public BTree(int[] array) {
      int i;
      // �ϥΰj��H���J�覡�إ߾𪬵��c
      for ( i = 0; i < array.length; i++ )
         insertBTreeNode(array[i]);
   }
   // ��k: �ˬd�G����O�_�O�Ū�
   boolean isBTreeEmpty() {
      if ( head == null ) return true;
      else                return false;
   }
   // ��k: �b�G���𴡤J�`�I
   public void insertBTreeNode(int data) {
      if ( isBTreeEmpty() ) {  // �إ߮ڸ`�I
         head = new TreeNode(data);
         return;
      }
      // �إߤG����
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
   // ��k: ��ܤG���𪺸`�I���
   public void printBTree() {
      TreeNode ptr;
      System.out.println("�ڸ`�I: [" + head.data + "]");
      ptr = head.left;      // ���l�𪺫���
      System.out.print("���l��: ");
      while ( ptr != null ) {
         System.out.print("["+ptr.data+"]"); // ��ܸ`�I
         ptr = ptr.left;    // ���l�`�I
      }
      System.out.print("\n�k�l��: ");
      ptr = head.right;     // �k�l�𪺫���
      while ( ptr != null ) {
         System.out.print("["+ptr.data+"]"); // ��ܸ`�I
         ptr = ptr.right;   // �k�l�`�I
      }
      System.out.println();
   }
}