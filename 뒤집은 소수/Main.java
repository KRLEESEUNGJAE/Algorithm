import java.util.*;

public class Main {
  public int[] solution(int n, int[] arr) {
    int[] answer = arr;

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
    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}
