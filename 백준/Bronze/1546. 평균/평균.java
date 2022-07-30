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
    int N = Integer.parseInt(br.readLine());
    float[] arr = new float[N];
    float max = 0;
    float sum = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Float.parseFloat(st.nextToken());
    }

    Arrays.sort(arr);
    max = arr[arr.length - 1];

    for (float x : arr) {
      x = x / max * 100;
      sum += x;
    }

    System.out.println(sum / N);

  }
}
