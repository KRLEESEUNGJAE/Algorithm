import java.util.*;

public class Main {
  public String solution(String str) {
    String answer = "";
    str += " ";
    int count = 1;

    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        count++;
      } else {
        answer += str.charAt(i);
        if (count > 1) {
          answer += count;
        }
        count = 1;
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
