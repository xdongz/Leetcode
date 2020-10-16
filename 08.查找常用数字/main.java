import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] A = {"bella","label","roller"};
    System.out.println(commonChars(A));
  }

  public static List<String> commonChars(String[] A) {

    System.out.println(A[0].charAt(0));
    int size = A.length;
    System.out.println(size);

    int[] startArr = new int[26];
    for(int i=0; i<A[0].length(); i++) {
      startArr[A[0].charAt(i)-'a']++;
    }

    for (int j=1; j<A.length; j++) {
      int[] count = new int[26];
      for (int m=0; m<A[j].length(); m++) {
        count[A[j].charAt(m)-'a']++;
      }

      for (int n=0; n<26; n++) {
        if (count[n] < startArr[n]) {
          startArr[n] = count[n];
        }
      }
    }

    List<String> result = new ArrayList<>();

    for (int i=0; i<startArr.length; i++) {
      while (startArr[i]-- > 0) {
        result.add((char)(i + 'a')+"");
      }
    }
    return result;
  }
}
