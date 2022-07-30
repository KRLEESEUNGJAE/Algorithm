import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int C = Integer.parseInt(br.readLine());
    for (int i = 0; i < C; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int[] arr = new int[N];
      double sum = 0;
      for (int j = 0; j < N; j++) {
        arr[j] = Integer.parseInt(st.nextToken());
      }
      for (int x : arr) {
        sum += x;
      }
      double avg = sum / N;
      double count = 0;
      for (int x : arr) {
        if (x > avg) {
          count++;
        }
      }
      double temp = (count / N) * 100;
      sb.append(String.format("%.3f", temp) + "%\n");
    }

    System.out.println(sb.toString());
  }
}
