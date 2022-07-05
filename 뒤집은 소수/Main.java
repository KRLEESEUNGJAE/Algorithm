import java.util.*;

public class Main {
  public boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int temp = arr[i];
      int res = 0;
      while (temp > 0) {
        res = res * 10 + temp % 10;
        temp /= 10;
      }
      if (isPrime(res)) {
        answer.add((res));
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
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}
