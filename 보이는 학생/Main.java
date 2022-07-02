import java.util.*;

public class Main {
  public int solution(int n, int[] arr) {
    int answer = 0;
    ArrayList<Integer> temp = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (i == 0) {
        temp.add(arr[i]);
      } else if (arr[i] > temp.get(temp.size() - 1)) {
        temp.add(arr[i]);
      }
    }

    answer = temp.size();

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
