/* 程式範例: Ch4_3_3.java */
import java.io.*;
public class Ch4_3_3 {
   // 方法: 是否是運算子
   static boolean isOperator(char op) {
      switch ( op ) {
         case '(':
         case ')':
         case '+':
         case '-':
         case '*':
         case '/': return true;    // 是運算子
         default:  return false;   // 不是運算子
      }
   }
   // 方法: 運算子的優先權
   static int priority(char op) {
      switch ( op ) {    // 傳回值愈大, 優先權愈大
         case '*':
         case '/': return 3;
         case '+':
         case '-': return 2;
         case '(': return 1;
         default:  return 0;
      }
   }
   // 方法: 中序轉後序運算式
   static void postfix(char[] infix) {
      char op;                 // 運算子
      boolean doit;            // 旗標變數
      int pos = 0;             // 運算式字串的索引
      Stack st = new Stack();  // 建立堆疊物件
      // 剖析運算式字串迴圈
      while ( pos < infix.length ) {
         if ( isOperator(infix[pos]) ) { // 是運算子
           if ( st.isStackEmpty() ||
              infix[pos] == '(' )     // 將運算子存入堆疊
              st.push((int) infix[pos]);
           else if ( infix[pos] == ')' ) { // 處理括號
              doit = true;
              while ( doit ) {
                 // 取出運算子直到是'('
                 op = (char) st.pop();
                 if ( op != '(' )  // 顯示運算子
                    System.out.print(op);
                 else
                    doit = false;
              }
           }
           else {  // 比較優先順序
              doit = true;
              while ( doit &&  // 比較優先順序的迴圈
                 !st.isStackEmpty()) {
                 op = (char) st.pop();  // 取出運算子
                 if (priority(infix[pos])<=priority(op))
                    System.out.print(op);
                 else {
                    st.push((int) op);  // 存回運算子
                    doit = false;
                 }
              } // 將運算子存入堆疊
              st.push((int) infix[pos]);
           }    // 顯示運算元
         } else System.out.print(infix[pos]);
         pos++;
      }  // 取出剩下的運算子
      while ( !st.isStackEmpty() )
         System.out.print((char) st.pop()); // 顯示運算子
      System.out.println();
   }
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // 變數宣告
      int len;
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("請輸入中序運算式 ==> ");
      System.out.flush();           // 清除緩衝區
      str = input.readLine();       // 讀取運算式
      input.close();                // 關閉串流
      str = str.replace("?", "");   // 刪除字串中的?字元
      len = str.length();           // 取得字串長度
      char[] exp = new char[len];   // 字元陣列宣告
      exp = str.toCharArray();      // 轉換成陣列
      System.out.print("後序運算式: ");
      postfix(exp);                 // 顯示結果
   }
}