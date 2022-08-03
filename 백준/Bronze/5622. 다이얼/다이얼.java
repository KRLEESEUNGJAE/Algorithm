import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // StringTokenizer st = new StringTokenizer(br.readLine());
    String str = br.readLine();
    int sum = 0;

    int[] arr = new int[26];
    for (int i = 1; i <= arr.length; i++) {
      if (i == 1 | i == 2 | i == 3) {
        arr[i - 1] = 3;
      } else if (i == 4 | i == 5 | i == 6) {
        arr[i - 1] = 4;
      } else if (i == 7 | i == 8 | i == 9) {
        arr[i - 1] = 5;
      } else if (i == 10 | i == 11 | i == 12) {
        arr[i - 1] = 6;
      } else if (i == 13 | i == 14 | i == 15) {
        arr[i - 1] = 7;
      } else if (i == 16 | i == 17 | i == 18 | i == 19) {
        arr[i - 1] = 8;
      } else if (i == 20 | i == 21 | i == 22) {
        arr[i - 1] = 9;
      } else if (i == 23 | i == 24 | i == 25 | i == 26) {
        arr[i - 1] = 10;
      }
    }

    for (int i = 0; i < str.length(); i++) {
      int index = (int) str.charAt(i) - 65;
      sum += arr[index];
    }

    System.out.println(sum);
  }
}