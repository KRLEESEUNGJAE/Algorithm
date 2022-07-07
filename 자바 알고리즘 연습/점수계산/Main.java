import java.util.*;

public class Main {
  public int solution(int n, int[] arr) {
    int answer = 0;
    int score = 1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        answer += score;
        score++;
      } else {
        score = 1;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    kb.close();
    System.out.println(T.solution(n, arr));
  }
}
