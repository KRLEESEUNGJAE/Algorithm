import java.util.*;

public class Main {
  public String solution(int n, String str) {
    String answer = "";

    System.out.println("this is int: " + n + "this is str: " + str);

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
