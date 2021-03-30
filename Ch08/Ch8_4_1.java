/* �{���d��: Ch8_4_1.java */ 
public class Ch8_4_1 {
   // ��k: ��ܱƧǰ}�C�����e
   static void showList(int[] data) {
      for ( int i = 0; i < data.length; i++ )
         // ��ܰ}�C����
         System.out.print("[" + data[i] + "]");
      System.out.println();
   }
   // ��k: ���X��C���e�^�s��Ƨǰ}�C
   static void refillList(int[] data, Queue[] head) {
      int i, j = 0;
      // ���X��C������}�C
      for ( i = 0; i < head.length; i++ )
         // ���X��C��Ʀs�^�}�C
         while ( !head[i].isQueueEmpty() ) {
            data[j] = head[i].dequeue();
            j++;
         }
   }
   // ��k: ��ƱƧǪk
   static void radixSort(int[] data, Queue[] head) {
      int i, j, max, nth_d;
      int exp = 0;           
      int max_d = 0;
      max = data[0];     // ��X�}�C�����̤j��
      for ( i = 0; i < data.length; i++ )
         if ( data[i] > max ) max = data[i];
      while ( max > 0 ) {// ��X�̤j�Ȫ����
         max_d++;
         max = max / 10;
      }
      for ( i = 0; i < max_d; i++ ) {// ����U��ƪ��Ƨ�
        exp++;                       // �ثe�����
        for ( j = 0; j < data.length; j++) {// ���X�}�C
          // �p��Ƨǭȫ��w��ƪ���
          nth_d=data[j]%(int)Math.pow(10.00,(double)exp);
          nth_d=nth_d/(int)Math.pow(10.00,(double)exp-1);
          // �s�J�U��ƪ���C
          head[nth_d].enqueue(data[j]);
        }
        refillList(data, head);
        int temp = (int)Math.pow(10.00,(double)exp-1);
        System.out.print(temp + "���: ");
        showList(data);
      }
   }   
   // �D�{��
   public static void main(String[] args) {
      // �ƧǪ���ư}�C
      int[] data = {13,219,532,55,422,164,98,422,334};
      Queue[] head = new Queue[10];     // ��C����}�C
      for ( int i = 0; i < head.length; i++ )
          head[i] = new Queue();      // �إߪ���}�C����
      System.out.print("�Ƨǫe���e: "); // �Ƨǫe�}�C���e
      showList(data);
      radixSort(data, head);            // �����ƱƧǪk
      System.out.print("�Ƨǫᵲ�G: "); // �Ƨǫ�}�C���e
      showList(data);      
   }
}