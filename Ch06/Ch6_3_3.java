/* 程式範例: Ch6_3_3.java */
public class Ch6_3_3 { 
   // 主程式
   public static void main(String[] args) {
      // 二元樹的節點資料
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // 建立二元樹物件
      BTree bt = new BTree(data);
      System.out.println("二元樹是空的: "
                            + bt.isBTreeEmpty());
      System.out.println("二元樹的節點內容: ");
      bt.printBTree();  // 顯示二元樹的節點資料
   }
}