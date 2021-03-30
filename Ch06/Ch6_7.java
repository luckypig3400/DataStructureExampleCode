/* �{���d��: Ch6_7.java */ 
class BSTree_Exp extends BSTree {  // �~�ӤG���j�M�����O
   // �غc�l: �إߤG���j�M��
   public BSTree_Exp(char[] data, int pos) {
      // �ഫ���G���j�M��
      head = transformBSTree(data, pos);
   }
   // ��k: �G���𪺰}�C��ܪk�ഫ���쵲��ܪk
   public TreeNode transformBSTree(char[] arr,int pos) {
      TreeNode newnode;            // �s�`�I����
      if ( pos >= arr.length )   // �פ����
         return null;
      else  { // �إ߷s�`�I����
         newnode = new TreeNode((int)arr[pos]);
         // �إߥ��l�𪺻��j�I�s
         newnode.left = transformBSTree(arr, 2*pos);
         // �إߥk�l�𪺻��j�I�s
         newnode.right = transformBSTree(arr, 2*pos+1);
         return newnode;
      }
   }
   // ��k: �p��G���B�⦡�����G
   public int cal(char op, int operand1, int operand2) {
      switch ( op ) {
         case '*': return ( operand2 * operand1 ); // ��
         case '/': return ( operand2 / operand1 ); // ��
         case '+': return ( operand2 + operand1 ); // �[
         case '-': return ( operand2 - operand1 ); // ��
      }
      return -1;
   }
   // ��k: �p��G����B�⦡����
   public int eval(TreeNode ptr) {
      int operand1 = 0;       // ��1�ӹB�⤸�ܼ�
      int operand2 = 0;       // ��2�ӹB�⤸�ܼ�
      // �פ����
      if ( ptr.left == null && ptr.right == null )
        // �Ǧ^���`�I����
        return Character.getNumericValue((char)ptr.data);
      else {
        operand1 = eval(ptr.left);  // ���l��
        operand2 = eval(ptr.right); // �k�l��
        return cal((char)ptr.data, operand1, operand2);
      }
   }
   // ��k: �e�Ǩ��X�����j��k
   public void preOrder(TreeNode node) {
      if ( node != null ) {
         // ��ܸ`�I���
         System.out.print((char)node.data);
         preOrder(node.left);  // ���X���l��
         preOrder(node.right); // ���X�k�l��
      }
   }
   // ��k: ���Ǩ��X�����j��k
   public void inOrder(TreeNode node) {
      if ( node != null ) {
         inOrder(node.left);  // ���X���l��
         // ��ܸ`�I���
         System.out.print((char)node.data);
         inOrder(node.right); // ���X�k�l��
      }
   }
   // ��k: ��Ǩ��X�����j��k
   public void postOrder(TreeNode node) {
      if ( node != null ) {
         postOrder(node.left);  // ���X���l��
         postOrder(node.right); // ���X�k�l��
         // ��ܸ`�I���
         System.out.print((char)node.data);
      }
   }
}
// �D���O
public class Ch6_7 {
   // �D�{��
   public static void main(String[] args) {
      // �B�⦡�G����`�I���
      char[] data = {' ','+','*','*','5','6','4','3' };
      // �إߤG���j�M�𪫥�
      BSTree_Exp exp = new BSTree_Exp(data, 1);
      System.out.print("���ǹB�⦡(���Ǩ��X): ");
      exp.inOrder(exp.head);     // ������ܤG����B�⦡
      System.out.print("\n�e�ǹB�⦡(�e�Ǩ��X): ");
      exp.preOrder(exp.head);    // �e����ܤG����B�⦡
      System.out.print("\n��ǹB�⦡(��Ǩ��X): ");
      exp.postOrder(exp.head);   // �����ܤG����B�⦡
      // �p��G����B�⦡���B�⵲�G
      System.out.print("\n�B�⦡��= ");
      System.out.println(exp.eval(exp.head));
   }
}