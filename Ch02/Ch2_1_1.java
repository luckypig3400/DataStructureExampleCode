/* 程式範例: Ch2_1_1.java */
class Grade {  // 成績類別 
   int math;
   int english;
};
// 主類別
public class Ch2_1_1 {
   // 主程式
   public static void main(String[] args) {
      int sum = 0;  // 總分
      int[] scores = {56, 89, 75, 66, 98};// 建立整數陣列
      Grade[] students = new Grade[3];  // 建立物件陣列
      for ( int i = 0; i < 3; i++ )
         students[i] = new Grade();
      // 指定物件陣列的值
      students[0].math = 56; students[0].english = 78;
      students[1].math = 66; students[1].english = 91;
      students[2].math = 83; students[2].english = 67;
      // 計算總分
      sum = scores[0]+scores[1]+scores[2]+scores[3]+
            scores[4];
      System.out.println("成績總分: " + sum);;
      // 計算數學總分
      sum = students[0].math + students[1].math +
            students[2].math;
      System.out.println("數學成績總分: " + sum);
      // 計算英文總分
      sum = students[0].english + students[1].english +
            students[2].english;
      System.out.println("英文成績總分: " + sum);
   }
}