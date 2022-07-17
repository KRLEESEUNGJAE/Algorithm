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
    int[][] arr = new int[N][N];
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, 1, 0, -1 };
    int answer = 0;

    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        boolean bool = true;
        for (int k = 0; k < 4; k++) {
          int nx = i + dx[k];
          int ny = j + dy[k];
          if (nx >= 0 && nx < N && ny >= 0 && ny < N && arr[nx][ny] >= arr[i][j]) {
            bool = false;
            break;
          }
        }
        if (bool)
          answer++;
      }
    }

    bw.write(answer + "");

    br.close();

    bw.flush();
    bw.close();
  }
}