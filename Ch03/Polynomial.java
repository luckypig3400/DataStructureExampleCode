/* �{���d��: Polynomial.java */ 
class PNode {     // �h������C�`�I���O
   float coef;    // �Y��
   int exp;       // ����
   PNode next;    // ���U�@�Ӹ`�I������
   // �غc�l
   public PNode(float coef, int exp) {
      this.coef = coef;
      this.exp = exp;
      next = null;
   }
};
public class Polynomial {   // �h�����쵲��C���O
   public PNode first;      // ��C���}�Y����
   // �غc�l: �إߦh�����쵲��C
   public Polynomial(float[] array) {
      PNode ptr, newnode;
      first = new PNode(0.0f, -1); // �إ߶}�Y�`�I
      ptr = first;                 // �e�@�Ӹ`�I����
      for ( int i = array.length-1; i >= 0; i-- ) {
         if ( array[i] != 0.0f ) {  // �إ߸`�I����
            newnode = new PNode(array[i], i);
            ptr.next = newnode;    // �s���s�`�I
            ptr = newnode;         // �����e�@�Ӹ`�I
         }
      }
      ptr.next = first;  // �s����1�Ӹ`�I, �إ�������C
   }
   // ��k: ��ܦh������C
   public void printPoly() {
      PNode ptr = first.next;  // ��C�u�����}�Y
      float c;
      int e;
      while ( ptr != first ) { // ��ܥD�j��
         c = ptr.coef;
         e = ptr.exp;
         System.out.print(c + "X^" + e);
         ptr = ptr.next;       // �U�@�Ӹ`�I
         if ( ptr != first ) System.out.print(" + ");
      }
      System.out.println();
   }
}