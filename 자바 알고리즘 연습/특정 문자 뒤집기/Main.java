import java.util.*;

public class Main {
  public String solution(String str) {
    String answer;

    char[] s = str.toCharArray();
    int lp = 0;
    int rp = str.length() - 1;

    while (lp < rp) {
      if (!Character.isAlphabetic(s[lp]))
        lp++;
      else if (!Character.isAlphabetic(s[rp]))
        rp--;
      else {
        char temp = s[lp];
        s[lp] = s[rp];
        s[rp] = temp;
        lp++;
        rp--;
      }

    }
    answer = String.valueOf(s);

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
