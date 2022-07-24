import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N + 1][6];
    int max = 0;
    int answer = 0;

    StringTokenizer st;

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= 5; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 1; i <= N; i++) {
      int count = 0;
      for (int j = 1; j <= N; j++) {
        for (int k = 1; k <= 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            count++;
            break;
          }
        }
      }
      if (count > max) {
        max = count;
        answer = i;
      }
    }
    bw.write(answer + "");

    br.close();

    bw.flush();
    bw.close();
  }
}