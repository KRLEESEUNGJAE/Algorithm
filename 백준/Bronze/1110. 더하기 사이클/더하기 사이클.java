import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int cycle = 0;
    int N = Integer.parseInt(br.readLine());
    int newNum = 0;
    String str = Integer.toString(N);
    int first;
    int second;

    while (true) {
      if (cycle != 0 && Integer.parseInt(str) == N) {
        break;
      }
      if (N < 10 && cycle == 0) {
        str = "0" + str;
        String[] arr = str.split("");
        first = Integer.parseInt(arr[0]);
        second = Integer.parseInt(arr[1]);
        newNum = first + second;
      }

      String[] arr = str.split("");
      str = arr[1];
      first = Integer.parseInt(arr[0]);
      second = Integer.parseInt(arr[1]);
      newNum = first + second;

      if (newNum < 10) {
        str += Integer.toString(newNum);
      } else {
        arr = Integer.toString(newNum).split("");
        str += arr[1];
      }
      cycle++;
    }

    System.out.println(cycle);
  }
}
