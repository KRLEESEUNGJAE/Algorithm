import java.util.*;

public class Main {
  public ArrayList<String> solution(int n, String[] str) {
    ArrayList<String> answer = new ArrayList<>();

    for (String x : str) {
      /*
       * StringBuffer sb = new StringBuffer(x);
       * String reverse = sb.reverse().toString();
       * answer.add(reverse);
       */

      // Todo: reverse 직접구현
      char[] s = x.toCharArray();
      int leftPointer = 0, rightPointer = x.length() - 1;
      while (leftPointer < rightPointer) {
        char temp = s[leftPointer];
        s[leftPointer] = s[rightPointer];
        s[rightPointer] = temp;
        leftPointer++;
        rightPointer--;
      }
      String result = String.valueOf(s);
      answer.add(result);
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String[] str = new String[n];
    for (int i = 0; i < n; i++) {
      str[i] = kb.next();
    }
    for (String x : T.solution(n, str)) {
      System.out.println(x);
    }
  }
}
