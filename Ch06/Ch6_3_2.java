/* �{���d��: Ch6_3_2.java */ 
class Node {        // ��`�I���O
   int data;        // �`�I���
   int left;        // �Ѧҥ��l��
   int right;       // �Ѧҥk�l��
}
class BTree_Node {  // �G�������O
   private Node[] btree;        // �G����}�C�ŧi
   // �غc�l: �إߤG����
   public BTree_Node(int size, int[] data) {
      int level;               // �𪺶��h
      int i, pos;              // -1�O����,1�O�k��
      btree = new Node[size];  // �إ߰}�C
      for ( i = 0; i < btree.length; i++ )
          btree[i] = new Node();  // �إߪ���}�C����
      for ( i = 0; i < size; i++ ) {
         // �M������}�C
         btree[i].data = 0;
         btree[i].left = btree[i].right = -1;
      }
      btree[0].data = data[0];      // �إ߾�ڸ`�I
      // �إ߸`�I���j��
      for ( i = 1; i < data.length; i++ ) {
         btree[i].data = data[i];   // �إ߸`�I���e
         level = 0; pos = 0;
         while ( pos == 0 ) {// �ϥΰj�����O���Υk�l��
            if ( data[i] > btree[level].data )
               // �k��O�_���U�@���h
               if ( btree[level].right != -1 )
                  level = btree[level].right;
               else pos = -1;        // �O�k��
            else // ����O�_���U�@���h
               if ( btree[level].left != -1 )
                  level = btree[level].left;
               else pos = 1;         // �O����
         }
         if (pos==1) btree[level].left = i;// �쵲���l��
         else        btree[level].right= i;// �쵲�k�l��
      }
   }
   // ��k: ��ܤG����
   public void printBTree() {
      // �ϥΰj����ܤG���𪺸`�I���
      System.out.println("  ��  ���  �k");
      for ( int i = 0; i < btree.length; i++ )
         if ( btree[i].data != 0 ) {  // �O�_�O�𪺸`�I
            System.out.print(i+":["+btree[i].left+"] ");
            System.out.print("["+btree[i].data+"] ");
            System.out.println("["+btree[i].right+"] ");
         }
   }
}
// �D���O
public class Ch6_3_2 {
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      // �إߤG���𪫥�
      BTree_Node bt = new BTree_Node(16, data);
      bt.printBTree();  // ��ܤG���𪺸`�I���
   }
}