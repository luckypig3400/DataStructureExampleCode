/* �{���d��: Ch2_3.java */ 
class MyArray {                 // �}�C���O
   private float[] arr;         // �}�C�ܼ�
   private int arr_size;        // �}�C�ؤo
   // �غc�l: �إߤ@���}�C
   public MyArray(int size, float value) {
      arr_size = size;
      arr = new float[size];    // �إߤ@���}�C
      // ���w�}�C�����
      for ( int i = 0; i < arr_size; i++ )
         arr[i] = value;        // ���w�}�C������
   }
   // ��k: �Ǧ^�}�C�ؤo
   public int length() { return arr_size; }
   // ��k: ���o�}�C��
   public float retrieve(int index) {
      if ( index < arr_size ) // �O�_�W�L�}�C�ؤo
         return arr[index];   // �Ǧ^�}�C��
      else {
         System.out.println("�}�C���޶W�L�d��I");
         return -1.0f;
      }
   }
   // ��k: �s�J�}�C����
   public boolean store(int index, float value) {
      if ( index < arr_size ) { // �O�_�W�L�}�C�ؤo
         arr[index] = value;    // �s�J�}�C
         return true;
      }
      else {
         System.out.println("�}�C���޶W�L�d��I");
         return false;
      }
   }
   // ��k: �p��}�C����
   public float average() { return sum()/arr_size; }
   // ��k: �p���`�M
   public float sum() {
      float total = 0.0f;
      // �p���`�M
      for ( int i = 0; i < arr_size; i++ )
         total += arr[i];
      return total;             // �Ǧ^�`�M
   }
   // ��k: ��ܰ}�C����
   public void display() {
      // ��ܰ}�C���Ҧ�����
      for ( int i = 0; i < arr_size; i++ )
         System.out.print("[" + i + ":" + arr[i] + "]");
      System.out.println();
   }
}
// �D���O
public class Ch2_3 {
   // �D�{��
   public static void main(String[] args) {
      // �إ߰}�C����
      MyArray arr = new MyArray(5, 60.0f);
      System.out.print("��l�}�C: ");  arr.display();
      // ��ܰ}�C�ؤo
      System.out.println("�}�C�ؤo: " + arr.length());
      // ���w�}�C������
      arr.store(0, 78.0f);  arr.store(1, 95.5f);
      arr.store(2, 89.0f);  arr.store(3, 68.7f);
      System.out.print("�ثe�}�C: ");  arr.display();
      // �p�⥭���M�`��
      System.out.println("�`��: " + arr.sum());
      System.out.println("����: " + arr.average());
      // ���X���w���ު�������
      System.out.println("arr[2]: " + arr.retrieve(2));
      System.out.println("arr[6]: " + arr.retrieve(6));
   }
}