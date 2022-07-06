import java.util.*;

public class Main {
  public String solution(String str) {
    String answer = "NO";

    str = str.toUpperCase().replaceAll("[^A-Z]", "");
    // System.out.println(str);

    String reverse = new StringBuilder(str).reverse().toString();

    if (str.equals(reverse)) {
      return "YES";
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();
    kb.close();
    System.out.println(T.solution(str));
  }
}
