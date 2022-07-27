import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    String[] arr = new String[N];

    for (int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }

    for (int i = 0; i < N; i++) {
      int score = 0;
      int sum = 0;
      for (int j = 0; j < arr[i].length(); j++) {
        if (arr[i].charAt(j) == 'O') {
          score++;
        } else {
          score = 0;
        }
        sum += score;
      }
      System.out.println(sum);
    }
  }
}
