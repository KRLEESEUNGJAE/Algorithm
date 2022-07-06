import java.util.*;

public class Main {
  public String solution(int n, int[] arrA, int[] arrB) {
    String answer = "";

    for (int i = 0; i < n; i++) {
      if (arrA[i] == arrB[i]) {
        answer = answer + "D";
      } else if ((arrA[i] == 2 && arrB[i] == 1) || (arrA[i] == 3 && arrB[i] == 2) || (arrA[i] == 1 && arrB[i] == 3)) {
        answer = answer + "A";
      } else {
        answer = answer + "B";
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arrA = new int[n];
    int[] arrB = new int[n];
    for (int i = 0; i < n; i++) {
      arrA[i] = kb.nextInt();
    }
    for (int i = 0; i < n; i++) {
      arrB[i] = kb.nextInt();
    }
    kb.close();
    for (String x : T.solution(n, arrA, arrB).split("")) {
      System.out.println(x);
    }
  }
}
