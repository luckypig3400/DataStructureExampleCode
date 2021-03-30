/* �{���d��: Ch3_1_2.java */ 
abstract class Shape {  // Shape��H���O�ŧi
   // �������
   public double x;   // X�y��
   public double y;   // Y�y��
}
interface AreaInterface {   // AreaInterface�����ŧi
   // �`�ƪ��ŧi
   final double PI = 3.1415926;
   // ������k: �p�⭱�n
   void area();
}
// Circle���O�ŧi
class Circle extends Shape implements AreaInterface {
   // �������
   private double r;     // �b�|
   // �غc�l
   public Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   // ��@AreaInterface��������karea()
   public void area() {
      System.out.println("X�y��: " + x);
      System.out.println("Y�y��: " + y);
      System.out.println("��b�|: " + r);
      System.out.println("�ꭱ�n: " + PI*r*r);
   }
}
// �D�{�����O
public class Ch3_1_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiCircle���O���A���ܼ�, �åB�إߪ���
      Circle c = new Circle(5.0, 5.0, 8.0);
      // �I�s���󪺤�����karea()
      c.area();
      // ��ܤ������`�ƭ�
      System.out.println("PI�`��: "+AreaInterface.PI);
   }
}