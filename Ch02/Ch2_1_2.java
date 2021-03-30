/* 程式範例: Ch2_1_2.java */
import java.io.*;
public class Ch2_1_2 { 
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 學生成績陣列
      int[] scores = {76,85,90,67,59,79,82,95,91,65};
      int num = 0;      // 學號
      int grade;        // 成績
      int i, choice;    // 選項
      boolean doit = true;
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( doit ) {   // 主迴圈
         System.out.println("----------選單----------");
         System.out.print("1: 查詢成績  ");
         System.out.println("2: 修改成績");
         System.out.print("3: 顯示成績  ");
         System.out.println("4: 離開作業");
         System.out.print("請輸入選項( 1 到 4 )==> ");
         System.out.flush();    // 清除緩衝區
         // 讀取一列, 轉換成整數選項
         choice = Integer.parseInt(in.readLine());
         if (choice < 3 ) {
            System.out.print("請輸入學生學號(0到9)==> ");
            System.out.flush();    // 清除緩衝區
            num = Integer.parseInt(in.readLine());
         }
         switch( choice ) {
            case 1:  // 查詢成績
               grade = scores[num]; // 取得成績
               System.out.println("學生成績: " + grade);
               break;
            case 2:  // 修改成績
               grade = scores[num];
               System.out.println("原學生成績: "+grade);
               // 讀取新成績
               System.out.print("請輸入新成績==> ");
               System.out.flush();    // 清除緩衝區
               grade = Integer.parseInt(in.readLine());
               scores[num] = grade;  // 更新成績
               break;
            case 3:  // 顯示成績
               System.out.println("學生成績: ");
               for ( i = 0; i < scores.length; i++ )
                  System.out.print(i+":"+scores[i]+" ");
               System.out.println();
               break;
            case 4:  // 結束作業
               doit = false;
               break;
         }
      }
      in.close();                // 關閉串流
   }
}