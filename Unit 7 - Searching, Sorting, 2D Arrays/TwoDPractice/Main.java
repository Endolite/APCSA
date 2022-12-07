class Main {
  public static void main(String[] args) {
    int [][] test1 = {
      {1,2,34,3,3},
      {2,5,99,3,2},
      {1,2,6,83,3}
    };
    int [][] test2 = {
      {1,2,4},
      {0,3,4},
      {1,4,2}
    };

    // COMMENT IN WHEN READY TO TEST 
    System.out.println(max(test1)); // 99
    System.out.println(rowSum(test1, 1)); // 111
    System.out.println(isRowMagic(test1)); // false
    System.out.println(isRowMagic(test2)); // true
    System.out.println(isAlmostRowMagic(test1, 100));
    System.out.println(isAlmostRowMagic(test2, 5));
  }
    // 1. Write a method that returns the maximum value in the 2D array (parameter)
    // 2. Write a method that returns the sum of the elements in row x of a. 
    // 3. Write a method that checks if the array is row-magic 
    // (this means that every row has the same row sum).
    
    // 1. 
    public static int max(int[][] a) { 
      int max = a[0][0];
      for (int[] x : a)
      {
        for (int y : x)
        {
          if (y > max)
          {
            max = y;
          }
        }
      }
      return max;
    }
    //2.
    public static int rowSum(int[][] a, int x) {
      int sum = 0;
      for (int i : a[x])
      {
        sum += i;
      }
      return sum;
    }
    //3.
    public static boolean isRowMagic(int[][] a) {
      int[] sum = new int[a.length];
      boolean ans = true;
      for (int r = 0; r < a.length; r++)
      {
        sum[r] += rowSum(a, r);
      }
      for (int i = 0; i < sum.length - 1; i++)
      {
        if (sum[i] != sum[i + 1])
        {
          ans = false;
        }
      }
      return ans;
    }
    public static boolean isAlmostRowMagic(int[][] a, int margin)
    {
      boolean ans = true;
      int temp = rowSum(a, 0);
      for (int r = 1; r < a.length; r++)
      {
        if (Math.abs(rowSum(a, r) - temp) > margin)
        {
          ans = false;
        }
      }
      return ans;
    }
}