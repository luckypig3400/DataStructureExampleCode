/* �{���d��: Ch6_4_1.java */ 
class BTree_InOrder extends BTree {  // �~�ӤG�������O
   // �غc�l: �إߤG����
   public BTree_InOrder(int[] data) { super(data); }
   // ��k: �G���𪺤��Ǩ��X
   public void inOrder(TreeNode ptr) {
      if ( ptr != null ) {     // �פ����
         inOrder(ptr.left);    // ���l��
         // ��ܸ`�I���e
         System.out.print("[" + ptr.data + "]"); 
         inOrder(ptr.right);   // �k�l��
      }
   }
   // ��k: ���Ǩ��X��ܤG����
   public void printInOrder() {
      inOrder(head);  // �I�s���Ǩ��X��k
      System.out.println();
   } 
}
// �D���O
public class Ch6_4_1 {
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // �إߤG���𪫥�
      BTree_InOrder bt = new BTree_InOrder(data);
      System.out.println("���Ǩ��X���`�I���e: ");
      bt.printInOrder();   
   }
}