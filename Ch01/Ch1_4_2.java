/* �{���d��: Ch1_4_2.java */
class Vehicle {     // Vehicle���O�ŧi 
   private String name;    // �����W��
   private double price;   // ����
   // �غc�l
   public Vehicle(String name, double price) {
      this.name = name;
      this.price = price;
   }
   // ��k: ��ܥ�q�u�㪺���
   public void printVehicle() {
      // ��ܥ�q�u�㪺���
      System.out.println("����: " + name);
      System.out.println("����: " + price);
   } 
}
class Car extends Vehicle { // Car���O�ŧi
   private int doors;       // �X����
   // �غc�l
   public Car(String name, double price, int doors) {
      super(name, price);   // �I�s�����O���غc�l
      this.doors = doors;
   }
   // ��k: ����⨮���
   public void printCar() {
      // ����⨮���
      System.out.println("====�⨮���====");
      printVehicle();       // �I�s�����O��������k
      System.out.println("�����X��: " + doors);
   } 
}
// �D���O
public class Ch1_4_2 {
   // �D�{��
   public static void main(String[] args) {
      // �ŧiCar���O���A���ܼ�, �åB�إߪ���
      Car nissan = new Car("Sentra180", 49.9,4);
      Car honda = new Car("Civil", 55, 2); 
      nissan.printCar();       // ����⨮���
      honda.printCar();
   }
}