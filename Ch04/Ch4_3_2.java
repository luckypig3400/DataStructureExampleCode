/* 程式範例: Ch4_3_2.java */
import java.io.*;
public class Ch4_3_2 {
   // 方法: 是否是運算子
   static boolean isOperator(char op) {
      switch ( op ) {
         case '+':
         case '-':
         case '*':
         case '/': return true;    // 是運算子
         default:  return false;   // 不是運算子
      }
   }
   // 方法: 計算二元運算式的結果
   static int cal(char op,int operand1, int operand2) {
      switch ( op ) {
         case '*': return ( operand2 * operand1 ); // 乘
         case '/': return ( operand2 / operand1 ); // 除
         case '+': return ( operand2 + operand1 ); // 加
         case '-': return ( operand2 - operand1 ); // 減
      }
      return -1;   // 不是支援的運算子
   }
   // 方法: 後序運算式的計算
   static int postfixEval(char[] exp) {
      int operand1 = 0;              // 第1個運算元變數
      int operand2 = 0;              // 第2個運算元變數
      int pos = 0;                   // 運算式字串索引
      Stack st = new Stack();        // 建立堆疊物件
      // 剖析運算式字串迴圈
      while ( pos < exp.length ) {
         if ( isOperator(exp[pos]) ) {  // 是不是運算子
            // 從堆疊取出兩個運算元
            operand1 = st.pop();
            operand2 = st.pop();
            // 計算結果存回堆疊
            st.push(cal(exp[pos], operand2, operand1));
         }
         else  // 這是運算元, 存入運算元堆疊
            st.push(Character.getNumericValue(exp[pos]));
         pos++;               // 下一個字元
      } 
      return st.pop();   // 傳回後序運算式的結果
   }
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      String str;                   // 變數宣告
      int len;
      // 建立BufferedReader的輸入串流物件
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("請輸入後序運算式 ==> ");
      System.out.flush();           // 清除緩衝區
      str = input.readLine();       // 讀取運算式
      input.close();                // 關閉串流
      str = str.replace("?", "");   // 刪除字串中的?字元
      len = str.length();           // 取得字串長度
      char[] exp = new char[len];   // 字元陣列宣告
      exp = str.toCharArray();      // 轉換成陣列
      System.out.print("運算式: " + str);
      // 顯示後序運算式的計算結果
      System.out.println(" = " + postfixEval(exp));
   }
}