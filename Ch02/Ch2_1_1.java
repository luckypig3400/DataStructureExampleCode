/* �{���d��: Ch2_1_1.java */
class Grade {  // ���Z���O 
   int math;
   int english;
};
// �D���O
public class Ch2_1_1 {
   // �D�{��
   public static void main(String[] args) {
      int sum = 0;  // �`��
      int[] scores = {56, 89, 75, 66, 98};// �إ߾�ư}�C
      Grade[] students = new Grade[3];  // �إߪ���}�C
      for ( int i = 0; i < 3; i++ )
         students[i] = new Grade();
      // ���w����}�C����
      students[0].math = 56; students[0].english = 78;
      students[1].math = 66; students[1].english = 91;
      students[2].math = 83; students[2].english = 67;
      // �p���`��
      sum = scores[0]+scores[1]+scores[2]+scores[3]+
            scores[4];
      System.out.println("���Z�`��: " + sum);;
      // �p��ƾ��`��
      sum = students[0].math + students[1].math +
            students[2].math;
      System.out.println("�ƾǦ��Z�`��: " + sum);
      // �p��^���`��
      sum = students[0].english + students[1].english +
            students[2].english;
      System.out.println("�^�妨�Z�`��: " + sum);
   }
}