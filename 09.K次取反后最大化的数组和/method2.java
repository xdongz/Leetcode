public class Main {
  public static void main(String[] args) {
    int[] A = {2,-3,-1,5,-4};
    int K = 2;
    System.out.println(largestSumAfterKNegations(A, K));
  }

  public static int largestSumAfterKNegations(int[] A, int K) {
    //将A从[-100, 100]映射到[0,200]
    int[] numbers = new int[201];
    for (int i:A) {
      numbers[100+i]++; //numbers[j]表示j这个数出现了几次
    }

    int j=0;
    for(int i=0; i<K; i++) {
      while(numbers[j] == 0) {
        j++; //找出最小的数j
      }
      int m = 200-j; //找出这个数字j的相反数
      numbers[m]++; //相反数对应的次数加1
      numbers[j]--; //原来的数字对应的次数减1

      if(j > 100) {
        j = 200-j; //如果原先最小的数是正数，那么它的相反数一定是最小的数；
                   // 但是如果原先最小的数是负数，那么它的相反数不一定是最小的数，所以就不变索引
      }
    }

    int sum = 0;
    for (int i=0; i< numbers.length; i++) {
      sum += (i-100)*numbers[i];
    }
    return sum;
  }

}
