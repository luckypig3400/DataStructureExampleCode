/* 程式範例: Ch2_1_3.java */
import java.io.*;
public class Ch2_1_3 {
   // 主程式
   public static void main(String[] args)
                                    throws Exception {
      // 學生功課表
      int[][] courses={ {0, 2, 0, 2, 0},
                        {1, 4, 1, 4, 1},
                        {5, 0, 5, 0, 5},
                        {0, 0, 0, 0, 0},
                        {3, 0, 3, 0, 3},
                        {0, 0, 0, 0, 0} };
      int week_no;    // 星期幾 
      int num;        // 第幾節課
      int code;       // 課程代碼
      // 建立BufferedReader的輸入串流物件
      BufferedReader in = new BufferedReader(
                     new InputStreamReader(System.in));
      System.out.print("請輸入星期(1 到 5)==> ");
      System.out.flush();    // 清除緩衝區
      // 讀取星期幾 
      week_no = Integer.parseInt(in.readLine());
      System.out.print("請輸入第幾節課(1 到 6)==> ");
      System.out.flush();    // 清除緩衝區
      // 讀取第幾節課
      num = Integer.parseInt(in.readLine());
      // 取得課程代碼 
      code = courses[num-1][week_no-1];
      System.out.println("課程代碼: " + code); 
      // 顯示課程名稱 
      switch ( code ) {
         case 0: System.out.println("沒課！");
                 break;
         case 1: System.out.println("計算機概論");
                 break;
         case 2: System.out.println("離散數學");
                 break;
         case 3: System.out.println("資料結構");
                 break;
         case 4: System.out.println("資料庫理論");
                 break;
         case 5: System.out.println("上機實習");
                 break;
      }
      in.close();                // 關閉串流
   }
}