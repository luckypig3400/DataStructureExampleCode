/* �{���d��: Ch4_5.java */
public class Ch4_5 { 
   // ���j��k: �e������D
   static void hanoiTower(int dishs, int peg1, 
                          int peg2, int peg3) {
      if ( dishs == 1 )  // �פ����
         System.out.println("�L�l�q "+peg1+"���� "+peg3);
      else {
         hanoiTower(dishs-1,peg1,peg3,peg2); // ��1�B�J
         System.out.println("�L�l�q "+peg1+"���� "+peg3);
         hanoiTower(dishs-1,peg2,peg1,peg3); // ��3�B�J
      }     
   }
   // �D�{��
   public static void main(String[] args) {   
      // �ܼƫŧi
      int dishs = 3;  // �L�l��
      // �I�s���j��k
      hanoiTower(dishs, 1, 2, 3); 
   }
}