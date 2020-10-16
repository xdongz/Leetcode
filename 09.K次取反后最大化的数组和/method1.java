import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] A = {2,-3,-1,5,-4};
    int K = 2;
    System.out.println(largestSumAfterKNegations(A, K));
  }

  public static int largestSumAfterKNegations(int[] A, int K) {
    int sum = 0;
    for (int i=0; i<K; i++) {
      Arrays.sort(A); //利用Arrays的方法排序
      A[0] = -A[0];
    }

    for (int i: A) sum += i;
    return sum;
  }
}