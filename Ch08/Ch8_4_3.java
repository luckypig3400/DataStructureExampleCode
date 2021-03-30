/* �{���d��: Ch8_4_3.java */
public class Ch8_4_3 { 
   // ��k: �إ߰�n
   static void siftDown(int[] heap, int root, int len) {
      boolean done = false;             // �O�_�i����
      int j, temp;
      j = 2 * root;                  // �l�`�I����
      temp = heap[root];             // ��n���ڸ`�I��
      while ( j <= len && !done ) {  // �D�j��
         if ( j < len )              // ��̤j�l�`�I
            if ( heap[j] < heap[j+1] )
               j++;                  // �U�@�`�I
            if ( temp >= heap[j] )   // ����𪺮ڸ`�I
               done = true;          // ����
            else {
               heap[j/2] = heap[j];  // ���`�I�O�ثe�`�I
               j = 2 * j;            // ��l�`�I
            }
      }
      heap[j/2] = temp;              // ���`�I���ڸ`�I��
   }
   // ��k: ��n�ƧǪk
   static void heapSort(int[] heap, int len) {
      int i,j,temp;
      // �N�G�����ন��n
      for ( i = ( len / 2 ); i >= 1; i-- )
         siftDown(heap, i, len);
      System.out.print("\n��n�����e: ");
      for ( j = 1; j < 10; j++ )     // ��ܰ�n
         System.out.print("["+heap[j]+"]");
      // ��n�ƧǪk���D�j��
      for ( i = len - 1; i >= 1; i-- ) {
         temp = heap[i+1];           // �洫�̫ᤸ��
         heap[i+1] = heap[1];
         heap[1] = temp;
         siftDown(heap, 1, i);       // ���ذ�n
         System.out.print("\n���ت���n: ");
         for ( j = 1; j < 10; j++ )  // ��ܳB�z���e
            System.out.print("["+heap[j]+"]");
      }
   }
   // �D�{��
   public static void main(String[] args) {
      // �G���𪺸`�I���
      int[] data = { 0, 5, 6, 4, 8, 2, 3, 7, 1, 9 };
      int i;
      System.out.print("�G���𤺮e: ");
      for ( i = 1; i < 10; i++ )     // ��ܤG���𤺮e
          System.out.print("["+data[i]+"]");
      heapSort(data, 9);             // �����n�ƧǪk
      System.out.print("\n��X�Ƨǵ��G: ");
      for ( i = 1; i < 10; i++ )     // ��ܱƧǵ��G
         System.out.print("["+data[i]+"]");
      System.out.println();
   }
}