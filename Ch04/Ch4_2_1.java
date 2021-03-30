/* �{���d��: Ch4_2_1.java */ 
class Stack_Array implements StackInterface {// ���|���O
   private int[] stack;      // �ŧi�}�C
   private int top;          // ���|���ݯ���
   // �غc�l: �إ߰��|
   public Stack_Array(int size) {
      stack = new int[size]; // �إ߰}�C����
      top = -1;
   }
   // ��k: �ˬd���|�O�_�O�Ū�
   public boolean isStackEmpty() {
      if ( top == -1 ) return true;
      else             return false;
   }
   // ��k: �N��Ʀs�J���|
   public boolean push(int d) {
      if ( top >= stack.length ) { // �O�_�W�L���|�e�q
         System.out.println("���|���e����!!!");
         return false;
      }
      else {
         stack[++top] = d;     // �s�J���|
         return true;
      }
   }
   // ��k: �q���|���X���
   public int pop() {
      if ( isStackEmpty() )   // ���|�O�_�O�Ū�
         return -1;
      else
         return stack[top--]; // ���X���
   }
}
// �D���O
public class Ch4_2_1 {
   // �D�{��
   public static void main(String[] args) {
      int[] data = {1, 2, 3, 4, 5, 6};   // �ŧi�}�C
      Stack_Array st = new Stack_Array(9);// �إ߰��|����
      int i;
      System.out.print("�s�J���|��ƪ�����: ");
      // �ϥΰj��N��Ʀs�J���|
      for ( i = 0; i < 6; i++) {
         st.push(data[i]);
         System.out.print("[" + data[i] + "]");
      }
      System.out.print("\n���X���|��ƪ�����: ");
      while ( !st.isStackEmpty() )   // ���X���|���
         System.out.print("[" + st.pop() + "]");
      System.out.println();
   }
}