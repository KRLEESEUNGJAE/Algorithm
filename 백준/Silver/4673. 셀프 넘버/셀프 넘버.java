import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    boolean[] arr = new boolean[10001];

    for (int i = 1; i < 10001; i++) {
      int temp = isNotSelfNum(i);

      if (temp < 10001) {
        arr[temp] = true;
      }
    }

    for (int i = 1; i < 10001; i++) {
      if (!arr[i]) {
        sb.append(i).append("\n");
      }
    }

    System.out.println(sb);
  }

  public static int isNotSelfNum(int num) {
    int result = num;

    while (num != 0) {
      result = result + (num % 10);
      num = num / 10;
    }

    return result;
  }
}
