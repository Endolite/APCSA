class Main 
{
  public static void main(String[] args) 
  {
    int[][] mult = new int[10][12]; //[r][c]
    String[][] seatingChart = new String[5][5];

    mult[0][0] = 0; 
    mult[1][0] = 1;

    seatingChart[0][0] = "John Smith";

    String temp = seatingChart[0][0];
    System.out.println(temp);

    int num = mult[1][0];
    System.out.println(num);

    int[][] nums = {{2, 4, 6}, {1, 3, 5}, {1, 2, 3}};
    System.out.println(nums[0][2]); //starts indexing at 0
    
    int[][] scores = new int[20][31];
    System.out.println(scores.length); //number of rows
    System.out.println(scores[0].length); //number of columns

    int[][][] nums1 = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}, {{13, 14, 15}, {16, 17, 18}}};
    System.out.println(nums1[0][1][2]);
    for (int x = 0; x < nums1.length; x++)
    {
      for (int y = 0; y < nums1[0].length; y++)
      {
        for (int z = 0; z < nums1[0][0].length; z++)
        {
          System.out.print(nums1[x][y][z] + " ");
        }
        System.out.println();
      }
      System.out.println("next");
    }

    double[][] temps =  {{97.0, 99.1, 98.2, 89.5}, {98.1, 52.6, 75.0, 67.3}, {97.6, 37.2, 87.5, 49.6}};
    for (int r = 0; r < temps.length; r++)
    {
      for (int c = 0; c < temps[0].length; c++)
      {
        System.out.print(temps[r][c] + " ");
      }
      System.out.println();
    }
  }
}