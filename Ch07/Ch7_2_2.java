/* �{���d��: Ch7_2_2.java */
public class Ch7_2_2 { 
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = { {1, 2}, {2, 1},  // ��u�}�C
                       {1, 3}, {3, 1},
                       {2, 3}, {3, 2},
                       {2, 4}, {4, 2},
                       {3, 5}, {5, 3},
                       {4, 5}, {5, 4} };
      Graph_List g = new Graph_List(10, edge);// �إ߹ϧ�
      System.out.println("�ϧ�G���F����C���e: ");
      g.printGraph();  // ��ܹϧ�
   }
}