/* �{���d��: Ch7_4_2m.java */
public class Ch7_4_2m { 
   // �D�{��
   public static void main(String[] args) {
      int edge[][] = {{1, 2,  2},  // �[�v��u�}�C
                      {1, 3,  5},
                      {2, 4, 16},
                      {3, 2,  6},
                      {4, 5,  9},
                      {5, 3, 10},
                      {6, 3, 20}};
      AdjacencyMatrix g = new AdjacencyMatrix(7, edge);  // �إ߹ϧ�
      System.out.println("�ϧ�G9���F���x�}���e: ");
      g.printGraph();  // ��ܹϧ�
   }
}