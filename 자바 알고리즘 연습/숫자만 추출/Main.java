import java.util.*;

public class Main {
  public int solution(String str) {
    int answer = 0;

    str = str.toUpperCase().replaceAll("[^0-9]", "");

    answer = Integer.parseInt(str);

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
