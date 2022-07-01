import java.util.*;

public class Main {
  public String solution(int n, String str) {
    String answer = "";

    for (int i = 0; i < n; i++) {
      String targetString = str.substring(0, 7).replace("#", "1").replace("*", "0");
      str = str.substring(7);
      int num = Integer.parseInt(targetString, 2);
      answer += (char) num;
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    String str = kb.next();
    kb.close();
    System.out.println(T.solution(n, str));
  }
}
