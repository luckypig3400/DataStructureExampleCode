/* �{���d��: Ch3_1_1.java */ 
abstract class Shape {   // Shape��H���O�ŧi
   // �������
   public double x;   // X�y��
   public double y;   // y�y��
   // ��H��k: �p�⭱�n
   abstract void area();
}
class Circle extends Shape {  // Circle���O�ŧi
   // �������
   public double r;   // �b�|
   // �غc�l
   public Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // ������k: ��@��H��karea()
   public void area() {
      System.out.println("�ꭱ�n: " + 3.1416*r*r);
   }
}
// �D�{�����O
public class Ch3_1_1 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiCircle���O���A���ܼ�, �åB�إߪ���
      Circle c = new Circle(5.0, 10.0, 4.0);
      // ��ܶ��c�����
      System.out.println("���c����� =====");
      System.out.println("X�y��: " + c.x);
      System.out.println("Y�y��: " + c.y);
      System.out.println("�b�|: " + c.r);
      // �I�s���󪺹�Ҥ�k
      c.area();
   }
}