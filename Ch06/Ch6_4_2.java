/* �{���d��: Ch6_4_2.java */ 
class BTree_PreOrder extends BTree {  // �~�ӤG�������O
   // �غc�l: �إߤG����
   public BTree_PreOrder(int[] data) { super(data); }
   // ��k: �G���𪺫e�Ǩ��X
   public void preOrder(TreeNode ptr) {
      if ( ptr != null ) {     // �פ����
         // ��ܸ`�I���e
         System.out.print("[" + ptr.data + "]"); 
         preOrder(ptr.left);   // ���l��
         preOrder(ptr.right);  // �k�l��
      }
   }
   // ��k: �e�Ǩ��X��ܤG����
   public void printPreOrder() {
      preOrder(head);  // �I�s�e�Ǩ��X��k
      System.out.println();
   } 
}
// �D���O
public class Ch6_4_2 {
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // �إߤG���𪫥�
      BTree_PreOrder bt = new BTree_PreOrder(data);
      System.out.println("�e�Ǩ��X���`�I���e: ");
      bt.printPreOrder();   
   }
}