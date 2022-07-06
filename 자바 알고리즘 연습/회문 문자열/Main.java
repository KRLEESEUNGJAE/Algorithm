import java.util.*;

public class Main {
  public String solution(String str) {
    String answer = "";
    // String reverse = "";

    String upper = str.toUpperCase();

    // for (int i = upper.length() - 1; i >= 0; i--) {
    // reverse += upper.charAt(i);
    // }
    String reverse = new StringBuilder(upper).reverse().toString();

    System.out.println("upper: " + upper + "\n" + "reverse: " + reverse);

    // for (int i = 0; i < upper.length(); i++) {
    for (int i = 0; i < upper.length() / 2; i++) { // ! 시간 복잡도가 더 낮음
      System.out
          .println("upper.charAt(i): " + upper.charAt(i) + "\n" + "\n" + "reverse.charAt(i): " + reverse.charAt(i));
      if (upper.charAt(i) != reverse.charAt(i)) {
        return "NO";
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
