/* �{���d��: Poly.java */
class Term {       // �����O 
   float coef;     // �Y��
   int exp;        // ����
};
public class Poly {         // �h�������O
   public final int MAX_TERMS = 100;  // �̤j���ؼ�
   public static Term[] termArr;   // �h����������}�C
   public static int freePos = 0;  // �i�ί��ަ�m
   public int begin, end;   // �h�������޶}�l�P����
   // �غc�l: �إߦh��������
   public Poly(float[] array) {
      if ( termArr == null ) { // �O�_�w�g�إߪ���}�C
         // �إߦh��������}�C
         termArr = new Term[MAX_TERMS];
         for ( int i = 0; i < termArr.length; i++ )
            termArr[i] = new Term();  // �إ߰}�C����
      }
      begin = freePos;    // �h�����}�l����
      end = freePos - 1;  // �h������������
      for (int i = array.length - 1; i >= 0; i-- )
         if ( array[i] != 0 ) {
            newTerm(array[i], i);   // �s�W������
            end++;
      }
   }
   // ��k: �s�W�h��������
   public void newTerm(float c, int e) {
      if ( freePos > termArr.length ) {
          System.out.println("�h���������ضW�L�d��I");
          return;
      }
      termArr[freePos].coef = c;  // �Y��
      termArr[freePos].exp = e;   // ����
      freePos++;
   }
   // ��k: ��ܦh����
   public void printPoly() {
      float c; int e;
      for (int i = begin; i <= end; i++) {
         c = termArr[i].coef;
         e = termArr[i].exp;
         System.out.print(c + "X^" + e);
         if ( i != end ) System.out.print("+");
      }
      System.out.println();
   }
}