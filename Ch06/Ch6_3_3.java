/* �{���d��: Ch6_3_3.java */
public class Ch6_3_3 { 
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // �إߤG���𪫥�
      BTree bt = new BTree(data);
      System.out.println("�G����O�Ū�: "
                            + bt.isBTreeEmpty());
      System.out.println("�G���𪺸`�I���e: ");
      bt.printBTree();  // ��ܤG���𪺸`�I���
   }
}