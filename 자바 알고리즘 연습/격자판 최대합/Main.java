import java.util.*;

public class Main {
  public int solution(int n, int[][] arr) {
    int answer = 0;
    int temp = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        temp += arr[i][j];
      }
      if (temp > answer) {
        answer = temp;
      }
      temp = 0;
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        temp += arr[j][i];
      }
      if (temp > answer) {
        answer = temp;
      }
      temp = 0;
    }

    for (int i = 0; i < arr.length; i++) {
      temp += arr[i][i];
    }
    if (temp > answer) {
      answer = temp;
    }
    temp = 0;

    for (int i = arr.length - 1; i >= 0; i--) {
      temp += arr[i][i];
    }
    if (temp > answer) {
      answer = temp;
    }
    temp = 0;

    return answer;
  }

  public static void main(String[] args) {
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[][] arr2 = new int[n][n];

    for (int i = 0; i < n; i++) {
      int[] arr = new int[n];
      for (int j = 0; j < n; j++) {
        arr[j] = kb.nextInt();
      }
      arr2[i] = arr;
    }
    kb.close();
    System.out.println(T.solution(n, arr2));
  }
}