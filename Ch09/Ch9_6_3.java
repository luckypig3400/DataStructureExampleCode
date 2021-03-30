/* �{���d��: Ch9_6_3.java */ 
import java.io.*;
class Node {     // �`�I���O
   int data;     // �`�I���
   Node next;    // �ѦҤU�@�Ӹ`�I
   // �غc�l
   public Node(int data) {
      this.data = data;
      this.next = null;
   }
}
class HashTable {  // ��������O
   private Node[] hashTable = new Node[10]; // �����}�C
   // �غc�l: �إ������
   public HashTable(int[] array) {
      Node ptr;             // �}�l����
      Node newnode;         // �s�`�I����
      int pos;              // ���ަ�m�ܼ�
      for ( int i = 0; i < hashTable.length; i++ )
          hashTable[i] = null;    // ��l�}�C����
      // �ϥΰj��إ������
      for ( int i = 0; i < array.length; i++ ) {
         // �إ߸`�I����
         newnode = new Node(array[i]);
         // �I�s�����ƭp����ަ�m
         pos = hashFunc(array[i]);
         ptr = hashTable[pos];      // ���o�}�l����
         if ( ptr != null ) {       // �O�_�O��1�Ӹ`�I
            while ( ptr.next != null ) // ��X�̫�1�Ӹ`�I
               ptr = ptr.next;         // �U�@�Ӹ`�I
            ptr.next = newnode;        // �쵲�`�I
         } else
            hashTable[pos] = newnode;  // ��1�Ӹ`�I
      }
   }
   // ��k: ������
   private int hashFunc(int key) { return key % 10; }
   // ��k: �쵲�k������j�M
   public boolean chainHashSearch(int key) {
      Node ptr;             // �}�l����
      int pos;              // ��m�ܼ�
      // �I�s�����ƭp���m
      pos = hashFunc(key);
      ptr = hashTable[pos];        // ���o�}�l����
      while ( ptr != null )        // �쵲�k���j�M�j��
         if ( ptr.data == key )    // �O�_���F
            return true;
         else
            ptr = ptr.next;        // �U�@�Ӹ`�I
      return false;
   }
   // ��k: �����������e
   public void printHashTable() {
      Node ptr;               // �}�l����
      System.out.print("������e: ");
      for ( int i = 0; i < hashTable.length; i++ ) {
         System.out.print("\n" + i + "==> ");
         ptr = hashTable[i];       // ���o�}�l����
         while ( ptr != null ) {   // ��ܦ�C���j��
            System.out.print("[" +ptr.data + "]");
            ptr = ptr.next;        // �U�@�Ӹ`�I
         }
      }
      System.out.println();
   }
}
// �D���O
public class Ch9_6_3 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �j�M����ȸ��
      int[] data = {37, 25, 11, 29, 34, 46, 44, 35};
      int key = 0;              // �j�M���
      HashTable ht = new HashTable(data); // �إ������
      ht.printHashTable();                // ��������
      System.out.println();
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("�п�J�j�M��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // �I�s�쵲�k������j�M��k
            if ( ht.chainHashSearch(key) )
               System.out.println("�j�M�����:"+key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}