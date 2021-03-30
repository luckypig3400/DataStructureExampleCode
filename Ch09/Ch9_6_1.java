/* �{���d��: Ch9_6_1.java */ 
import java.io.*;
class HashTable {  // ��������O
   private int[] hashTable = new int[10];  // �����}�C
   // �غc�l: �إ������
   public HashTable(int[] array) {
      int pos;                 // ���ަ�m�ܼ�
      int temp, i;
      for ( i = 0; i < hashTable.length; i++ )
         hashTable[i] = -1;    // �M�������
      // �ϥΰj��إ������
      for ( i = 0; i < array.length; i++ ) {
         // �I�s�����ƭp����ަ�m
         pos = hashFunc(array[i]);
         temp = pos;           // �O�d�}�l�����ަ�m
         while ( hashTable[temp] != -1 ) { // ��M��m
            // ��M�U�@�Ӧ�m
            temp = ( temp + 1 ) % hashTable.length;
            if ( pos == temp ) {       // �����O�_�v��
               System.out.println("�����v��!");
               return;
            }
         }
         hashTable[temp] = array[i];   // �s�J�����
      }
   }
   // ��k: ������
   private int hashFunc(int key) { return key % 10; }
   // ��k: �u�ʱ����k������j�M
   public boolean lineHashSearch(int key) {
      int pos;                 // ��m�ܼ�
      int temp;
      // �I�s�����ƭp���m
      pos = hashFunc(key);
      temp = pos;              // �O�d�}�l�����ަ�m
      while ( hashTable[temp] != key && // �u�ʱ����j��
         hashTable[temp] != -1 ) {
         // �ϥξl�ƱN�}�C�ܬ������ӭp��U�@�Ӧ�m
         temp = ( temp + 1 ) % hashTable.length;
         if ( pos == temp )            // �d�ߵ���
            return false;              // �w���S�����
      }
      if ( hashTable[temp] == -1 )     // �O�_�O�ť�
         return false;                 // �S�����
      else
         return true;                  // ���F
   }
   // ��k: �����������e
   public void printHashTable() {
      for ( int i = 0; i < hashTable.length; i++ )
         System.out.print("[" + hashTable[i] + "]");
      System.out.println();
   }
}
// �D���O
public class Ch9_6_1 {
   // �D�{��
   public static void main(String[] args)
                                    throws Exception {
      // �j�M����ȸ��
      int[] data = {37, 25, 11, 29, 34, 46, 44, 35};
      int key = 0;              // �j�M���
      HashTable ht = new HashTable(data); // �إ������
      System.out.print("������e: ");
      ht.printHashTable();                // ��������
      // �إ�BufferedReader����J��y����
      BufferedReader input = new BufferedReader(
                     new InputStreamReader(System.in));
      while ( key != -1 ) {
         System.out.print("�п�J�j�M��(-1����) ==> ");
         System.out.flush();           // �M���w�İ�
         // Ū���@�C, �ഫ�����
         key = Integer.parseInt(input.readLine());
         if ( key != -1 )
            // �I�s�u�ʱ����k������j�M��k
            if ( ht.lineHashSearch(key) )
               System.out.println("�j�M�����:" + key);
            else
               System.out.println("�S���j�M�����:"+key);
      }
      input.close();                // ������y
   }
}