import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    int[] arr = new int[26];
    Arrays.fill(arr, -1);

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      int n = c;
      n = n - 97;

      if (arr[n] != -1) {
        continue;
      }
      arr[n] = i;
    }

    for (int x : arr) {
      System.out.print(x + " ");
    }

  }
}
