/* 程式範例: Ch2_3.java */ 
class MyArray {                 // 陣列類別
   private float[] arr;         // 陣列變數
   private int arr_size;        // 陣列尺寸
   // 建構子: 建立一維陣列
   public MyArray(int size, float value) {
      arr_size = size;
      arr = new float[size];    // 建立一維陣列
      // 指定陣列的初值
      for ( int i = 0; i < arr_size; i++ )
         arr[i] = value;        // 指定陣列元素值
   }
   // 方法: 傳回陣列尺寸
   public int length() { return arr_size; }
   // 方法: 取得陣列值
   public float retrieve(int index) {
      if ( index < arr_size ) // 是否超過陣列尺寸
         return arr[index];   // 傳回陣列值
      else {
         System.out.println("陣列索引超過範圍！");
         return -1.0f;
      }
   }
   // 方法: 存入陣列元素
   public boolean store(int index, float value) {
      if ( index < arr_size ) { // 是否超過陣列尺寸
         arr[index] = value;    // 存入陣列
         return true;
      }
      else {
         System.out.println("陣列索引超過範圍！");
         return false;
      }
   }
   // 方法: 計算陣列平均
   public float average() { return sum()/arr_size; }
   // 方法: 計算總和
   public float sum() {
      float total = 0.0f;
      // 計算總和
      for ( int i = 0; i < arr_size; i++ )
         total += arr[i];
      return total;             // 傳回總和
   }
   // 方法: 顯示陣列元素
   public void display() {
      // 顯示陣列的所有元素
      for ( int i = 0; i < arr_size; i++ )
         System.out.print("[" + i + ":" + arr[i] + "]");
      System.out.println();
   }
}
// 主類別
public class Ch2_3 {
   // 主程式
   public static void main(String[] args) {
      // 建立陣列物件
      MyArray arr = new MyArray(5, 60.0f);
      System.out.print("原始陣列: ");  arr.display();
      // 顯示陣列尺寸
      System.out.println("陣列尺寸: " + arr.length());
      // 指定陣列元素值
      arr.store(0, 78.0f);  arr.store(1, 95.5f);
      arr.store(2, 89.0f);  arr.store(3, 68.7f);
      System.out.print("目前陣列: ");  arr.display();
      // 計算平均和總分
      System.out.println("總分: " + arr.sum());
      System.out.println("平均: " + arr.average());
      // 取出指定索引的元素值
      System.out.println("arr[2]: " + arr.retrieve(2));
      System.out.println("arr[6]: " + arr.retrieve(6));
   }
}