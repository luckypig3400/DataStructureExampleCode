/* �{���d��: ListInterface.java */ 
// ListInterface�����ŧi
public interface ListInterface {   
   // ������k: ���o��C����
   int length();
   // ������k: ���o�u�ʦ�C����i�Ӥ���
   Node getNode(int i);
   // ������k: �j�M�`�I���
   Node searchNode(int d);
   // ������k: ���J�`�I
   void insertNode(Node ptr, int d);
   // ������k: �R���`�I
   int deleteNode(Node ptr);
}