class Main {
  public static void main(String[] args) {
    int[] nums1 = new int[5];
    int[] nums2 = { 1, 2, 3, 4, 5, 6 };
    double[] nums3 = new double[4];
    double[] nums4 = { 1.4, 12.1, 13.1 };
    String[] str1 = new String[3];
    String[] str2 = { "hi", "hello", "hey", "yo" };
    boolean[] bool1 = new boolean[5];
    boolean[] bool2 = { false, true, true, false };

    nums1[3] = 7;
    nums1[1] = 3;
    nums1[0] = 4;
    nums1[3] = 10;
    System.out.println(nums1[3]);
    // num1[5] = 88; ArrayIndexOutOfBoundsException

    System.out.println(nums2.length);
  }
}