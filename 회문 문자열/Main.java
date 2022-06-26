import java.util.*;

public class Main {
  public String solution(String str) {
    String answer = "";
    String reverse = "";

    String upper = str.toUpperCase();

    for (int i = upper.length() - 1; i >= 0; i--) {
      reverse += upper.charAt(i);
    }

    System.out.println("upper: " + upper + "\n" + "reverse: " + reverse);

    for (int i = 0; i < upper.length(); i++) {
      if (upper.charAt(i) != reverse.charAt(i)) {
        answer = "NO";
      } else {
        answer = "YES";
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    kb.close();
    System.out.println(T.solution(str));
  }
}
