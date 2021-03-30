/* �{���d��: Ch6_3_1.java */ 
class BTree_Array { // �G�������O
   private int[] btree;        // �G����}�C�ŧi
   // �غc�l: �إߤG����
   public BTree_Array(int size, int[] array) {
      int level, i;            // �𪺶��h
      btree = new int[size];   // �إ߰}�C
      // �M���}�C����
      for ( i = 0; i < size; i++ ) btree[i] = -1;
      btree[1] = array[1];     // �إ߮ڸ`�I
      // �ϥΰj��s�W�G���𪺨䥦�`�I
      for ( i = 2; i < array.length; i++ ) {
         level = 1;                     // �q���h1�}�l
         while ( btree[level] != -1 ) { // �O�_���l��
            if (array[i] > btree[level])// �O���Υk�l��
               level = level * 2 + 1;   // �k�l��
            else
               level = level * 2;       // ���l��
         }
         btree[level] = array[i];       // �s�J�`�I���
      }
   }
   // ��k: ��ܤG����
   public void printBTree() {
      // �ϥΰj����ܤG���𪺸`�I���
      for ( int i = 1; i < btree.length; i++ )
         if ( btree[i] != -1 )
            System.out.print("["+i+":"+btree[i]+"]");
      System.out.println();
   }   
}
// �D���O
public class Ch6_3_1 {
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 0, 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // �إߤG���𪫥�
      BTree_Array bt = new BTree_Array(16, data);
      bt.printBTree();  // ��ܤG���𪺸`�I���
   }
}