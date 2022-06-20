import java.util.*;

public class Main {

  public String solution(String str) {
    String answer = "";
    // int largest = 0;
    int largest = Integer.MIN_VALUE;

    String[] arr = str.split(" ");
    // System.out.println("length: " + arr.length);
    // System.out.println(Arrays.toString(arr));
    for (String x : arr) {
      if (x.length() > largest) {
        largest = x.length();
        answer = x;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    System.out.println(T.solution(str));
  }
}
