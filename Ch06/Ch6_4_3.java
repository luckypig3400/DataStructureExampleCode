/* �{���d��: Ch6_4_3.java */ 
class BTree_PostOrder extends BTree {  // �~�ӤG�������O
   // �غc�l: �إߤG����
   public BTree_PostOrder(int[] data) { super(data); }
   // ��k: �G���𪺫�Ǩ��X
   public void postOrder(TreeNode ptr) {
      if ( ptr != null ) {      // �פ����
         postOrder(ptr.left);   // ���l��
         postOrder(ptr.right);  // �k�l��
         // ��ܸ`�I���e
         System.out.print("[" + ptr.data + "]"); 
      }
   }
   // ��k: ��Ǩ��X��ܤG����
   public void printPostOrder() {
      postOrder(head);  // �I�s��Ǩ��X��k
      System.out.println();
   } 
}
// �D���O
public class Ch6_4_3 {
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // �إߤG���𪫥�
      BTree_PostOrder bt = new BTree_PostOrder(data);
      System.out.println("��Ǩ��X���`�I���e: ");
      bt.printPostOrder();   
   }
}