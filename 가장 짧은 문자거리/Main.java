import java.util.*;

public class Main {
  public int[] solution(String str, char c) {
    int[] answer = new int[str.length()];
    int distance1 = 101;

    char[] charArray = str.toCharArray();

    // Todo: 왼쪽에서 오른쪽으로
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == c) {
        distance1 = 0;
        answer[i] = distance1;
      } else {
        distance1++;
        answer[i] = distance1;
      }
    }

    // Todo: 오른쪽에서 왼쪽으로
    int distance2 = 101;

    for (int i = charArray.length - 1; i >= 0; i--) {
      if (charArray[i] == c) {
        distance2 = 0;
        answer[i] = distance2;
      } else {
        distance2++;

        if (answer[i] > distance2) {
          answer[i] = distance2;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char c = kb.next().charAt(0);
    kb.close();
    for (int x : T.solution(str, c))
      System.out.print(x + " ");
  }
}
