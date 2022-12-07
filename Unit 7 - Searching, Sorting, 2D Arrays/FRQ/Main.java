
/*
Write a method called mirror that accepts a two-dimensional array and returns a new two-dimensional array that mirrors the right side of the array to the left side of the array down the middle vertically.  You can assume that the array will alway have an even number of columns.  

arr                          Returned

{1, 2, 3, 5, 7, 3}      {3, 7, 5, 5, 7, 3}

{4, 4, 4, 0, 6, 5}      {5, 6, 0, 0, 6, 5}  

{9, 2, 8, 0, 3, 6}      {6, 3, 0, 0, 3, 6} 

{3, 2, 1, 0, 2, 2}      {2, 2, 0, 0, 2, 2} 

The method header is provided below.  Be sure to include the method header in your answer.  If you don't, 5 points will be deducted.
*/
class Main {
  public static void main(String[] args) {
    int[][] arr1 = { { 1, 2, 3, 5, 7, 3 }, { 4, 4, 4, 0, 6, 5 }, { 9, 2, 8, 0, 3, 6 }, { 3, 2, 1, 0, 2, 2 } };
    int[][] arr2 = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
    for (int r[] : arr1) {
      for (int c : r) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
    System.out.println();
    mirror(arr1);
    mirror(arr2);
    for (int r[] : arr1) {
      for (int c : r) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
    System.out.println();
    for (int r[] : arr2) {
      for (int c : r) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }

  public static int[][] mirror(int[][] arr) {
    for (int r = 0; r < arr.length; r++) {
      for (int i = 0; i < arr[0].length / 2; i++) {
        arr[r][i] = arr[r][arr[0].length - 1 - i];
      }
    }
    return arr;
  }
}