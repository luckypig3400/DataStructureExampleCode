/* �{���d��: Ch4_3_3.java */
import java.io.*;
public class Ch4_3_3 {
   // ��k: �O�_�O�B��l
   static boolean isOperator(char op) {
      switch ( op ) {
         case '(':
         case ')':
         case '+':
         case '-':
         case '*':
         case '/': return true;    // �O�B��l
         default:  return false;   // ���O�B��l
      }
   }
   // ��k: �B��l���u���v
   static int priority(char op) {
      switch ( op ) {    // �Ǧ^�ȷU�j, �u���v�U�j
         case '*':
         case '/': return 3;
         case '+':
         case '-': return 2;
         case '(': return 1;
         default:  return 0;
      }
   }
   // ��k: �������ǹB�⦡
   static void postfix(char[] infix) {
      char op;                 // �B��l
      boolean doit;            // �X���ܼ�
      int pos = 0;             // �B�⦡�r�ꪺ����
      Stack st = new Stack();  // �إ߰��|����
      // ��R�B�⦡�r��j��
      while ( pos < infix.length ) {
         if ( isOperator(infix[pos]) ) { // �O�B��l
           if ( st.isStackEmpty() ||
              infix[pos] == '(' )     // �N�B��l�s�J���|
              st.push((int) infix[pos]);
           else if ( infix[pos] == ')' ) { // �B�z�A��
              doit = true;
              while ( doit ) {
                 // ���X�B��l����O'('
                 op = (char) st.pop();
                 if ( op != '(' )  // ��ܹB��l
                    System.out.print(op);
                 else
                    doit = false;
              }
           }
           else {  // ����u������
              doit = true;
              while ( doit &&  // ����u�����Ǫ��j��
                 !st.isStackEmpty()) {
                 op = (char) st.pop();  // ���X�B��l
                 if (priority(infix[pos])<=priority(op))
                    System.out.print(op);
                 else {
                    st.push((int) op);  // �s�^�B��l
                    doit = false;
                 }
              } // �N�B��l�s�J���|
              st.push((int) infix[pos]);
           }    // ��ܹB�⤸
         } else System.out.print(infix[pos]);
         pos++;
      }  // ���X�ѤU���B��l
      while ( !st.isStackEmpty() )
         System.out.print((char) st.pop()); // ��ܹB��l
      System.out.println();
   }
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // �ܼƫŧi
      int len;
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("�п�J���ǹB�⦡ ==> ");
      System.out.flush();           // �M���w�İ�
      str = input.readLine();       // Ū���B�⦡
      input.close();                // ������y
      str = str.replace("?", "");   // �R���r�ꤤ��?�r��
      len = str.length();           // ���o�r�����
      char[] exp = new char[len];   // �r���}�C�ŧi
      exp = str.toCharArray();      // �ഫ���}�C
      System.out.print("��ǹB�⦡: ");
      postfix(exp);                 // ��ܵ��G
   }
}