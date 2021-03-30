/* �{���d��: Ch4_3_2.java */
import java.io.*;
public class Ch4_3_2 {
   // ��k: �O�_�O�B��l
   static boolean isOperator(char op) {
      switch ( op ) {
         case '+':
         case '-':
         case '*':
         case '/': return true;    // �O�B��l
         default:  return false;   // ���O�B��l
      }
   }
   // ��k: �p��G���B�⦡�����G
   static int cal(char op,int operand1, int operand2) {
      switch ( op ) {
         case '*': return ( operand2 * operand1 ); // ��
         case '/': return ( operand2 / operand1 ); // ��
         case '+': return ( operand2 + operand1 ); // �[
         case '-': return ( operand2 - operand1 ); // ��
      }
      return -1;   // ���O�䴩���B��l
   }
   // ��k: ��ǹB�⦡���p��
   static int postfixEval(char[] exp) {
      int operand1 = 0;              // ��1�ӹB�⤸�ܼ�
      int operand2 = 0;              // ��2�ӹB�⤸�ܼ�
      int pos = 0;                   // �B�⦡�r�����
      Stack st = new Stack();        // �إ߰��|����
      // ��R�B�⦡�r��j��
      while ( pos < exp.length ) {
         if ( isOperator(exp[pos]) ) {  // �O���O�B��l
            // �q���|���X��ӹB�⤸
            operand1 = st.pop();
            operand2 = st.pop();
            // �p�⵲�G�s�^���|
            st.push(cal(exp[pos], operand2, operand1));
         }
         else  // �o�O�B�⤸, �s�J�B�⤸���|
            st.push(Character.getNumericValue(exp[pos]));
         pos++;               // �U�@�Ӧr��
      } 
      return st.pop();   // �Ǧ^��ǹB�⦡�����G
   }
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // �ܼƫŧi
      int len;
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("�п�J��ǹB�⦡ ==> ");
      System.out.flush();           // �M���w�İ�
      str = input.readLine();       // Ū���B�⦡
      input.close();                // ������y
      str = str.replace("?", "");   // �R���r�ꤤ��?�r��
      len = str.length();           // ���o�r�����
      char[] exp = new char[len];   // �r���}�C�ŧi
      exp = str.toCharArray();      // �ഫ���}�C
      System.out.print("�B�⦡: " + str);
      // ��ܫ�ǹB�⦡���p�⵲�G
      System.out.println(" = " + postfixEval(exp));
   }
}