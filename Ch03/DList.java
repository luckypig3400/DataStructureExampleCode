/* �{���d��: DList.java */ 
public abstract class DList {  // ���V��C��H���O
   public DNode first;         // ���V��C���}�Y����
   public DNode now;           // ���V��C�ثe�`�I����
   // ��H��k: ������V��C���`�I���
   abstract void printDList();
   // ��H��k: ���ʸ`�I���Ш�U�@�Ӹ`�I
   abstract void nextNode();
   // ��H��k: ���ʸ`�I���Ш�W�@�Ӹ`�I
   abstract void previousNode();
   // ��H��k: ���]�`�I����
   abstract void resetNode();
   // ��H��k: ���o�`�I����
   abstract DNode readNode();
}