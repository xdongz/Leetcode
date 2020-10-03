public class Main {
  public static void main(String[] args) {
    int[] nums = new int[] {2,3,5,2};
    System.out.println(GetResult(nums));
  }

  public static int GetResult(int[] nums) {
    int x = nums[0];
    int y = nums[1];
    int m = nums[2];
    int n = nums[3];

    //xb为能去x国的人数，yb为能去y国的人数，t为既能去x国又能去y国的人数
    int xb = 0, yb = 0, t = 0, k = 1;

    while(xb+yb+t < m+n) {
      int rx = k%x;
      int ry = k%y;

      if(rx == 0 && yb<n && ry!=0) {
        yb = yb+1;
      } else if(ry == 0 && xb<m && rx!=0) {
        xb = xb+1;
      } else if (rx!=0 && ry!=0){
        t = t+1;
      }

      k = k+1;
    }
    System.out.println(xb+" "+yb+" "+t);
    return (k-1);
  }
}